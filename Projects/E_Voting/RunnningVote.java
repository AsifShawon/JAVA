package E_Voting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class RunnningVote {
	private static String vname;
	
	public RunnningVote(String s) {
		vname = s;
		File f = new File("RunningVote.dat");
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
			dos.writeUTF(vname);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void setVname(String s) {
		vname = s;
		File f = new File("RunningVote.dat");
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
			dos.writeUTF(vname);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static String getVname() {
		File f = new File("RunningVote.dat");
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			vname = dis.readUTF();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		return vname;
	}
}
