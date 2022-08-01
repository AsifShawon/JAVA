package Project.Library;

//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddBook implements ActionListener{
	JFrame frame2; 
	
	JTextField text;
	JPanel panel ;
	JButton b;
	public String book;
	public String getBook() {
		return book;
	}
	
	AddBook(){
		frame2 =new JFrame("Add a Book");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(420,550);
		frame2.setLayout(null);
		
		text  = new JTextField();
		text.setBounds(50,25,300,50);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			book = text.getText();
			System.out.print(book);
			frame2.dispose(); // to close the window when "add" clicked

		}
	}
}

