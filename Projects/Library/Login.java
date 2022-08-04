package Library;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login implements ActionListener{
	
	private JFrame frame;
	private JButton login;
	private JPanel panel;
	private boolean run = false;
	
	public Login() {
		
		frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setLayout(null);
		
		login = new JButton("Log In");
		login.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,5,5));
		panel.add(login);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	public boolean getrun() {
		return run;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			new Display();
			frame.dispose();
		}
		
	}

}
