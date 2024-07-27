package Project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookACarPanel extends JFrame {

    private JPanel contentPane;
    private ButtonGroup buttonGroup;
    private JRadioButton[] radioButtons;
    private JScrollPane scrollPane;
    private JLabel label;
    private JLabel lblPlace;
    private JLabel lblNewLabel;
    private JScrollPane scrollPane_1;
    private JLabel lblEnterDetails;
    private JButton btnPost;
    private JButton btnBack;

    public BookACarPanel(String name) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 842, 492);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        String[] data = {"Jatrabari","Kamalapur","Motijheel","Agargaon","Badda","Hatijheel",
                  "Natunbajar","Gulshan","Banani","Bashundara","Dhanmondi","Uttara"}; 
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(data.length, 1));
        
        radioButtons = new JRadioButton[data.length];
        buttonGroup = new ButtonGroup();
        Font radioButtonFont = new Font("Arial", Font.BOLD, 20);
        
        for (int i = 0; i < data.length; i++) {
            radioButtons[i] = new JRadioButton(data[i]);
            radioButtons[i].setFont(radioButtonFont);
            panel.add(radioButtons[i]);
        }
        
        for (int i = 0; i < data.length; i++) {
            buttonGroup.add(radioButtons[i]);
        }
        
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(528, 10, 276, 275);
        contentPane.add(scrollPane);
        
        label = new JLabel("New label");
        label.setBounds(574, -13, 45, 13);
        contentPane.add(label);
        
        lblPlace = new JLabel("Select A Place");
        lblPlace.setBounds(608, 295, 131, 25);
        contentPane.add(lblPlace);
        lblPlace.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        lblNewLabel = new JLabel("Welcome! User, Book a car");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setBounds(10, 10, 508, 52);
        contentPane.add(lblNewLabel);
        
        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(47, 192, 436, 93);
        contentPane.add(scrollPane_1);
        
        JTextPane detailsPane = new JTextPane();
        detailsPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
        scrollPane_1.setViewportView(detailsPane);
        
        lblEnterDetails = new JLabel("Enter Details of your Journey");
        lblEnterDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEnterDetails.setBounds(123, 150, 276, 25);
        contentPane.add(lblEnterDetails);
        
        btnPost = new JButton("Post");
        btnPost.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int indx = getSelectedIndex();
        		if(indx!=-1) {
        			// will show a success post message

        			new UserPanel(name);
        			
        			// will store the post
        			
        			String details = detailsPane.getText();
        			new BookACar(name, indx, details);
        			dispose();
        		}
        	}
        });
        btnPost.setForeground(new Color(255, 255, 255));
        btnPost.setFont(new Font("Serif", Font.BOLD, 36));
        btnPost.setBackground(new Color(0, 128, 64));
        btnPost.setBounds(415, 356, 204, 55);
        contentPane.add(btnPost);
        
        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new UserPanel(name);
        		dispose();
        	}
        });
        btnBack.setFont(new Font("Serif", Font.BOLD, 36));
        btnBack.setBackground(new Color(0, 135, 200));
        btnBack.setBounds(168, 356, 204, 55);
        contentPane.add(btnBack);
        setVisible(true);
    }
    private int getSelectedIndex() {
        for (int i = 0; i < radioButtons.length; i++) {
            if (radioButtons[i].isSelected()) {
                return i;
            }
        }
        return -1; // No radio button selected
    }

}
