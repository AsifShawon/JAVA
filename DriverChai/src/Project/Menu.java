package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Menu extends JFrame{

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 470);
		getContentPane().setLayout(null);
		
		JButton adminButton = new JButton("Admin");
		adminButton.setForeground(new Color(0, 0, 0));
		adminButton.setBackground(new Color(64, 128, 128));
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginFrame("admin");
				dispose();
			}
		});
		adminButton.setFont(new Font("Serif", Font.BOLD, 36));
		adminButton.setBounds(229, 153, 251, 63);
		getContentPane().add(adminButton);
		
		JButton driverButton = new JButton("Driver");
		driverButton.setForeground(new Color(0, 0, 0));
		driverButton.setBackground(new Color(64, 128, 128));
		driverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow("driver");
				dispose();
			}
		});
		driverButton.setFont(new Font("Serif", Font.BOLD, 36));
		driverButton.setBounds(229, 249, 251, 63);
		getContentPane().add(driverButton);
		
		JButton userButton = new JButton("User");
		userButton.setForeground(new Color(0, 0, 0));
		userButton.setBackground(new Color(64, 128, 128));
		userButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow("user");
				dispose();
			}
		});
		userButton.setFont(new Font("Serif", Font.BOLD, 36));
		userButton.setBounds(229, 338, 251, 63);
		getContentPane().add(userButton);
		
		JLabel lblNewLabel = new JLabel("Driver Chai");
		lblNewLabel.setForeground(new Color(128, 128, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblNewLabel.setBounds(160, 10, 407, 121);
		getContentPane().add(lblNewLabel);
		setVisible(true);
	}
}
