
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display implements ActionListener {
	private JFrame frame = new JFrame();
	JTextField textfield;
	JTextArea textarea;
	Scanner in = new Scanner(System.in);
	Library l = new Library();
	JButton button, button2;
	private JPanel panel;
	private int count = 0;
	AddBook add ;
	private JLabel label = new JLabel("Number: 0");

	Display() {
		frame = new JFrame("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);		
		
		// button
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		
		button.setText("Add Book");
		button2.setText("Available Books");
		button3.setText("Issue Book");
		button4.setText("Exit");
		button.addActionListener(this); // passing command to actionPerformed
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		// panel
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.GRAY);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);

		
		textarea = new JTextArea();
		textarea.setBounds(50,300,300,500);
		//textfield.setFont(myFont);
		
		textarea.setEditable(true);
		
		frame.add(panel);
		frame.add(textarea);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Available Books")) {
			textarea.setText("");
			for(int i=0; l.getAvBook(i)!=null; i++) {
				textarea.setText(textarea.getText()+"\n"+(i+1)+") "+l.getAvBook(i));
			}
		}
		if (e.getActionCommand().equals("Add Book")) {
			add = new AddBook();
			
			System.out.println(add.getBook());
//			l.setAvBook(s);
		} 
		if (e.getActionCommand().equals("Issue Book")) {
			System.out.print("Enter Book Index: ");
			int ind = in.nextInt();
			System.out.print("Your Book: " + l.getBook(ind) + "\n");
		}
		if(e.getActionCommand()=="Exit") {
			System.exit(0);
		}
	
		label.setText("Number of Books: " + l.count + "");
	}
}
