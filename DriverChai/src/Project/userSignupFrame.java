package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class userSignupFrame extends JFrame {
	Scanner sc = new Scanner(System.in);
	Scanner str_sc = new Scanner(System.in);
	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField emailField;
	private JPasswordField passwordField;

	public userSignupFrame(String type) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignup = new JLabel("Sign-up Form");
		lblSignup.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblSignup.setBounds(223, 10, 341, 75);
		contentPane.add(lblSignup);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblUsername.setBounds(119, 111, 196, 46);
		contentPane.add(lblUsername);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblEmail.setBounds(119, 187, 196, 46);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblPassword.setBounds(119, 253, 196, 46);
		contentPane.add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		usernameField.setColumns(10);
		usernameField.setBounds(337, 111, 304, 56);
		contentPane.add(usernameField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		emailField.setColumns(10);
		emailField.setBounds(337, 187, 304, 56);
		contentPane.add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		passwordField.setBounds(337, 253, 304, 56);
		contentPane.add(passwordField);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow(type);
				dispose();
			}
		});
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setBounds(138, 331, 204, 55);
		contentPane.add(btnBack);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(type.equals("user")) {
					String username = usernameField.getText();
					String email = emailField.getText();
					String pass = new String(passwordField.getPassword());
					User user = new User(username,email,pass);
					
					try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Users.dat", true))) {
						outputStream.writeUTF(user.getName());
						outputStream.writeUTF(user.getEmail());
						outputStream.writeUTF(user.getPassword());
			        } catch (IOException e1) {
			            e1.printStackTrace();
			        }
					new UserPanel(username);
					dispose();
				}
			}});
		btnOk.setFont(new Font("Serif", Font.BOLD, 36));
		btnOk.setBackground(new Color(0, 128, 128));
		btnOk.setBounds(383, 331, 204, 55);
		contentPane.add(btnOk);
		setVisible(true);
	}
}

/*

 */
