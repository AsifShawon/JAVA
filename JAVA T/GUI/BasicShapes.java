
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawLine(50, 50, 300, 50);
		
		g.setColor(Color.BLUE);
		g.drawRect(50,100,250,100);
		//g.drawOval(50,100,250,100);
		g.fillRect(400, 100,250, 100);
		
		
		g.setColor(Color.RED);
		g.drawOval(50,250,250,100);
		//g.drawRect(50,250,100,100);
		//g.drawOval(50,250,100,100);
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(10));
		g.drawOval(400,250,250, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(400,250,250, 100);
		
	}		
}


public class BasicShapes {

	public static void main(String[] args) {
		
		MyPanel mp = new MyPanel();
		JFrame frame = new JFrame();
		frame.add(mp);
		frame.setSize(700, 500);
		frame.setTitle("Basic Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
