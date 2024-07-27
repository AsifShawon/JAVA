package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class UserPanel extends JFrame {

	private JPanel contentPane;

	public UserPanel(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSeePost = new JButton("See Bookings");
		btnSeePost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SeeBookingPanel(name);
				dispose();
			}
		});
		btnSeePost.setFont(new Font("Serif", Font.BOLD, 36));
		btnSeePost.setBounds(220, 137, 251, 63);
		contentPane.add(btnSeePost);
		
		JButton btnBookACar = new JButton("Book A Car");
		btnBookACar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BookACarPanel(name);
				dispose();
			}
		});
		btnBookACar.setFont(new Font("Serif", Font.BOLD, 36));
		btnBookACar.setBounds(220, 210, 251, 63);
		contentPane.add(btnBookACar);
		
		JLabel lblUserPanel = new JLabel("Welcome! "+name);
		lblUserPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserPanel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		lblUserPanel.setBounds(21, 23, 694, 83);
		contentPane.add(lblUserPanel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new entryWindow("user");
				dispose();
			}
		});
		btnBack.setFont(new Font("Serif", Font.BOLD, 36));
		btnBack.setBackground(new Color(0, 135, 200));
		btnBack.setBounds(246, 297, 204, 55);
		contentPane.add(btnBack);
		setVisible(true);
	}


}
