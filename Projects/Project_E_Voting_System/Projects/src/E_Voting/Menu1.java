package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu1 implements ActionListener{
	private JFrame frame = new JFrame("Menu");
	private JButton regi,usrLog, adminLog, result, Exit;
	private JLabel menu;
	private Container c = new Container();
	
	public Menu1() {
		// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(532,457);
		frame.setLocation(500,100);
		
		// Container
		c = frame.getContentPane();
		c.setLayout(null);
		
		// main menu label
		menu = new JLabel("Main Menu");
		menu.setFont(new Font("Constantia", Font.BOLD, 35));
		menu.setSize(192,65);
		menu.setLocation(162,10);
		
		// Buttons
		// user registration
		regi = new JButton("Voter Registration");
		regi.addActionListener(this);
		regi.setFont(new Font("Calisto MT", Font.BOLD, 16));
		regi.setSize(192,56);
		regi.setLocation(162,85);
		
		// user login
		usrLog = new JButton("Voter Login");
		usrLog.addActionListener(this);
		usrLog.setFont(new Font("Calisto MT", Font.BOLD, 18));
		usrLog.setSize(192,56);
		usrLog.setLocation(162,151);
		
		// Admin login
		adminLog = new JButton("Admin Login");
		adminLog.addActionListener(this);
		adminLog.setFont(new Font("Calisto MT", Font.BOLD, 18));
		adminLog.setSize(192,56);
		adminLog.setLocation(162,217);
		
		// Result 
		result = new JButton("Result");
		result.addActionListener(this);
		result.setFont(new Font("Calisto MT", Font.BOLD, 18));
		result.setSize(192,56);
		result.setLocation(162,283);
		
		// exit
		Exit = new JButton("Exit");
		Exit.addActionListener(this);
		Exit.setFont(new Font("Calisto MT", Font.BOLD, 18));
		Exit.setBounds(162, 349, 192, 56);
		c.add(Exit);
		
		// containers
		c.add(menu);
		c.add(regi);
		c.add(usrLog);
		c.add(adminLog);
		c.add(result);
		
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
		if(e.getSource()==result) {
			new Result();
			frame.dispose();
		}
		if(e.getSource()==Exit) {
			System.exit(0);
		}
	}
}