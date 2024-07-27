package E_Voting;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PartDatabase implements ActionListener {

    private JFrame frame;
    private JButton Back, menu, show;
    private JLabel title, title2, title3, search1, search2;
    private JTextField search1F, search2F;
    private Container c;
    private DefaultTableModel model1, model2;
    private String[] columns1 = {"Name", "Id", "Dept", "Email", "DOB", "Address"};
    private String[] columns2 = {"Election Name", "Participant Number"};
    private String vname, elecName;
    private int elecPNum;
    private JTable table, table2;
    private TableRowSorter<DefaultTableModel> sorter, sorter2;

    public PartDatabase() {
        frame = new JFrame("Participant Database");
        frame.setSize(960, 732);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setLocation(300, 50);

        c = frame.getContentPane();
        c.setLayout(null);

        // Title
        title = new JLabel("Participant Database");
        title.setForeground(new Color(70, 130, 180));
        title.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        title.setSize(331, 51);
        title.setLocation(287, 10);
        c.add(title);

        title2 = new JLabel("Election Name");
        title2.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
        title2.setSize(185, 51);
        title2.setLocation(76, 61);
        c.add(title2);

        title3 = new JLabel("Participant Details");
        title3.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
        title3.setSize(264, 51);
        title3.setLocation(587, 61);
        c.add(title3);

        // Participant window
        Back = new JButton("Back");
        Back.setBackground(new Color(0, 206, 209));
        Back.setFont(new Font("Cambria", Font.BOLD, 18));
        Back.setBounds(256, 619, 200, 50);
        Back.addActionListener(this);
        c.add(Back);

        // Menu
        menu = new JButton("Menu");
        menu.setBackground(new Color(143, 188, 143));
        menu.setFont(new Font("Cambria", Font.BOLD, 18));
        menu.setBounds(499, 619, 200, 50);
        menu.addActionListener(this);
        c.add(menu);

        // Show
        show = new JButton("Show >");
        show.setFont(new Font("Cambria", Font.BOLD, 18));
        show.setBounds(351, 345, 105, 40);
        show.addActionListener(this);
        c.add(show);

        // Search 1
        search1 = new JLabel("Search Here");
        search1.setBounds(580, 120, 94, 30);
        search1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
        c.add(search1);
        search1F = new JTextField();
        search1F.setFont(new Font("Ubuntu", Font.PLAIN, 15));
        search1F.setBounds(684, 121, 167, 30);
        c.add(search1F);

        // Search 2
        search2F = new JTextField();
        search2F.setFont(new Font("Ubuntu", Font.PLAIN, 15));
        search2F.setBounds(138, 120, 167, 30);
        c.add(search2F);
        search2 = new JLabel("Search Here");
        search2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
        search2.setBounds(34, 119, 94, 30);
        c.add(search2);

        // Table 2
        table2 = new JTable();
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columns2);
        table2.setModel(model2);
        table2.setSize(666, 227);
        table2.setLocation(10, 326);
        sorter2 = new TableRowSorter<>(model2);
        table2.setFont(new Font(null, Font.PLAIN, 15));
        table2.setSelectionBackground(Color.GREEN);
        table2.setBackground(Color.WHITE);
        table2.setRowHeight(30);
        table2.setRowSorter(sorter2);
        JScrollPane scroll2 = new JScrollPane(table2);
        scroll2.setForeground(Color.GRAY);
        scroll2.setFont(new Font("Consolas", Font.BOLD, 15));
        scroll2.setBounds(10, 161, 331, 424);
        c.add(scroll2);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("participantFileName.ser"))) {
            while (true) {
                Object obj = ois.readObject();
                if (obj instanceof String) {
                    String electionName = (String) obj;
                    int participantNumber = ois.readInt();
                    model2.addRow(new String[]{electionName, Integer.toString(participantNumber)});
                }
            }
        } catch (EOFException ignored) {
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "File not found 1", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Selection 2
        table2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int numberofRow1 = table2.getSelectedRow();
                elecName = model2.getValueAt(numberofRow1, 0).toString();
                elecPNum = Integer.parseInt(model2.getValueAt(numberofRow1, 1).toString());
            }
        });

        // Search 2
        search2F.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                search(search2F.getText(), sorter2);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search(search2F.getText(), sorter2);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                search(search2F.getText(), sorter2);
            }
        });

        // Table 1
        table = new JTable();
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns1);
        table.setModel(model1);
        table.setSize(666, 227);
        table.setLocation(10, 326);
        sorter = new TableRowSorter<>(model1);
        table.setFont(new Font(null, Font.PLAIN, 15));
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setRowSorter(sorter);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setForeground(Color.GRAY);
        scroll.setFont(new Font("Consolas", Font.BOLD, 15));
        scroll.setBounds(468, 161, 468, 424);
        c.add(scroll);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == show) {
            model1.getDataVector().removeAllElements();
            model1.fireTableDataChanged();

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(elecName + ".ser"))) {
                while (true) {
                    Object obj = ois.readObject();
                    if (obj instanceof Voter) {
                        Voter voter = (Voter) obj;
                        model1.addRow(new String[]{
                                voter.getName(), voter.getId(), voter.getDept(), voter.getEmail(), voter.getDob(), voter.getAddress()
                        });
                    }
                }
            } catch (EOFException ignored) {
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Search 1
            search1F.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    search(search1F.getText(), sorter);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    search(search1F.getText(), sorter);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    search(search1F.getText(), sorter);
                }
            });
        }

        if (e.getSource() == Back) {
            new Admin_Panel();
            frame.dispose();
        }
        if (e.getSource() == menu) {
            new Menu1();
            frame.dispose();
        }
    }

    private void search(String str, TableRowSorter<DefaultTableModel> sorter) {
        if (str.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(str));
        }
    }
}
