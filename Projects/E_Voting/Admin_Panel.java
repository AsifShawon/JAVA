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
	private JButton newVote,delete,database,menu;
	private JLabel title;
	private String s;
	Container c;
	public Admin_Panel() {
	// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(602,404);
		frame.setLocation(500,100);
		frame.getContentPane().setLayout(null);
		
	// Container
		c = frame.getContentPane();
		c.setLayout(null);
		
	// title
		title =new JLabel("Admin Panel");
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		title.setSize(224,51);
		title.setLocation(195,26);
		
	// add new vote system
		newVote = new JButton("Add New Vote System");
		newVote.addActionListener(this);
		newVote.setFont(new Font("Cambria", Font.BOLD, 17));
		newVote.setSize(220,51);
		newVote.setLocation(183,87);
		
	// delete voter
		delete = new JButton("Delete Voter");
		delete.addActionListener(this);
		delete.setFont(new Font("Cambria", Font.BOLD, 17));
		delete.setSize(220,51);
		delete.setLocation(183,148);
		
	// database
		database = new JButton("Check Database");
		database.addActionListener(this);
		database.setFont(new Font("Cambria", Font.BOLD, 17));
		database.setSize(220,51);
		database.setLocation(183,209);
	
	// go back to menu
		menu = new JButton("<< Go back to menu");
		menu.addActionListener(this);
		menu.setFont(new Font("Cambria", Font.BOLD, 17));
		menu.setSize(220,51);
		menu.setLocation(183,269);
		menu.setBackground(Color.yellow);
		
	// containers 
		c.add(title);
		c.add(newVote);
		c.add(delete);
		c.add(database);
		c.add(menu);
		
		
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
