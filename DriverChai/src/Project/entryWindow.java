package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class entryWindow extends JFrame{

	private JPanel contentPane;

	public entryWindow(String s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel driverLabel = new JLabel(s+" Page");
		driverLabel.setForeground(new Color(128, 128, 255));
		driverLabel.setHorizontalAlignment(SwingConstants.CENTER);
		driverLabel.setFont(new Font("Tahoma", Font.BOLD, 46));
		driverLabel.setBounds(205, 31, 280, 66);
		contentPane.add(driverLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginFrame(s);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Serif", Font.BOLD, 36));
		btnLogin.setBounds(217, 132, 251, 63);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.equals("user")) new userSignupFrame(s);
				else new driverSignupFrame(s);
				dispose();
			}
		});
		btnSignup.setFont(new Font("Serif", Font.BOLD, 36));
		btnSignup.setBounds(217, 228, 251, 63);
		contentPane.add(btnSignup);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				dispose();
			}
		});
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBounds(243, 323, 204, 55);
		contentPane.add(btnBack);
		setVisible(true);
	}
}
