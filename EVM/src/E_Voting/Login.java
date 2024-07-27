package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Login implements ActionListener {

    public JFrame frame;
    public JButton login, menu;
    public JTextField nameF;
    JPasswordField idF;
    public JLabel title, nameL, idL;
    public String s;
    Container c;

    Login(String a) {
        this.s = a;
        frame = new JFrame(s + " Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(479, 281);
        frame.setLocation(500, 100);
        frame.getContentPane().setLayout(null);

        c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        // title
        title = new JLabel(s + " Login");
        title.setFont(new Font("arial", Font.BOLD, 25));
        title.setSize(150, 30);
        title.setLocation(160, 20);

        // name
        nameL = new JLabel(s + " Name:");
        nameL.setFont(new Font("arial", Font.BOLD, 12));
        nameL.setSize(80, 20);
        nameL.setLocation(130, 70);
        nameF = new JTextField();
        nameF.setSize(100, 20);
        nameF.setLocation(200, 70);

        // id
        idL = new JLabel(s + " id:");
        idL.setFont(new Font("arial", Font.BOLD, 12));
        idL.setSize(70, 20);
        idL.setLocation(130, 100);
        idF = new JPasswordField();
        idF.setSize(100, 20);
        idF.setLocation(200, 100);

        // login
        login = new JButton("Log in");
        login.addActionListener(this);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setSize(90, 30);
        login.setLocation(130, 143);

        // back to main menu
        menu = new JButton("< Menu");
        menu.addActionListener(this);
        menu.setFont(new Font("Arial", Font.BOLD, 14));
        menu.setSize(91, 30);
        menu.setLocation(230, 143);

        // containers
        c.add(title);
        c.add(nameL);
        c.add(nameF);
        c.add(idL);
        c.add(idF);
        c.add(login);
        c.add(menu);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login && s.equals("Admin")) {
            String pass = String.valueOf(idF.getPassword());
            String mainPass = "123456";
            if (nameF.getText().equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Empty Fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (nameF.getText().equals("NSU") && pass.equals(mainPass)) {
                new Admin_Panel();
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == login && s.equals("User")) {
            if (RunnningVote.getPublished()) {
                JOptionPane.showMessageDialog(null, RunnningVote.getVname() + " Already published", "Can't Vote", JOptionPane.INFORMATION_MESSAGE);
                new Menu1();
                frame.dispose();
                return;
            }

            String Lname = nameF.getText();
            String pass = String.valueOf(idF.getPassword());

            File f = new File("voter.ser");
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                boolean found = false;
                while (true) {
                    try {
                        Voter voter = (Voter) ois.readObject();
                        if (voter.getName().equals(Lname) && voter.getId().equals(pass)) {
                            new VotingWindow(voter.getName(), voter.getId());
                            frame.dispose();
                            found = true;
                            break;
                        }
                    } catch (EOFException ex) {
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "User Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == login && s.equals("Participant")) {
            String Lname = nameF.getText();
            String pass = String.valueOf(idF.getPassword());

            File f = new File("participant.ser");
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                boolean found = false;
                while (true) {
                    try {
                        Participant participant = (Participant) ois.readObject();
                        if (participant.getName().equals(Lname) && participant.getId().equals(pass)) {
                            // Open the participant's specific window
                            // new ParticipantWindow(participant.getName(), participant.getId());
                            frame.dispose();
                            found = true;
                            break;
                        }
                    } catch (EOFException ex) {
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Participant Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == menu) {
            new Menu1();
            frame.dispose();
        }
    }
}
