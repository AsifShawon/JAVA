
import javax.swing.JOptionPane;

public class IO_GUI {

	public static void main(String[] args) {
		String s1,s2;
		int value1,value2,sum;
		s1 = JOptionPane.showInputDialog(null, "Enter first number");
		s2 = JOptionPane.showInputDialog(null, "Enter second number");
		
		value1 = Integer.parseInt(s1);
		value2 = Integer.parseInt(s2);
		sum = value1+value2;

		JOptionPane.showMessageDialog(null, "The sum is: "+ sum,"Sum of Two Numbers", JOptionPane.INFORMATION_MESSAGE);
		
		}

}
