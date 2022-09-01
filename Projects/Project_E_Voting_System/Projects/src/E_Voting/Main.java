package E_Voting;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * Main class of the project 
 * Through this class user and admin can 
 * enter in the voting system
 * 
 */

/**
 * @author Md. Asif Ibn Kamal Bhuiyan (213166362)
 * @author Abdullah Al Muhimine (213166262)
 * @version  28-08-2022
 * 
 */
public class Main extends Greeting{
	/**
	 * main method
	 * @param args - an array of string methods
	 */
	public static void main(String[] args) {
		/**
		 *  creates an object 'm' of Main class
		 */
		Main m = new Main();
		
		/**
		 *  calls "greeting()" by object 'm' to show greeting message
		 */
		m.greeting();
		
		/**
		 *  calls "Menu1()" constructor of "Menu1()" class to show menu 
		 */
		 new Menu1();
	}

	
	/**
	 * Overrides "greeting()" method 
	 * Shows a welcome window
	 * @param type: void
	 * @return type: void
	 * 
	 */
	@Override
	void greeting() {
		UIManager.put("OptionPane.minimumSize",new Dimension(100,200));
		JLabel label = new JLabel("Welcome to our Voting System");
		label.setFont(new Font("Arial", Font.BOLD, 40));
		UIManager.put("OptionPane.okButtonText", "Enter");
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.PLAIN,25))); 
		JOptionPane.showMessageDialog(null, label, "WELCOME", JOptionPane.INFORMATION_MESSAGE);
	}
}
