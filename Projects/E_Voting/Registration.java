package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration {
	private JFrame frame;
	private JButton login, menu;
	private JTextField nameF,idF;
	private JLabel title,nameL, idL;
	private String s;
	Container c;
	
	public Registration() {
		// frame basic
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				frame.setSize(500,300);
				frame.setLocation(500,100);
				frame.setLayout(null);
		
				
				frame.setResizable(false);
				frame.setVisible(true);
	}

}
