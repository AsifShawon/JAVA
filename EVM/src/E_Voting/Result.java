package E_Voting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Result implements ActionListener {
    private JFrame frame;
    private JLabel resultOf, winner, winner2;
    private JButton menu;
    Container c;

    public Result() {
        frame = new JFrame("Result");
        frame.setForeground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 100);
        frame.setSize(548, 550);

        c = frame.getContentPane();
        c.setLayout(null);

        if (!RunnningVote.getPublished()) {
            JOptionPane.showMessageDialog(null, "Result not published yet", "Not Published", JOptionPane.INFORMATION_MESSAGE);
            new Menu1();
            return;
        }

        String runningVote = RunnningVote.getVname();

        try {
            FileInputStream fileIn = new FileInputStream(runningVote + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            VotingSession votingSession = (VotingSession) in.readObject();
            in.close();
            fileIn.close();

            String voteName = votingSession.getElectionName();
            int maxVotes = 0;
            String winnerName = "";

            for (Participant participant : votingSession.getParticipants()) {
                if (participant.getVote() > maxVotes) {
                    maxVotes = participant.getVote();
                    winnerName = participant.getName();
                }
            }

            // result of
            resultOf = new JLabel("Result of " + voteName);
            resultOf.setForeground(Color.BLUE);
            resultOf.setBackground(Color.GRAY);
            resultOf.setSize(256, 100);
            resultOf.setLocation(149, 41);
            resultOf.setFont(new Font("Goudy Old Style", Font.BOLD, 31));

            // winner
            winner = new JLabel("The winner is " + winnerName + " with");
            winner.setSize(397, 100);
            winner.setLocation(92, 120);
            winner.setFont(new Font("Goudy Old Style", Font.BOLD, 31));

            winner2 = new JLabel(maxVotes + " votes");
            winner2.setSize(118, 100);
            winner2.setLocation(224, 183);
            winner2.setFont(new Font("Goudy Old Style", Font.BOLD, 31));

            // menu
            menu = new JButton("Menu");
            menu.setBackground(Color.WHITE);
            menu.addActionListener(this);
            menu.setSize(143, 45);
            menu.setLocation(204, 293);
            menu.setFont(new Font("Bell MT", Font.BOLD, 25));

            c.add(resultOf);
            c.add(winner);
            c.add(winner2);
            c.add(menu);

            frame.setVisible(true);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error reading voting results", "Error", JOptionPane.ERROR_MESSAGE);
            new Menu1();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            new Menu1();
            frame.dispose();
        }
    }
}
