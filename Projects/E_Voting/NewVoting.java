package E_Voting;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;


public class NewVoting implements ActionListener{
	private JFrame frame = new JFrame("New Voting Create");
	private JButton next, menu; 
	private JLabel vname, user,title, participateNum;
	private JTextField fname,fparticipate;
	private String s[] = {"Pevious Voters","New Voters"};
	private JComboBox<String> box;
	Container c;
	private String filename, users;
	private int pnum;

	public NewVoting(){
	// frame basic
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLocation(500,100);
		frame.setLayout(null);

	// container
		c = frame.getContentPane();
		c.setLayout(null);
	
	// title
		title =new JLabel("Create Voting System");
		title.setFont(new Font("arial",Font.BOLD,25));
		title.setSize(270,30);
		title.setLocation(100,20);

	// new voting name
		vname = new JLabel("Voting Name:");
		vname.setFont(new Font("arial",Font.BOLD,15));
		vname.setSize(120,20);
		vname.setLocation(120,70);
		fname = new JTextField();
		fname.setSize(120,20);
		fname.setLocation(230,70);
		
//	// who can vote
//		user = new JLabel("Who can vote?");
//		user.setFont(new Font("arial",Font.BOLD,15));
//		user.setSize(130,20);
//		user.setLocation(110,90);
//		box = new JComboBox<>(s);
//		box.setSize(130,20);
//		box.setLocation(230,90);
		
	// participate 
		participateNum = new JLabel("How many participants:");
		participateNum.setFont(new Font("arial",Font.BOLD,15));
		participateNum.setSize(180,20);
		participateNum.setLocation(50,100);
		fparticipate = new JTextField();
		fparticipate.setSize(40,20);
		fparticipate.setLocation(230,100);
		
	// next button
		next = new JButton("Next >");
		next.addActionListener(this);
		next.setFont(new Font("arial",Font.BOLD,15));
		next.setSize(80,30);
		next.setLocation(185,140);
		
	// go back to menu
		menu = new JButton("<< Go back to Admin Panel");
		menu.addActionListener(this);
		menu.setFont(new Font("arial",Font.PLAIN,12));
		menu.setSize(180,30);
		menu.setLocation(145,185);
		menu.setBackground(Color.yellow);
	
	// containers
		c.add(title);
		c.add(vname);
		c.add(fname);
//		c.add(user);
//		c.add(box);
		c.add(participateNum);
		c.add(fparticipate);
		c.add(next);
		c.add(menu);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) { 
			
			
			try {
			filename = fname.getText();
			//users = box.getItemAt(box.getSelectedIndex()); // to get box item
			pnum = Integer.parseInt(fparticipate.getText()); // to retrieve integer value
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"Enter all details","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			RunnningVote.setVname(filename); 
			// setting the running vote name, as when admin create a new vote system 
			// it becomes the running one
			
			String pname[] = new String[pnum], pdept[] = new String[pnum], pemail[] = new String[pnum];
			int pid[] = new int[pnum];
			Participant part[] = new Participant[pnum];
			
			JPanel p = new JPanel(new GridLayout(5, 3));
			JLabel lpname = new JLabel("Participant name:");
			JTextField fpname = new JTextField();
			JLabel lpdept = new JLabel("Department:");
			JTextField fpdept = new JTextField();
			JLabel lpid = new JLabel("Participant ID:");
			JTextField fpid = new JTextField();
			JLabel lpemail = new JLabel("Email:");
			JTextField fpemail = new JTextField();
			
			p.add(lpname);
			p.add(fpname);
			p.add(lpdept);
			p.add(fpdept);
			p.add(lpid);
			p.add(fpid);
			p.add(lpemail);
			p.add(fpemail);

			for(int i=0; i<pnum; ++i) {
				JOptionPane.showMessageDialog(null,p,"Participent Panel",JOptionPane.OK_CANCEL_OPTION);
				
				pname[i] = fpname.getText(); fpname.setText(null);
				pdept[i] = fpdept.getText(); fpdept.setText(null);
				pid[i] = Integer.parseInt(fpid.getText()); fpid.setText(null);
				pemail[i] = fpemail.getText(); fpemail.setText(null);
				
				if(pname[i]==null || pdept[i]==null || fpid.getText()==null || pemail[i]==null) {
					--i;
					JOptionPane.showMessageDialog(null,"Please fill all entry","Wrong Entry",JOptionPane.ERROR_MESSAGE);
					continue;
				}
				part[i] = new Participant(pname[i], pdept[i] , pid[i], pemail[i]);
			}
			
			File f = new File("D:\\doc\\"+filename+".dat");
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))) {
				for(int i=0; i<pnum; i++) {
					dos.writeUTF(part[i].getName());
					dos.writeUTF(part[i].getDept());
					dos.writeInt(part[i].getId());
					dos.writeUTF(part[i].getEmail());
				}
			}
			
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			File f2 = new File("D:\\doc\\participantFileName.dat");
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2,true))){
				dos.writeUTF(filename);
				dos.writeInt(pnum);
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
			}
			new Admin_Panel();
			frame.dispose();
		}
		if(e.getSource()==menu) {
			new Admin_Panel();
			frame.dispose();
		}
		
	}
}