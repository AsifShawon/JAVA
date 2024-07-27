package Project;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeeBookingPanel extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JScrollPane scrollPane;

    public SeeBookingPanel(String name) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        table = new JTable(new DefaultTableModel());
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        table.setFillsViewportHeight(true);

        scrollPane = new JScrollPane(table);

        contentPane.add(scrollPane, BorderLayout.CENTER);

        BookACar bookACar = new BookACar();
        java.util.List<BookACarDetails> bookings = bookACar.getBookings();

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[]{"Name", "Place No", "Details"}, 0);

        for (BookACarDetails booking : bookings) {
            tableModel.addRow(new Object[]{booking.getName(), booking.getPlace_no(), booking.getDetails()});
        }

        table.setModel(tableModel);

        // Add a "Back" button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UserPanel(getName());
            	dispose(); 
                }
        });
        backButton.setFont(new Font("Serif", Font.BOLD, 20));
        backButton.setBounds(10, 520, 100, 30);
        contentPane.add(backButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
