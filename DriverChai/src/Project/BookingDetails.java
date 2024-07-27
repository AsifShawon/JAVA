package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BookingDetails extends JFrame {
    private JPanel contentPane;
    private JTable table;
    private JButton btnBack;

    public BookingDetails() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        scrollPane.setViewportView(table);

        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        contentPane.add(btnBack, BorderLayout.SOUTH);

        populateTable();
        setVisible(true);
    }

    private void populateTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Place No");
        model.addColumn("Details");
        BookACar L = new BookACar();
        List<BookACarDetails> bacds = L.getBookings();
        for (BookACarDetails bacd: bacds) {
            model.addRow(new Object[]{bacd.getName(), bacd.getPlace_no(), bacd.getDetails()});
        }

        table.setModel(model);
    }
}

