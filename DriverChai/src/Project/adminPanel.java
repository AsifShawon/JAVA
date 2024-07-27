package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class adminPanel extends JFrame {

	private JPanel contentPane;

	public adminPanel() {
		setTitle("Admin Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblNewLabel.setBounds(224, 0, 297, 83);
		contentPane.add(lblNewLabel);
		
		JButton btnUserDetails = new JButton("User details\r\n");
		btnUserDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserDetails();
			}
		});
		btnUserDetails.setFont(new Font("Serif", Font.BOLD, 36));
		btnUserDetails.setBounds(245, 96, 251, 63);
		contentPane.add(btnUserDetails);
		
		JButton btnDriverDetails = new JButton("Driver Details\r\n");
		btnDriverDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DriverDetails();
			}
		});
		btnDriverDetails.setFont(new Font("Serif", Font.BOLD, 36));
		btnDriverDetails.setBounds(235, 169, 267, 63);
		contentPane.add(btnDriverDetails);
		
		JButton btnBookingDetails = new JButton("Booking Details");
		btnBookingDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookingDetails();
			}
		});
		btnBookingDetails.setFont(new Font("Serif", Font.BOLD, 36));
		btnBookingDetails.setBounds(224, 247, 297, 63);
		contentPane.add(btnBookingDetails);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				dispose();
			}
		});
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setBounds(268, 331, 204, 55);
		contentPane.add(btnBack);
		setVisible(true);
	}

}
