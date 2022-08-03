package Library;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display implements ActionListener {
	private JFrame frame = new JFrame();
	private JTextArea textarea;
	public Library l = new Library();
	private JPanel panel,panel2;
	private JLabel label = new JLabel("Number of books: 0");
	JScrollPane bar;

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
		//panel.setBackground(Color.GRAY);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);

		
		textarea = new JTextArea();
		textarea.setBounds(50,300,300,300);
		//textfield.setFont(myFont);
		
		//textarea.setEditable(true);
		
		bar = new JScrollPane(textarea);
		bar.setPreferredSize(new Dimension(450,500));
		bar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel2 = new JPanel();
		panel2.add(bar);
		panel2.setBounds(60,300,300,400);
		panel2.setLayout(new GridLayout(4,4,10,10));
		
		frame.add(panel);
		frame.add(panel2);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Available Books")) {
			textarea.setText("Available Books\n");
			for(int i=0; l.getAvBook(i)!=null; i++) {
				textarea.setText(textarea.getText()+"\n"+(i+1)+") "+l.getAvBook(i));
			}
		}
		if (e.getActionCommand().equals("Add Book")) {
			AddBook add = new AddBook(l);
			l = add.getL2();
		} 
		
		if (e.getActionCommand().equals("Issue Book")) {
			IssueBook issue = new IssueBook(l);
			l = issue.getL2();
		}
		if(e.getActionCommand()=="Exit") {
			System.exit(0);
		}
	
		label.setText("Number of Books: " + l.getCount() + "");
	}
}
