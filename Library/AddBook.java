package Library;

//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddBook implements ActionListener{
	private JFrame frame2; 
	private JTextField text;
	private JPanel panel ;
	private JButton b;
	private String book;
	private Library l2 = new Library();
	
	AddBook(Library l){
		frame2 =new JFrame("Add a Book");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(420,550);
		frame2.setLayout(null);
		
		text  = new JTextField();
		text.setBounds(50,25,300,50);
		
		l2 = l;
		
		b = new JButton("Add");
		b.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		//panel.setBackground(Color.YELLOW);
		panel.add(b);
		
		frame2.add(panel);
		frame2.add(text);
		frame2.setVisible(true);	
	}
	public Library getL2() {
		return l2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			book = text.getText();
			l2.setAvBook(book);
			frame2.dispose(); // to close the window when "add" clicked
		}		
	}
}

