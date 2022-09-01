package E_Voting;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class VotingWindow implements ActionListener{

	private JFrame frame;
	private JLabel partL[], title;
	private JButton partB[], ok, menu;
	private Container c;
	private String runningVote,voteName="", selectedPartN;
	private String pname[],pdept[],pemail[], voterN, checkN;
	private int pnum = 0, selectedPartID,v,pid[],pvote[];
	String checkID;
	String voterId;
	private boolean visibility = true;

	public VotingWindow(String voterN, String voterId) {
		frame = new JFrame("Voting Window");
		frame.setSize(700, 600);
		frame.setLayout(null);
		this.voterN = voterN;
		this.voterId = voterId;
		
		File f2= new File(RunnningVote.getVname()+"User.dat");
		
		try(DataInputStream dis1 = new DataInputStream(new FileInputStream(f2))){
			while(true) {
				checkN = dis1.readUTF();
				checkID = dis1.readUTF();
				if(checkN.equals(voterN) && checkID.equals(voterId) && dis1.readBoolean()) {
					JOptionPane.showMessageDialog(null,"You've Already voted","Can't vote",JOptionPane.ERROR_MESSAGE);
					new Menu1();
					visibility = false;
				}
			}
			
		}
		catch(EOFException ex) {
			//
		}
		
		catch(Exception ex) {
			// 
		}

		runningVote = RunnningVote.getVname(); // getting the running vote
		File f = new File("participantFileName.dat");
		 
		 try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			 while(true) { 
				 voteName = dis.readUTF(); 
				 pnum = dis.readInt();
				 if(runningVote.equals(voteName)) break; 
		 	} 
		 } 
		 catch(EOFException ex) {
			 JOptionPane.showMessageDialog(null,"Vote note found","Error",JOptionPane.ERROR_MESSAGE); 
		 }
		 catch(Exception ex) {
			 JOptionPane.showMessageDialog(null,"File Not Found","Error",JOptionPane.ERROR_MESSAGE); 
		 }	 

		c = frame.getContentPane();
		c.setLayout(null);

		pname = new String[pnum];
		pdept = new String[pnum]; pemail = new String[pnum];
		pid = new int[pnum]; pvote= new int[pnum]; v=0;
		File f1 = new File(voteName + ".dat");
		try (DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
			
			for (int i = 0; i < pnum; i++) {
				pname[i] = dis.readUTF();
				dis.readUTF();
				pid[i] = dis.readInt();
				dis.readUTF();
				dis.readInt();
			}
		} 
		catch (EOFException ex) {
			JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
		} 
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "File Not Found 2", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		partL = new JLabel[pnum];
		partB = new JButton[pnum];
		
		int x = 230, y = 100;
		
		title = new JLabel("Vote Your Favourite");
		title.setSize(230, 80);
		title.setLocation(230,30);
		title.setFont(new Font("Arial",Font.BOLD,22));
		title.setForeground(Color.BLUE);
		c.add(title);
		
		for(int i=0; i<pnum; i++) {
			partL[i] = new JLabel((i+1)+") "+pname[i]);
			partL[i].setSize(80, 30);
			partL[i].setLocation(x,y);
			partL[i].setFont(new Font("Arial",Font.BOLD,15));
			
			partB[i] = new JButton("Vote");
			partB[i].setSize(80, 30);
			partB[i].setLocation(x+120,y);
			partB[i].setFont(new Font("Arial",Font.BOLD,15));
			partB[i].setBackground(Color.WHITE);
			partB[i].addActionListener(this);
			
			y += 40;
			c.add(partL[i]);
			c.add(partB[i]);
		}
		
		ok = new JButton("OK");
		ok.setSize(80, 40);
		ok.setLocation(x,y+10);
		ok.setFont(new Font("Arial",Font.BOLD,18));
		ok.setBackground(Color.LIGHT_GRAY);
		ok.addActionListener(this);
		c.add(ok);
		
		menu = new JButton("Main Menu");
		menu.setSize(150, 40);
		menu.setLocation(x+90,y+10);
		menu.setFont(new Font("Arial",Font.BOLD,17));
		menu.setBackground(Color.YELLOW);
		menu.addActionListener(this);
		c.add(menu);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(visibility);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<pnum; i++) {
			if(e.getSource()==partB[i]) {
				partB[i].setBackground(Color.GREEN);
				
				// to set other voting button white
				for(int j=0; j<pnum; j++) if(e.getSource()!=partB[j]) partB[j].setBackground(Color.WHITE);
				
				selectedPartN = pname[i];
				selectedPartID = pid[i];
				
//				System.out.println(pname[i]+pid[i]);
			}
		}
		
		if(e.getSource()==ok) {
			File f = new File(runningVote+".dat");
			
			try(DataInputStream dis = new DataInputStream(new FileInputStream(f))) {
				for(int i=0; i<pnum; i++) {
					pname[i] = dis.readUTF();
					pdept[i] = dis.readUTF();
					pid[i] = dis.readInt();
					pemail[i] = dis.readUTF();
					pvote[i] = dis.readInt();
					
					// check
					if(pname[i].equals(selectedPartN) && pid[i]==selectedPartID) { pvote[i]++;}
				}
			}
			catch(EOFException ex) {
				JOptionPane.showMessageDialog(null,"User Not Found","Error",JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File note found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))) {
				for(int i=0; i<pnum; i++) {
					dos.writeUTF(pname[i]);
					dos.writeUTF(pdept[i]);
					dos.writeInt(pid[i]);
					dos.writeUTF(pemail[i]);
					dos.writeInt(pvote[i]);
				}
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File note found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			JOptionPane.showMessageDialog(null, "You voted "+selectedPartN+" Succesfully", "Succesfully Voted", JOptionPane.INFORMATION_MESSAGE);
			
			// voter record to check in login page whether the voter voted or not in the current vote
			File f2 = new File(runningVote+"User.dat");
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2,true))){
				dos.writeUTF(voterN);
				dos.writeUTF(voterId);
				dos.writeBoolean(true);
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File note found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			new Menu1();
			frame.dispose();
		}
		
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
	}
}
