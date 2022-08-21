package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu1 implements ActionListener{
	private JFrame frame = new JFrame("Menu");
	private JButton regi,usrLog, adminLog;
	private JLabel menu;
	private Container c = new Container();
	
	
	public Menu1() {
		// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLocation(500,100);
		frame.setLayout(null);
		
		// Container
		c = frame.getContentPane();
		c.setLayout(null);
		
		// main menu label
		menu = new JLabel("Main Menu");
		menu.setFont(new Font("arial",Font.BOLD,20));
		menu.setSize(160,40);
		menu.setLocation(185,20);
		
		// Buttons
		// user registration
		regi = new JButton("Voter Rgistration");
		regi.addActionListener(this);
		regi.setFont(new Font("arial",Font.PLAIN,15));
		regi.setSize(150,30);
		regi.setLocation(168,70);
		
		// user login
		usrLog = new JButton("Voter Log in");
		usrLog.addActionListener(this);
		usrLog.setFont(new Font("arial",Font.PLAIN,15));
		usrLog.setSize(150,30);
		usrLog.setLocation(168,110);
		
		// Admin login
		adminLog = new JButton("Admin Login");
		adminLog.addActionListener(this);
		adminLog.setFont(new Font("arial",Font.PLAIN,15));
		adminLog.setSize(150,30);
		adminLog.setLocation(168,150);
		
		// containers
		c.add(menu);
		c.add(regi);
		c.add(usrLog);
		c.add(adminLog);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==regi) {
			new Registration();
			frame.dispose();
		}
		if(e.getSource()==usrLog) {
			new UserLogin("User");
			frame.dispose();
		}
		if(e.getSource()==adminLog) {
			new AdminLogin("Admin");
			frame.dispose();
		}
		
	}

}
