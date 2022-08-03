package Library;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IssueBook implements ActionListener{
	private JFrame frame2; 
	
	private JTextField text,text2;
	private JPanel panel ;
	private JButton issue, ok;
	private Library l2 = new Library();
	private JLabel label = new JLabel("Enter Book Index");
	IssueBook(Library l) {
		l2 = l;
		
		frame2 = new JFrame("Issue a Book");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(420,550);
		frame2.setLayout(null);
		
		text  = new JTextField();
		text.setBounds(50,25,300,50);
		text2 = new JTextField("Your Book");
		text2.setBounds(50,25,300,50);
		
		issue = new JButton("Issue");
		issue.addActionListener(this);
		ok = new JButton("Ok");
		ok.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,5,5));
		//panel.setBackground(Color.YELLOW);
		panel.add(label);
		panel.add(text);
		panel.add(issue);
		panel.add(text2);
		panel.add(ok);
		
		
		frame2.add(panel);
		frame2.setVisible(true);
	}
	public Library getL2() {
		return l2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==issue) {
			int i = Integer.parseInt(text.getText());
			l2.getBook(i);
			text2.setText(l2.getAvBook(i));
		}
		if(e.getSource()==ok) {
			frame2.dispose();
		}
	}

}
