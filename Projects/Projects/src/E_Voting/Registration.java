package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Registration implements ActionListener{
	private JFrame frame = new JFrame("Registration");
	private JButton submit, menu;
	private JTextField nameF,idF,dobF,phnF,deptF,emailF;
	private JTextArea addressF;
	private JLabel title,nameL, idL,dobL,phnL,addressL,deptL,emailL;
	private String s;
	private JScrollPane bar ;
	Container c;
	private JLabel lblDdmmyyyy;
	
	public Registration() {
		// frame basic
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				frame.setSize(715,532);
				frame.setLocation(500,100);
				frame.getContentPane().setLayout(null);
		
				c = frame.getContentPane();
				c.setLayout(null);
				//c.setBackground(Color.yellow);
				
				// title
				title = new JLabel("Registration Form");
				title.setFont(new Font("Cambria", Font.BOLD, 28));
				title.setSize(241,50);
				title.setLocation(229,10);
				
				// name
				nameL = new JLabel("User Name:");
				nameL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				nameL.setSize(90,31);
				nameL.setLocation(217,70);
				nameF = new JTextField();
				nameF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
				nameF.setSize(141,30);
				nameF.setLocation(329,71);
				
				// id
				idL = new JLabel("User id:");
				idL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				idL.setSize(59,20);
				idL.setLocation(248,111);
				idF = new JTextField();
				idF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
				idF.setSize(127,30);
				idF.setLocation(329,107);
				
				// phone number
				phnL = new JLabel("Phone Number:");
				phnL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				phnL.setSize(117,20);
				phnL.setLocation(190,151);
				phnF = new JTextField();
				phnF.setSize(127,30);
				phnF.setLocation(329,147);
				
				// department
				deptL = new JLabel("Department:");
				deptL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				deptL.setSize(94,20);
				deptL.setLocation(213,189);
				deptF = new JTextField();
				deptF.setSize(117,30);
				deptF.setLocation(329,187);
				
				// E-mail
				emailL = new JLabel("Email:");
				emailL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				emailL.setSize(45,20);
				emailL.setLocation(262,229);
				emailF = new JTextField();
				emailF.setSize(141,30);
				emailF.setLocation(329,227);
				
				// date of birth
				dobL = new JLabel("DOB:");
				dobL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				dobL.setSize(38,20);
				dobL.setLocation(269,269);
				dobF = new JTextField();
				dobF.setSize(127,30);
				dobF.setLocation(329,267);
				
				// address
				addressL = new JLabel("Address:");
				addressL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				addressL.setSize(69,20);
				addressL.setLocation(238,311);
				addressF = new JTextArea();
				bar = new JScrollPane(addressF);
				bar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				bar.setViewportView(addressF);
				//addressF.setBounds(331, 311, 125, 57);
				bar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				bar.setBounds(331, 311, 152, 50);
				
				
				// submit
				submit = new JButton("Submit");
				submit.addActionListener(this);
				submit.setFont(new Font("Lucida Bright", Font.BOLD, 18));
				submit.setLocation(213,391);
				submit.setSize(138,42);
				submit.setBackground(Color.cyan);
				
				// back to menu
				menu = new JButton("< Menu");
				menu.addActionListener(this);
				menu.setFont(new Font("Lucida Bright", Font.BOLD, 18));
				menu.setSize(117,42);
				menu.setLocation(377,391);
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
				c.add(dobL);
				c.add(dobF);
				c.add(addressL);
				c.add(submit);
				c.add(menu);
				c.add(bar);
				
				lblDdmmyyyy = new JLabel("dd-mm-yyyy");
				lblDdmmyyyy.setFont(new Font("Calisto MT", Font.BOLD, 15));
				lblDdmmyyyy.setBounds(466, 275, 138, 20);
				c.add(lblDdmmyyyy);
				
				
				frame.setResizable(false);
				frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			
			String filename = RunnningVote.getVname();
			Voter v;
			String name,phnum, dept, email, dob, address, id;
			
			// voter's info
			name = nameF.getText();
			id = idF.getText();
			phnum = phnF.getText();
			dept = deptF.getText();
			email = emailF.getText();
			dob = dobF.getText();
			address = addressF.getText(); 
			
			v = new Voter(name, id, phnum, dept, email, dob, address);
			
			if(nameF.getText().equals("") || id.equals("") || phnum.equals("") ||dept.equals("") ||email.equals("") ||dob.equals("") ||address.equals("") ) {
				JOptionPane.showMessageDialog(null,"Fill all the details","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			else {
			File f = new File("voter.dat");
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))){
				dos.writeUTF(v.getName());
				dos.writeUTF(v.getId());
				dos.writeUTF(v.getPhnum());
				dos.writeUTF(v.getDept());
				dos.writeUTF(v.getEmail());
				dos.writeUTF(v.getDob());
				dos.writeUTF(v.getAddress());
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
			}
			}
			new Registration();
			frame.dispose();
		}
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
		
	}
}