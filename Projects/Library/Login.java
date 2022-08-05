package Library;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login implements ActionListener{
	
	JFrame frame;
	JButton login;
	JPanel panel;
	JTextArea username,pass;
	JLabel label1, label2;
	JLabel error = new JLabel("Wrong Input!!! Try Again");
	
	public Login() {
		frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setLayout(null);
		
		username = new JTextArea();
		pass = new JTextArea();
		
		label1 = new JLabel("Username: ");
		label2 = new JLabel("Password: ");
		
		login = new JButton("Log In");
		login.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,50,300,150);
		panel.setLayout(new GridLayout(4,4,5,5));
		
		panel.add(label1);
		panel.add(username);
		panel.add(label2);
		panel.add(pass);
		panel.add(login);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			if(username.getText().equals("CFA") && pass.getText().equals("1234")) {
			new Display();
			frame.dispose();
			}
			else {
				new LoginError("s");
				frame.dispose();
			}
		}
		
	}

}
