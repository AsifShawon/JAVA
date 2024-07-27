import java.awt.Container;

import javax.swing.*;


import java.awt.Color;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener, ActionListener {
	
	private boolean play = false; //so that the game doesn't start by default
	private int score = 0;
	private int totalBricks = 21;
	
	private Timer timer; //setting the timer of ball(to determine how fast it should move)
	private int delay = 8; //speed of ball
	
	private int playerX = 310; //starting posiiton of paddle
	private int ballposX = 130; //starting position of ball from x axis
	private int ballposY = 350; //starting position of ball from y axis
	private int ballXdir = -2;
	private int ballYdir = -2;
	
	
	private MapGenerator map;
	
	public Gameplay() {

		map = new MapGenerator(3,7);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay,this);
		
		JPanel panel = new JPanel();
		add(panel);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
	
		//background
		g.setColor(Color.gray);
		g.fillRect(1,1,692,592);
		
		
		
		//drawing map
        map.draw((Graphics2D)g);
        
        
        //scores
        g.setColor(Color.green);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("Score: "+score,540,35);
        
		//the paddle
		g.setColor(Color.red);
		g.fillRect(playerX,550,100,8);
		
		//the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX,ballposY,20,20);
		
		if(totalBricks <=0)
		{
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.pink);
			
			g.setFont(new Font("Arial",Font.BOLD,25));
			g.drawString("CONGRATS!!YOU WON!!",260,300);
			
			g.setFont(new Font("Arial",Font.BOLD,25));
			g.drawString("PRESS ENTER TO RESTART",190,350);
		}
		
		if(ballposY>570) {
			
			play = false;
			ballXdir = 0;
			ballYdir = 0;
			g.setColor(Color.GREEN);
			
			g.setFont(new Font("Arial",Font.BOLD,25));
			g.drawString("GAME OVER, TOTAL SCORE: "+score,150,350);
			
//			try {
//				FileWriter fwrite = new FileWriter("Score.txt",true);
//				String s = Player.getName()+"\t"+score;
//				fwrite.write(s);
//				fwrite.close();
//			}
//			catch(Exception e) {
//				JOptionPane.showMessageDialog(null, "File cannot be created", "Error", JOptionPane.ERROR_MESSAGE);
//			}
			
			g.setFont(new Font("Arial",Font.BOLD,20));
			g.drawString("PRESS ENTER TO RESTART",200,400);
		}
		
		g.dispose();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	timer.start();
	
	if(play) {
		
		if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX,550,100,8))) {
			ballYdir = -ballYdir;
		}
		
		A: for(int i=0; i<map.map.length; i++) {
			for(int j=0; j<map.map[0].length; j++) {
				if(map.map[i][j] > 0) {
					int brickX = j*map.brickWidth + 80;
					int brickY = i*map.brickHeight+50;
					int brickWidth = map.brickWidth;
					int brickHeight = map.brickHeight;
					
					Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
					Rectangle ballRect = new Rectangle(ballposX,ballposY,20,20);
					Rectangle brickRect = rect;
					
					if(ballRect.intersects(brickRect)) {
						map.setBrickvalue(0,i,j);
						totalBricks--;
						score +=5;
						
						if(ballposX+19 <= brickRect.x || ballposX+1 >= brickRect.x + brickRect.width)
						{
							ballXdir =- ballXdir;
						}
						else
						{
							ballYdir = -ballYdir;
						}
						
						break A;
					}
				}
					
			}
		}
		ballposX += ballXdir;
		ballposY += ballYdir;
		if(ballposX<0)
			ballXdir = -ballXdir;
		
		if(ballposY<0)
			ballYdir = -ballYdir;
		
		if(ballposX > 670)
			ballXdir = -ballXdir;
		
		repaint();
	}
	}
	
	 

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			if(playerX >=600)
				playerX = 600;
			else
				moveRight();
		}
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			if(playerX < 10)
				playerX = 10;
			else
				moveLeft();
		}
		
		if(e.getKeyCode()== KeyEvent.VK_ENTER) {
			if(!play) {
				play = true;
				ballposX = 120;
				ballposY = 350;
				ballXdir = -1;
				ballYdir = -2;
				playerX = 310;
				score = 0;
				totalBricks = 21;
				map = new MapGenerator(3,7);
				
				repaint();
				
			}
		}
	}
	
	public void moveRight() {
		play = true;
		playerX+=20;
	}
	
	public void moveLeft() {
		play = true;
		playerX-=20;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	public static void main(String[] args) {
		Gameplay gameplay = new Gameplay();
	}
}

