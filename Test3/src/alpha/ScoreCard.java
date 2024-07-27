package alpha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ScoreCard extends JFrame implements ActionListener{

	private int righCount;
	JButton ok;
	String name = User.getName();
	int age = User.getAge();
	
	public ScoreCard(int righCount) {
		this.righCount = righCount;
		
		// label, score, name
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			
			  File f = new File("Score.dat");
			  
			  try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))){
				  dos.writeUTF(name);
				  dos.writeInt(righCount);
			  }
			  catch(Exception ex) {
				  JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
			  }
		}
		
	}

}
