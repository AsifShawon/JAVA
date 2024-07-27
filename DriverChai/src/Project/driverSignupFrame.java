package Project;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class driverSignupFrame extends JFrame {
    private JPanel contentPane;
    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField carField;
    private List<JCheckBox> placeCheckBoxes;
    static String[] place = {"Jatrabari", "Kamalapur", "Motijheel", "Agargaon", "Badda", "Hatijheel",
            "Natunbajar", "Gulshan", "Banani", "Bashundara", "Dhanmondi", "Uttara"};

    public driverSignupFrame(String type) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1070, 542);
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
        lblPassword.setBounds(119, 319, 196, 46);
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
        passwordField.setBounds(337, 319, 304, 56);
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
        btnBack.setBounds(135, 412, 204, 55);
        contentPane.add(btnBack);

        JButton btnOk = new JButton("Ok");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (type.equals("driver")) {
                    String username = usernameField.getText();
                    String email = emailField.getText();
                    String pass = new String(passwordField.getPassword());
                    String car = carField.getText();

                    List<Integer> p_id = new ArrayList<>();
                    for (int i = 0; i < placeCheckBoxes.size(); i++) {
                        JCheckBox checkBox = placeCheckBoxes.get(i);
                        if (checkBox.isSelected()) {
                            p_id.add(i);
                        }
                    }

                    Driver driver = new Driver(username, email, pass, car, p_id);

                    try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Drivers.dat", true))) {
                        outputStream.writeUTF(driver.getName());
                        outputStream.writeUTF(driver.getEmail());
                        outputStream.writeUTF(driver.getPass());
                        outputStream.writeUTF(driver.getCarName());
                        outputStream.writeUTF(driver.getLoc_id_str());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    new DriverPanel(driver);
                    dispose();
                }
            }
        });
        btnOk.setFont(new Font("Serif", Font.BOLD, 36));
        btnOk.setBackground(new Color(0, 128, 128));
        btnOk.setBounds(380, 412, 204, 55);
        contentPane.add(btnOk);

        JLabel lblCar = new JLabel("Car");
        lblCar.setFont(new Font("Tahoma", Font.BOLD, 36));
        lblCar.setBounds(119, 253, 196, 46);
        contentPane.add(lblCar);

        carField = new JTextField();
        carField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        carField.setColumns(10);
        carField.setBounds(337, 253, 304, 56);
        contentPane.add(carField);

        // Create and configure the placeCheckBoxes
        placeCheckBoxes = new ArrayList<>();
        for (int i = 0; i < place.length; i++) {
            JCheckBox checkBox = new JCheckBox((i + 1) + ". " + place[i]);
            checkBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
            checkBox.setBounds(700, 37 + (i * 25), 300, 25);
            contentPane.add(checkBox);
            placeCheckBoxes.add(checkBox);
        }

        setVisible(true);
    }
}
