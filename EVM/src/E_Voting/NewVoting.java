package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NewVoting implements ActionListener {
    private JFrame frame = new JFrame("New Voting Create");
    private JButton next, menu;
    private JLabel vname, user, title, participateNum;
    private JTextField fname, fparticipate;
    private Container c;
    private String filename;
    private int pnum;

    public NewVoting() {
        // frame basic
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(521, 325);
        frame.setLocation(500, 100);
        frame.getContentPane().setLayout(null);

        // container
        c = frame.getContentPane();
        c.setLayout(null);

        // title
        title = new JLabel("Create New Election");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setSize(316, 50);
        title.setLocation(107, 10);

        // new voting name
        vname = new JLabel("Election Name:");
        vname.setFont(new Font("Calisto MT", Font.BOLD, 15));
        vname.setSize(110, 36);
        vname.setLocation(110, 70);
        fname = new JTextField();
        fname.setFont(new Font("Dialog", Font.PLAIN, 15));
        fname.setSize(153, 35);
        fname.setLocation(230, 70);

        // participate
        participateNum = new JLabel("How many participants:");
        participateNum.setFont(new Font("Calisto MT", Font.BOLD, 15));
        participateNum.setSize(170, 30);
        participateNum.setLocation(50, 116);
        fparticipate = new JTextField();
        fparticipate.setFont(new Font("Dialog", Font.PLAIN, 15));
        fparticipate.setSize(54, 30);
        fparticipate.setLocation(230, 115);

        // next button
        next = new JButton("Next >");
        next.addActionListener(this);
        next.setFont(new Font("Cambria Math", Font.BOLD, 18));
        next.setSize(98, 41);
        next.setLocation(213, 162);

        // go back to menu
        menu = new JButton("<< Go back to Admin Panel");
        menu.addActionListener(this);
        menu.setFont(new Font("Arial", Font.BOLD, 15));
        menu.setSize(238, 48);
        menu.setLocation(145, 213);
        menu.setBackground(Color.yellow);

        // containers
        c.add(title);
        c.add(vname);
        c.add(fname);
        c.add(participateNum);
        c.add(fparticipate);
        c.add(next);
        c.add(menu);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            try {
                filename = fname.getText();
                pnum = Integer.parseInt(fparticipate.getText()); // to retrieve integer value
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Enter all details", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            RunnningVote.setVname(filename);
            // setting the running vote name, as when admin create a new vote system
            // it becomes the running one

            List<Participant> participants = new ArrayList<>();

            JPanel p = new JPanel(new GridLayout(6, 2));
            JLabel lpname = new JLabel("Participant name:");
            JTextField fpname = new JTextField();
            JLabel lpdept = new JLabel("Department:");
            JTextField fpdept = new JTextField();
            JLabel lpid = new JLabel("Participant ID:");
            JTextField fpid = new JTextField();
            JLabel lpemail = new JLabel("Email:");
            JTextField fpemail = new JTextField();
            JLabel lpdob = new JLabel("DOB:");
            JTextField fpdob = new JTextField();
            JLabel lpaddress = new JLabel("Address:");
            JTextField fpaddress = new JTextField();

            p.add(lpname);
            p.add(fpname);
            p.add(lpdept);
            p.add(fpdept);
            p.add(lpid);
            p.add(fpid);
            p.add(lpemail);
            p.add(fpemail);
            p.add(lpdob);
            p.add(fpdob);
            p.add(lpaddress);
            p.add(fpaddress);

            for (int i = 0; i < pnum; ++i) {
                JOptionPane.showMessageDialog(null, p, "Participant Panel", JOptionPane.OK_CANCEL_OPTION);

                String pname = fpname.getText();
                String pdept = fpdept.getText();
                String pid = fpid.getText();
                String pemail = fpemail.getText();
                String pdob = fpdob.getText();
                String paddress = fpaddress.getText();

                if (pname.isEmpty() || pdept.isEmpty() || pid.isEmpty() || pemail.isEmpty() || pdob.isEmpty() || paddress.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all entries", "Wrong Entry", JOptionPane.ERROR_MESSAGE);
                    --i;
                    continue;
                }

                participants.add(new Participant(pname, pid, "", pdept, pemail, pdob, paddress));

                fpname.setText(null);
                fpdept.setText(null);
                fpid.setText(null);
                fpemail.setText(null);
                fpdob.setText(null);
                fpaddress.setText(null);
            }

            VotingSession votingSession = new VotingSession(filename, participants);

            File f = new File(filename + ".ser"); // participant's details

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
                oos.writeObject(votingSession);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "File Cannot be created", "Error", JOptionPane.ERROR_MESSAGE);
            }

            File f2 = new File("participantFileName.ser");

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2, true))) {
                oos.writeObject(filename);
                oos.writeInt(pnum);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "File Cannot be created", "Error", JOptionPane.ERROR_MESSAGE);
            }
            new Admin_Panel();
            frame.dispose();
        }
        if (e.getSource() == menu) {
            new Admin_Panel();
            frame.dispose();
        }
    }
}
