package E_Voting;

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
	private JButton newVote,delete,edit,result,database,menu; // add nominators???
	private JLabel title;
	private String s;
	Container c;
	public Admin_Panel() {
	// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		frame.setLocation(500,100);
		frame.setLayout(null);
		
	// Container
		c = frame.getContentPane();
		c.setLayout(null);
		
	// title
		title =new JLabel("Admin Panel");
		title.setFont(new Font("arial",Font.BOLD,27));
		title.setSize(180,30);
		title.setLocation(150,20);
		
	// add new vote system
		newVote = new JButton("Add New Vote System");
		newVote.addActionListener(this);
		newVote.setFont(new Font("arial",Font.PLAIN,15));
		newVote.setSize(190,30);
		newVote.setLocation(135,60);
		
	// edit voter
		edit = new JButton("Edit Voter");
		edit.addActionListener(this);
		edit.setFont(new Font("arial",Font.PLAIN,15));
		edit.setSize(190,30);
		edit.setLocation(135,100);
		
	// delete voter
		delete = new JButton("Delete Voter");
		delete.addActionListener(this);
		delete.setFont(new Font("arial",Font.PLAIN,15));
		delete.setSize(190,30);
		delete.setLocation(135,140);
		
	// check result
		result = new JButton("Check Result");
		result.addActionListener(this);
		result.setFont(new Font("arial",Font.PLAIN,15));
		result.setSize(190,30);
		result.setLocation(135,180);
		
	// database
		database = new JButton("Check Database");
		database.addActionListener(this);
		database.setFont(new Font("arial",Font.PLAIN,15));
		database.setSize(190,30);
		database.setLocation(135,220);
	
	// go back to menu
		menu = new JButton("<< Go back to menu");
		menu.addActionListener(this);
		menu.setFont(new Font("arial",Font.PLAIN,15));
		menu.setSize(190,30);
		menu.setLocation(135,260);
		menu.setBackground(Color.yellow);
		
	// containers 
		c.add(title);
		c.add(newVote);
		c.add(edit);
		c.add(delete);
		c.add(result);
		c.add(database);
		c.add(menu);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newVote) {
			new NewVoting();
			frame.dispose();
		}
		
	}
}
