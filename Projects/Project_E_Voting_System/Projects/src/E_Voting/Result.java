package E_Voting;

import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Result implements ActionListener{
	private JFrame frame;
	private JLabel resultOf, winner, winner2;
	private JButton menu;
	Container c;
	boolean visibility = true;
	public Result(){
		if(RunnningVote.getPublished()==false) {
			JOptionPane.showMessageDialog(null, "Result not published yet", "Not Published", JOptionPane.INFORMATION_MESSAGE);
			visibility = false;
			new Menu1();
		}
		frame = new JFrame("Result");
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,100);
		frame.setSize(548,550);
		
		c = frame.getContentPane();
		c.setLayout(null);
		
		String runningVote = RunnningVote.getVname(), voteName="";
		int pnum=0;
		
		File f2 = new File("participantFileName.dat");
		 
		 try(DataInputStream dis = new DataInputStream(new FileInputStream(f2))){
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
		 
		 
		 File f1 = new File(voteName+".dat");
			int pid[] = new int[pnum], pvote[]= new int[pnum];
			String pdept[] = new String[pnum], pemail[] = new String[pnum], pname[] = new String[pnum];
			
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f1))) {
			for(int i=0; i<pnum; i++) {
				pname[i] = dis.readUTF();
				pdept[i] = dis.readUTF();
				pid[i] = dis.readInt();
				pemail[i] = dis.readUTF();
				pvote[i] = dis.readInt();
//				System.out.println(pvote[i]);
			}
		}
		catch(EOFException ex) {
			JOptionPane.showMessageDialog(null,"User Not Found","Error",JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"File note found","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		// who is the winner!
		int max = pvote[0], win = 0;
		for(int i=1; i<pnum; i++) {
			if(pvote[i]>max) {
				max = pvote[i];
				win = i;
			}
		}
		
		
		
		//result of
		resultOf = new JLabel("Result of "+voteName);
		resultOf.setForeground(Color.BLUE);
		resultOf.setBackground(Color.GRAY);
		resultOf.setSize(256,100);
		resultOf.setLocation(149,41);
		resultOf.setFont(new Font("Goudy Old Style", Font.BOLD, 31));
		
		// winner 
		winner = new JLabel("The winner is "+pname[win]+ " with");
		winner.setSize(397,100);
		winner.setLocation(92,120);
		winner.setFont(new Font("Goudy Old Style", Font.BOLD, 31));
		
		
		winner2 = new JLabel(pvote[win]+" votes");
		winner2.setSize(118,100);
		winner2.setLocation(224,183);
		winner2.setFont(new Font("Goudy Old Style", Font.BOLD, 31));
		
		// menu
		menu = new JButton("Menu");
		menu.setBackground(Color.WHITE);
		menu.addActionListener(this);
		menu.setSize(143,45);
		menu.setLocation(204,293);
		menu.setFont(new Font("Bell MT", Font.BOLD, 25));
		
		c.add(resultOf);
		c.add(winner);
		c.add(winner2);
		c.add(menu);
		frame.setVisible(visibility);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
		
	}
}
