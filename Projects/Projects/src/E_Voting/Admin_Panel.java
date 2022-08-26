package E_Voting;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Admin_Panel implements ActionListener{
	private JFrame frame = new JFrame("Admin Panel");
	private JButton newVote,database,menu,EndCurrentVote;
	private JLabel title;
	private String s;
	Container c;
	public Admin_Panel() {
	// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(604,470);
		frame.setLocation(500,100);
		frame.getContentPane().setLayout(null);
		
	// Container
		c = frame.getContentPane();
		c.setLayout(null);
		
	// title
		title =new JLabel("Admin Panel");
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		title.setSize(253,67);
		title.setLocation(181,10);
		
	// add new vote system
		newVote = new JButton("Add New Vote System");
		newVote.addActionListener(this);
		newVote.setFont(new Font("Cambria", Font.BOLD, 17));
		newVote.setSize(220,51);
		newVote.setLocation(183,87);
		
	// database
		database = new JButton("User Database");
		database.addActionListener(this);
		database.setFont(new Font("Cambria", Font.BOLD, 17));
		database.setSize(220,51);
		database.setLocation(183,209);
	
	// go back to menu
		menu = new JButton("<< Go back to menu");
		menu.addActionListener(this);
		menu.setFont(new Font("Cambria", Font.BOLD, 17));
		menu.setSize(220,51);
		menu.setLocation(183,334);
		menu.setBackground(Color.yellow);
		
	// containers 
		c.add(title);
		c.add(newVote);
		c.add(database);
		c.add(menu);
		
		JButton btnParticipantDatabase = new JButton("Participant Database");
		btnParticipantDatabase.addActionListener(this);
		btnParticipantDatabase.setFont(new Font("Cambria", Font.BOLD, 18));
		btnParticipantDatabase.setBounds(183, 148, 220, 51);
		c.add(btnParticipantDatabase);
		
		EndCurrentVote = new JButton("End Current Vote");
		EndCurrentVote.addActionListener(this);
		EndCurrentVote.setFont(new Font("Cambria", Font.BOLD, 17));
		EndCurrentVote.setBounds(183, 273, 220, 51);
		c.add(EndCurrentVote);
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newVote) {
			new NewVoting();
			frame.dispose();
		}
		
		if(e.getSource()==database) {
			new Database();
			frame.dispose();
		}
		
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
	}
}
