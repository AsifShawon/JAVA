import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
 
/**
 * Snake:
 * Steer snake using arrow keys. Eat numbers to grow in length.
 * Space bar toggles pause. Game over when you bump into something.
 * When the length gets to 200 the speed increases slightly.
 * 
 * Future enhancement:
 * Use a backing image for grid to make paint operation more
 * efficient. Paint currently works on my machine but may have
 * difficulties on slower machines (perhaps not?).
 * 
 * Another "future" would be to record "events" during play so
 * that game could be re-played at a higher speed. Possibly
 * save/load games.
 * 
 * @author Carey Brown
 */
 
public class Snake
implements Runnable
{
    private static final int        COLS = 20;
    private static final int        ROWS = 20;
    private static final int        CELL_SIZE = 30;
    private static final int        INIT_BODY_LEN = 5;
    private static final int        QTY_NUMBERS = 5;
    private static final int        SPEED_START = 700; // milliseconds
    private static final int        SPEED_FASTER = 500;
    private static final Color      COLOR_HEAD = Color.blue;
    private static final Color      COLOR_BODY = new Color( 0x7777ff ); // light blue
    private static final Color      COLOR_GRID_LINES = Color.blue;
    private static final Color      COLOR_NUMBER = Color.black;
    private static final Random     RAND = new Random();
    private static final Font       FONT_DIGIT = new Font( "ARIAL", Font.BOLD, 26 );
     
    enum Direction
    {
        NORTH(0,-1), SOUTH(0,1), EAST(1,0), WEST(-1,0); 
        XY          incr;
        private Direction( int incrX, int incrY )
        {
            incr = new XY( incrX, incrY );
        }
        public XY getIncr() { return incr; }
    }
     
    JFrame              frame;
    private JMenuBar    menuBar;
    private JMenu       homeMenu;
    private JMenuItem   exitMenuItem;
    private JMenuItem   newGameMenuItem;
    GridPanel           gridPanel;
    XY                  headPosition;
    XY                  tailPosition;
    Direction           headDirection;
    Direction           tailDirection;
    int                 growthRemaining;
    int                 totalLength;
    int                 speed;
    boolean             isGameOver;
    boolean             isPaused;
    Cells               cells;
    Direction           directionPending = null;
    ActionListener      timerActionListener;
 
    //----------------------------------------------------------------------
    public static void main( String[] args )
    {
        Snake       game = new Snake();
        EventQueue.invokeLater( game );
    }
 
    //----------------------------------------------------------------------
    @Override
    public void run()
    {
        initGui();
        initSnake();
        initCells();
        initNumbers();
        start();
    }
     
    //----------------------------------------------------------------------
    private void initGui()
    {
        frame = new JFrame( "Snake" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        {
            homeMenu = new JMenu();
            menuBar.add(homeMenu);
            homeMenu.setText("Home");
            {
                newGameMenuItem = new JMenuItem();
                homeMenu.add(newGameMenuItem);
                newGameMenuItem.setText("New game");
                newGameMenuItem.setAction( new AbstractAction( "New Game" )
                {
                    private static final long serialVersionUID = 1L;
 
                    @Override
                    public void actionPerformed( ActionEvent arg0 )
                    {
                        initSnake();
                        initCells();
                        initNumbers();
                        start();
                    }
                }
                );
            }
            {
                exitMenuItem = new JMenuItem();
                homeMenu.add(exitMenuItem);
                exitMenuItem.setText("Exit");
                exitMenuItem.setAction( new AbstractAction( "Exit" )
                {
                    private static final long serialVersionUID = 1L;
 
                    @Override
                    public void actionPerformed( ActionEvent e )
                    {
                        frame.dispose();
                    }
                }
                );
            }
        }
         
        gridPanel = new GridPanel();
        frame.add( gridPanel );
         
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setResizable( false );
        frame.setVisible( true );
    }
     
    //----------------------------------------------------------------------
    private void initSnake()
    {
        int         len1, len2;
        len1 = INIT_BODY_LEN;
        len2 = len1 << 1;
        headPosition = new XY(
                RAND.nextInt( COLS-len2 ) + len1, RAND.nextInt( ROWS-len2 ) + len1 );
        headDirection = Direction.values()[ RAND.nextInt(4) ];
         
        tailPosition = new XY( headPosition );
        tailDirection = headDirection;
         
        tailPosition = tailPosition.minus( headDirection.getIncr().mult( INIT_BODY_LEN ) );
         
        growthRemaining = 0;
        totalLength = INIT_BODY_LEN + 1;
         
        speed = SPEED_START;
    }
     
    //----------------------------------------------------------------------
    private void initCells()
    {
        cells = new Cells( ROWS, COLS );
         
        cells.set( new HeadCell( headPosition, headDirection ) );
         
        XY      next = new XY( headPosition );
        for( int i = INIT_BODY_LEN ; --i >= 0 ; )
        {
            next = next.minus( headDirection.getIncr() );
            cells.set( new BodyCell( next, headDirection, headDirection ) );
        }
    }
     
    //----------------------------------------------------------------------
    private void initNumbers()
    {
        createRandomNumberCells( QTY_NUMBERS );
    }
     
    //----------------------------------------------------------------------
    private List<XY> getListOfEmptyCells()
    {
        List<XY>  list = new ArrayList<>();
        for( int y = 0 ; y < ROWS ; y++ )
            for( int x = 0 ; x < COLS ; x++ )
            {
                Cell    cell = cells.getRowCol( y, x );
                if( cell instanceof EmptyCell )
                    list.add( cell.pos );
            }
        return list;
    }
     
    //----------------------------------------------------------------------
    private boolean createRandomNumberCells( int qty )
    {
        List<XY>  list = getListOfEmptyCells();
        qty = Math.min( qty, list.size() );
        if( qty == 0 )
            return false;
 
        while( --qty >= 0 )
        {
            int         i = RAND.nextInt( list.size() );
            cells.set( new NumberCell( list.get( i ), RAND.nextInt(9)+1 ) );
            list.remove( i );
        }
        return true;
    }
     
    //----------------------------------------------------------------------
    private void move()
    {
        if( directionPending != null )
        {
            headDirection = directionPending;
            directionPending = null;
        }
         
        if( isPaused )
            return;
 
        XY          prevHead = new XY( headPosition );
        headPosition = headPosition.plus( headDirection.getIncr() );
         
        if( headPosition.isOutOfBounds( 0, 0, COLS, ROWS ) ||
            cells.get( headPosition ) instanceof BodyCell )
        {
            isGameOver = true;
            frame.setTitle( String.format( "GAME OVER!   Length: %,d", totalLength ) );
            java.awt.Toolkit.getDefaultToolkit().beep();     
        }
        else
        {
            Direction   prevDirection = cells.get( prevHead ).direction;
            if( growthRemaining > 0 )
            {
                growthRemaining--;
                totalLength++;
                frame.setTitle( String.format( "Length: %,d", totalLength ) );
            }
            else
            {
                Direction   prevTailDirection = cells.get( tailPosition ).direction;
                cells.set( new EmptyCell( tailPosition ) );
                if( prevTailDirection != null )
                    tailDirection = prevTailDirection;
                tailPosition = tailPosition.plus( tailDirection.getIncr() );
            }
 
            cells.set( new BodyCell( prevHead, headDirection, prevDirection ) );
 
            if( cells.get( headPosition ) instanceof NumberCell )
            {
                growthRemaining += cells.get( headPosition ).n;
                createRandomNumberCells( 1 );
            }
            else if( ! ( cells.get( headPosition ) instanceof EmptyCell ) )
            {
                isGameOver = true;
                frame.setTitle( String.format( "GAME OVER!   Length: %,d", totalLength ) );
                java.awt.Toolkit.getDefaultToolkit().beep();     
            }
 
            if( ! isGameOver )
            {
                cells.set( new HeadCell( headPosition, headDirection ) );
            }
        }
 
        gridPanel.repaint();
    }
     
    //----------------------------------------------------------------------
    private void start()
    {
        directionPending = null;
        isGameOver = false;
        isPaused = false;
 
        timerActionListener = new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                move();
                if( isGameOver )
                {
                    ((Timer)e.getSource()).stop();
                    isPaused = false;
                }
                if( speed == SPEED_START && totalLength > (ROWS*COLS/2) )
                {
                    ((Timer)e.getSource()).stop();
                    speed = SPEED_FASTER;
                    new Timer( speed, timerActionListener ).start();
                }
            }
        };
        new Timer( speed, timerActionListener ).start();
    }
     
    //======================================================================
    @SuppressWarnings("serial")
    class GridPanel
    extends JPanel
    {
        public GridPanel()
        {
            Dimension       dim = new Dimension( COLS * CELL_SIZE + 1, ROWS * CELL_SIZE + 1 );
            setPreferredSize( dim );
            setMinimumSize( dim );
            setMaximumSize( dim );
             
            keyBind( KeyEvent.VK_UP,    "NORTH", new DirectionAction( Direction.NORTH ) );
            keyBind( KeyEvent.VK_DOWN,  "SOUTH", new DirectionAction( Direction.SOUTH ) );
            keyBind( KeyEvent.VK_LEFT , "WEST" , new DirectionAction( Direction.WEST  ) );
            keyBind( KeyEvent.VK_RIGHT, "EAST" , new DirectionAction( Direction.EAST  ) );
            keyBind( KeyEvent.VK_SPACE, "SPACE", new PauseAction() );
        }
         
        //----------------------------------------------------------------------
        private void keyBind( int keyCode, String name, Action action )
        {
            getInputMap().put( KeyStroke.getKeyStroke(keyCode,0,false), name );
            getActionMap().put( name, action );
        }
         
        //----------------------------------------------------------------------
        public void paintComponent( Graphics g )
        {
            super.paintComponent( g );
             
            Graphics2D      g2d = (Graphics2D)g;
             
            g.setColor( COLOR_GRID_LINES );
            for( int r = 0 ; r <= ROWS ; r++ )
                g.drawLine( 0, r*CELL_SIZE, COLS*CELL_SIZE, r*CELL_SIZE );
            for( int c = 0 ; c <= COLS ; c++ )
                g.drawLine( c*CELL_SIZE, 0, c*CELL_SIZE, ROWS*CELL_SIZE );
             
            for( int r = 0 ; r < ROWS ; r++ )
                for( int c = 0 ; c < COLS ; c++ )
                    cells.getRowCol( r, c ).draw( g2d );
        }
         
        //----------------------------------------------------------------------
        private class DirectionAction
        extends AbstractAction
        {
            Direction           direction;
             
            public DirectionAction( Direction direction )
            {
                this.direction = direction;
            }
             
            public void actionPerformed( ActionEvent evt )
            {
                if( directionPending == null )
                    directionPending = direction;
            }
        }
         
        //----------------------------------------------------------------------
        private class PauseAction
        extends AbstractAction
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                java.awt.Toolkit.getDefaultToolkit().beep();     
                if( isPaused )
                {
                    frame.setTitle( String.format( "Length: %,d", totalLength ) );
                    isPaused = false;
                }
                else
                {
                    frame.setTitle( String.format( "<< PAUSED >>   Length: %,d", totalLength ) );
                    isPaused = true;
                }
            }
        }
    }
     
    //======================================================================
    static class Cell
    {
        XY              pos;
        Direction       direction;
        Direction       prevDirection;  // from the body cell before
        int             n; // number to eat
        Color           color;
         
        public Cell( XY pos )
        {
            this.pos = pos;
            prevDirection = null;
        }
         
        public Cell( XY pos, int n )
        {
            this.pos = pos;
            this.n = n;
            prevDirection = null;
        }
         
        public Cell( XY pos, Direction direction, Direction prevDirection )
        {
            this.pos = pos;
            this.direction = direction;
            this.prevDirection = prevDirection;
        }
         
        public void draw( Graphics2D g2d )
        {
        }
    }
     
    static class EmptyCell
    extends Cell
    {
        public EmptyCell( XY pos )
        {
            super( pos );
        }
    }
     
    static class HeadCell
    extends Cell
    {
        public HeadCell( XY pos, Direction direction )
        {
            super( pos, direction, null );
            color = COLOR_HEAD;
        }
         
        @Override
        public void draw( Graphics2D g2d )
        {
            g2d.setColor( color );
            g2d.fillOval( pos.x*CELL_SIZE+1, pos.y*CELL_SIZE+1, CELL_SIZE-2, CELL_SIZE-2 );
        }
    }
     
    static class BodyCell
    extends Cell
    {
        public BodyCell( XY pos )
        {
            super( pos );
            color = COLOR_BODY;
        }
         
        public BodyCell( XY pos, Direction direction, Direction prevDirection )
        {
            super( pos, direction, prevDirection );
            color = COLOR_BODY;
        }
         
        @Override
        public void draw( Graphics2D g2d )
        {
            g2d.setColor( color );
             
//          originally just drew circles for the bodies
//          g2d.fillOval( pos.x*CELL_SIZE+1, pos.y*CELL_SIZE+1, CELL_SIZE-2, CELL_SIZE-2 );
             
            int         half = CELL_SIZE >> 1;
            if( prevDirection == null || prevDirection == direction )
            {
                if( direction == Direction.NORTH || direction == Direction.SOUTH )
                    g2d.fillRect( pos.x*CELL_SIZE + half - 3, pos.y*CELL_SIZE +1, 7, CELL_SIZE-1  );
                else
                    g2d.fillRect( pos.x*CELL_SIZE + 1, pos.y*CELL_SIZE + half - 3, CELL_SIZE - 1, 7  );
            }
            else
            {
                int     shortsize = 7;  // line width
                int     longsize = CELL_SIZE-half+4;
                XY      p = new XY( pos.x*CELL_SIZE + half - 3, pos.y*CELL_SIZE + half - 3 );
                if( prevDirection == Direction.NORTH && direction == Direction.EAST ||
                    prevDirection == Direction.WEST  && direction == Direction.SOUTH )
                {
                    g2d.fillRect( p.x, p.y, shortsize, longsize );
                    g2d.fillRect( p.x, p.y, longsize, shortsize );
                }
                else if( prevDirection == Direction.NORTH && direction == Direction.WEST ||
                        prevDirection == Direction.EAST  && direction == Direction.SOUTH )
                {
                    g2d.fillRect( pos.x*CELL_SIZE, p.y, longsize, shortsize );
                    g2d.fillRect( p.x, pos.y*CELL_SIZE+half-3, shortsize, longsize );
                }
                else if( prevDirection == Direction.SOUTH && direction == Direction.EAST ||
                        prevDirection == Direction.WEST   && direction == Direction.NORTH )
                {
                    g2d.fillRect( p.x, pos.y*CELL_SIZE, shortsize, longsize );
                    g2d.fillRect( p.x, p.y, longsize, shortsize );
                }
                else if( prevDirection == Direction.SOUTH && direction == Direction.WEST ||
                        prevDirection == Direction.EAST   && direction == Direction.NORTH )
                {
                    g2d.fillRect( p.x, pos.y*CELL_SIZE, shortsize, longsize );
                    g2d.fillRect( pos.x*CELL_SIZE, p.y, longsize, shortsize );
                }
            }
        }
    }
     
    static class NumberCell
    extends Cell
    {
        public NumberCell( XY pos, int n )
        {
            super( pos, n );
            color = COLOR_NUMBER;
        }
         
        @Override
        public void draw( Graphics2D g2d )
        {
            g2d.setColor( color );
            g2d.setFont( FONT_DIGIT );
            String          str = String.valueOf( n );
            FontMetrics     metrics = g2d.getFontMetrics();
            Rectangle2D     rect = metrics.getStringBounds( str, g2d );
            int             x = ( CELL_SIZE + 1 - (int)rect.getWidth() ) / 2;
            int             y = ( CELL_SIZE + 1 - (int)rect.getHeight() ) / 2
                                + metrics.getAscent();
            g2d.drawString( str, pos.x * CELL_SIZE + x, pos.y * CELL_SIZE + y );
        }
    }
     
    //======================================================================
    static class Cells
    {
        Cell[][]        cells;
         
        public Cells( int rows, int cols )
        {
            cells = new Cell[ rows ][ cols ];
             
            for( int y = 0 ; y < ROWS ; y++ )
                for( int x = 0; x < COLS ; x++ )
                    cells[ y ][ x ] = new EmptyCell( new XY( x, y ) );
        }
         
        public Cell get( XY p )
        {
            return cells[ p.y ][ p.x ];
        }
         
        public Cell getRowCol( int r, int c )
        {
            return cells[ r ][ c ];
        }
         
        public void  set( Cell cell )
        {
            XY          p = cell.pos;
            cells[ p.y ][ p.x ] = cell;
        }
         
        public void  set( XY p, Cell cell )
        {
            cells[ p.y ][ p.x ] = cell;
        }
    }
}
      
//======================================================================
class XY
{
    int             x, y;
     
    public XY( int x, int y )
    {
        this.x = x;
        this.y = y;
    }
     
    public XY( XY p )
    {
        x = p.x;
        y = p.y;
    }
     
    public XY plus( XY p )
    {
        return new XY( x + p.x, y + p.y );
    }
     
    public XY minus( XY p )
    {
        return new XY( x - p.x, y - p.y );
    }
     
    public XY mult( int n )
    {
        return new XY( x * n, y * n );
    }
     
    public boolean isOutOfBounds( int x1, int y1, int x2, int y2 )
    {
        return x < x1 || x >= x2 || y < y1 || y >= y2;
    }
     
    public String toString()
    {
        return String.format( "(%d,%d)", x, y );
    }
}