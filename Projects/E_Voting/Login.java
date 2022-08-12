package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener{
	
	private JFrame frame;
	private JButton login, menu;
	private JTextField nameF,idF;
	private JLabel title,nameL, idL;
	private String s;
	Container c;
	
	Login(String s){
		this.s = s;
		frame = new JFrame(s+" Login");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLocation(500,100);
		frame.setLayout(null);
		this.s = s;
		
		c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		
		// title
		title = new JLabel(s+" Login");
		title.setFont(new Font("arial",Font.BOLD,25));
		title.setSize(150,30);
		title.setLocation(160,20);
		
		
		// name
		nameL = new JLabel(s+" Name:");
		nameL.setFont(new Font("arial",Font.BOLD,12));
		nameL.setSize(80,20);
		nameL.setLocation(130,70);
		nameF = new JTextField();
		nameF.setSize(100,20);
		nameF.setLocation(200,70);
		
		// id
		idL = new JLabel(s+" id:");
		idL.setFont(new Font("arial",Font.BOLD,12));
		idL.setSize(70,20);
		idL.setLocation(130,100);
		idF = new JTextField();
		idF.setSize(100,20);
		idF.setLocation(200,100);
		
		// login
		login = new JButton("Log in");
		login.addActionListener(this);
		login.setFont(new Font("arial",Font.BOLD,12));
		login.setSize(70,20);
		login.setLocation(140,130);
		
		// back to main menu
		menu = new JButton("< Menu");
		menu.addActionListener(this);
		menu.setFont(new Font("arial",Font.BOLD,12));
		menu.setSize(80,20);
		menu.setLocation(220,130);
		
		// containers
		c.add(title);
		c.add(nameL);
		c.add(nameF);
		c.add(idL);
		c.add(idF);
		c.add(login);
		c.add(menu);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu) {
			new Menu1();
		}
		
	}
}
