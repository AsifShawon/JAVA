package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Registration implements ActionListener{
	private JFrame frame = new JFrame("Registration");
	private JButton submit, menu;
	private JTextField nameF,idF,dobF,phnF,deptF,emailF;
	private JTextArea addressF;
	private JLabel title,nameL, idL,dobL,phnL,addressL,deptL,emailL,mailEx;
	private String s;
	private JScrollPane addressbar;
	Container c;
	
	public Registration() {
		// frame basic
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				frame.setSize(500,500);
				frame.setLocation(500,100);
				frame.setLayout(null);
		
				c = frame.getContentPane();
				c.setLayout(null);
				//c.setBackground(Color.yellow);
				
				// title
				title = new JLabel("Registration Form");
				title.setFont(new Font("arial",Font.BOLD,25));
				title.setSize(220,30);
				title.setLocation(120,20);
				
				// name
				nameL = new JLabel("User Name:");
				nameL.setFont(new Font("arial",Font.BOLD,12));
				nameL.setSize(80,20);
				nameL.setLocation(130,70);
				nameF = new JTextField();
				nameF.setSize(100,20);
				nameF.setLocation(200,70);
				
				// id
				idL = new JLabel("User id:");
				idL.setFont(new Font("arial",Font.BOLD,12));
				idL.setSize(70,20);
				idL.setLocation(150,100);
				idF = new JTextField();
				idF.setSize(100,20);
				idF.setLocation(200,100);
				
				// phone number
				phnL = new JLabel("Phone Number:");
				phnL.setFont(new Font("arial",Font.BOLD,12));
				phnL.setSize(90,20);
				phnL.setLocation(106,130);
				phnF = new JTextField();
				phnF.setSize(100,20);
				phnF.setLocation(200,130);
				
				// department
				deptL = new JLabel("Department:");
				deptL.setFont(new Font("arial",Font.BOLD,12));
				deptL.setSize(90,20);
				deptL.setLocation(120,160);
				deptF = new JTextField();
				deptF.setSize(70,20);
				deptF.setLocation(200,160);
				
				// E-mail
				emailL = new JLabel("Email:");
				emailL.setFont(new Font("arial",Font.BOLD,12));
				emailL.setSize(70,20);
				emailL.setLocation(155,190);
				emailF = new JTextField();
				emailF.setSize(100,20);
				emailF.setLocation(200,190);
				mailEx = new JLabel("@northsouth.edu");
				mailEx.setSize(110,20);
				mailEx.setLocation(300,190);
				
				// date of birth
				dobL = new JLabel("DOB:");
				dobL.setFont(new Font("arial",Font.BOLD,12));
				dobL.setSize(80,20);
				dobL.setLocation(158,220);
				dobF = new JTextField();
				dobF.setSize(90,20);
				dobF.setLocation(200,220);
				
				// address
				addressL = new JLabel("Address:");
				addressL.setFont(new Font("arial",Font.BOLD,12));
				addressL.setSize(80,20);
				addressL.setLocation(138,250);
				addressF = new JTextArea();
				addressbar = new JScrollPane(addressF);
				addressbar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				addressbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
				addressbar.setSize(150,40);
				addressbar.setLocation(200,250);
				
				// submit
				submit = new JButton("Submit");
				submit.addActionListener(this);
				submit.setFont(new Font("arial",Font.BOLD,14));
				submit.setLocation(150,300);
				submit.setSize(90,25);
				submit.setBackground(Color.cyan);
				
				// back to menu
				menu = new JButton("< Menu");
				menu.addActionListener(this);
				menu.setFont(new Font("arial",Font.BOLD,14));
				menu.setSize(90,25);
				menu.setLocation(250,300);
				menu.setBackground(Color.yellow);
				
				// containers
				c.add(title);
				c.add(nameL);
				c.add(nameF);
				c.add(idL);
				c.add(idF);
				c.add(phnL);
				c.add(phnF);
				c.add(deptL);
				c.add(deptF);
				c.add(emailL);
				c.add(emailF);
				c.add(mailEx);
				c.add(dobL);
				c.add(dobF);
				c.add(addressL);
				c.add(addressbar);
				c.add(submit);
				c.add(menu);
				
				frame.setResizable(false);
				frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String filename = RunnningVote.getVname();
			System.out.println(filename);
			
			File f = new File("")
		}
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
		
	}

}
