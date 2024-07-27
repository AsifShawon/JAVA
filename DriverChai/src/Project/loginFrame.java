package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	public loginFrame(String s) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel adminLabel = new JLabel(s+" login");
		adminLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminLabel.setFont(new Font("Tahoma", Font.BOLD, 46));
		adminLabel.setBounds(226, 50, 280, 66);
		contentPane.add(adminLabel);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		usernameField.setBounds(302, 159, 304, 56);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		passwordField.setBounds(302, 244, 304, 56);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblUsername.setBounds(91, 156, 201, 56);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblPassword.setBounds(91, 244, 201, 56);
		contentPane.add(lblPassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow(s);
				dispose();
			}
		});
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setBounds(139, 337, 204, 55);
		contentPane.add(btnBack);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = usernameField.getText();
				String pass = new String(passwordField.getPassword());
				if(s.equals("user")) {
					new UserLogin(name, pass);
				}
				else if(s.equals("driver")) {
					new DriverLogin(name, pass);
				}
				else new AdminLogin(name, pass);
				
				dispose();
			}
		});
		btnOk.setFont(new Font("Serif", Font.BOLD, 36));
		btnOk.setBackground(new Color(0, 128, 128));
		btnOk.setBounds(384, 337, 204, 55);
		contentPane.add(btnOk);
		setVisible(true); 
	}
}