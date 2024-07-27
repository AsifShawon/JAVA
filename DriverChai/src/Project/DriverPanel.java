package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DriverPanel extends JFrame {

	private JPanel contentPane;

	public DriverPanel(Driver driver) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserPanel = new JLabel("Welcome! "+driver.getName());
		lblUserPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserPanel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblUserPanel.setBounds(49, 28, 694, 83);
		contentPane.add(lblUserPanel);
		
		JButton btnBookings = new JButton("Bookings");
		btnBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookingAccept(driver);
				dispose();
			}
		});
		btnBookings.setFont(new Font("Serif", Font.BOLD, 36));
		btnBookings.setBounds(247, 163, 251, 63);
		contentPane.add(btnBookings);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow("driver");
				dispose();
			}
		});
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setBounds(271, 271, 204, 55);
		contentPane.add(btnBack);
		setVisible(true);
	}

}
