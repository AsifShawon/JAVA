package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.List;

public class BookingAccept extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JScrollPane scrollPane;
    private JButton backButton;
    private JButton acceptButton;

    public BookingAccept(Driver driver) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Create the table with an empty default table model
        table = new JTable(new DefaultTableModel());

        // Set table properties
        table.setFillsViewportHeight(true);
        table.setFont(new Font("Arial", Font.PLAIN, 12));

        // Create the scroll pane and add the table to it
        scrollPane = new JScrollPane(table);

        // Add the scroll pane to the content pane
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Retrieve the bookings data from the BookACar class
        BookACar bookACar = new BookACar();
        List<BookACarDetails> bookings = bookACar.getBookings();

        // Create the table model with column names and data
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[]{"Name", "Place No", "Details"}, 0);
        List<Integer> locs = driver.getLoc_id();

        // Add the matching bookings data to the table model
        for (BookACarDetails booking : bookings) {
            // Compare loc_id and place_no with your criteria
            if (locs.contains(booking.getPlace_no())) {
                tableModel.addRow(new Object[]{booking.getName(), booking.getPlace_no(), booking.getDetails()});
            }
        }

        // Set the table model to the table
        table.setModel(tableModel);

        // Create the Back button
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });

        acceptButton = new JButton("Accept");
        acceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                if (row != -1) {
                    String name = table.getValueAt(row, 0).toString();
                    int placeNo = Integer.parseInt(table.getValueAt(row, 1).toString());
                    String details = table.getValueAt(row, 2).toString();

                    String message = "Accepted booking: " + name + ", " + placeNo + ", " + details;
                    JOptionPane.showMessageDialog(null, message, "Success", JOptionPane.INFORMATION_MESSAGE);

                    bookACar.updateBookings(name, placeNo, details);

                    tableModel.removeRow(row);
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(backButton);
        buttonPanel.add(acceptButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

}
