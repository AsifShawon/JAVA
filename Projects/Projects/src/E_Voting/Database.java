package E_Voting;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Database implements ActionListener{
	private JFrame frame;
	private Container c;
	private JTable table;
	private JButton delete,Back, menu, edit;
	private JTextField nameF,idF,dobF,phnF,deptF,emailF, searchF;
	private JTextArea addressF;
	private JLabel title, nameL, idL,dobL,phnL,addressL,deptL,emailL, search;
	private DefaultTableModel model;
	private String columns[] = {"Name", "Id", "Phone", "Dept", "Email", "DOB", "Address"};
	private String[] data;
	private int vnum=0;
	private JScrollPane bar;
	private TableRowSorter sorter;

	public Database() {
		frame = new JFrame("Database");
		frame.setSize(960,732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300,50);
		
		c = frame.getContentPane();
		c.setLayout(null);
		
		//title
		title = new JLabel("Voter Database");
		title.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		title.setSize(239,51);
		title.setLocation(326,10);
		c.add(title);
		
		
		// name
		nameL = new JLabel("User Name:");
		nameL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		nameL.setSize(90,31);
		nameL.setLocation(58,70);
		nameF = new JTextField();
		nameF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		nameF.setSize(152,30);
		nameF.setLocation(170,71);
		
		// id
		idL = new JLabel("User id:");
		idL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		idL.setSize(59,20);
		idL.setLocation(89,111);
		idF = new JTextField();
		idF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		idF.setSize(127,30);
		idF.setLocation(170,107);
		
		// phone number
		phnL = new JLabel("Phone Number:");
		phnL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		phnL.setSize(117,20);
		phnL.setLocation(31,151);
		phnF = new JTextField();
		phnF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		phnF.setSize(127,30);
		phnF.setLocation(170,147);
		
		// department
		deptL = new JLabel("Department:");
		deptL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		deptL.setSize(94,20);
		deptL.setLocation(54,189);
		deptF = new JTextField();
		deptF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		deptF.setSize(110,30);
		deptF.setLocation(170,187);
		
		// E-mail
		emailL = new JLabel("Email:");
		emailL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		emailL.setSize(45,20);
		emailL.setLocation(103,229);
		emailF = new JTextField();
		emailF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		emailF.setSize(152,30);
		emailF.setLocation(170,227);
		
		// date of birth
		dobL = new JLabel("DOB:");
		dobL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		dobL.setSize(38,20);
		dobL.setLocation(110,269);
		dobF = new JTextField();
		dobF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		dobF.setSize(127,30);
		dobF.setLocation(170,267);
		
		// address
		addressL = new JLabel("Address:");
		addressL.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		addressL.setSize(69,20);
		addressL.setLocation(79,312);
		addressF = new JTextArea();
		addressF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		bar = new JScrollPane(addressF);
		bar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		bar.setViewportView(addressF);
		bar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bar.setBounds(170, 307, 152, 50);
		
		// buttons
		// edit user
		edit = new JButton("Update");
		edit.setFont(new Font("Cambria", Font.BOLD, 18));
		edit.setBounds(576,70,200,50);
		edit.addActionListener(this);
		c.add(edit);
		
		// delete user
		delete = new JButton("Delete User");
        delete.setFont(new Font("Cambria", Font.BOLD, 18));
        delete.setBounds(576, 153, 200, 50);
        delete.addActionListener(this);
        c.add(delete);
        
        // participant window
        Back = new JButton("Back");
        Back.setFont(new Font("Cambria", Font.BOLD, 18));
        Back.setBounds(576, 235, 200, 50);
        Back.addActionListener(this);
        c.add(Back);
        
        // menu
        menu = new JButton("Menu");
        menu.setFont(new Font("Cambria", Font.BOLD, 18));
        menu.setBounds(576, 314, 200, 50);
        menu.addActionListener(this);
        c.add(menu);
		
        
        // containers
		c.add(nameL);
		c.add(nameF);
		c.add(idL);
		c.add(idF);
		c.add(phnL);
		c.add(phnF);
		c.add(deptL);
		c.add(deptF);
		c.add(emailL);
		c.add(emailF);
		c.add(dobL);
		c.add(dobF);
		c.add(addressL);
		c.add(bar);
		
		// search
				search = new JLabel("Search Here");
				search.setBounds(211,388,94,30);
				search.setFont(new Font("Lucida Bright", Font.BOLD, 15));
				c.add(search);
				searchF = new JTextField();
		        searchF.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		        searchF.setBounds(315, 389, 167, 30);
		        c.add(searchF);
		        
		// data entry
		File f = new File("voter.dat");
		
		//if(f.exists()) System.out.println("exists");
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			while(true) {
				dis.readUTF();
				dis.readUTF();
				dis.readUTF();
				dis.readUTF();
				dis.readUTF();
				dis.readUTF();
				dis.readUTF();
				vnum++;
			}
		}
		catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		
		// table
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setSize(666,227);
		table.setLocation(10,326);
		sorter = new TableRowSorter<>(model);
        table.setFont(new Font(null, Font.PLAIN, 15));
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setRowSorter(sorter);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setForeground(Color.GRAY);
        scroll.setFont(new Font("Consolas", Font.BOLD, 15));
        scroll.setBounds(10,460,928,225);
        c.add(scroll);
        
		data = new String[7];
		
		File f1 = new File("voter.dat");
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f1))){
			for(int i=0; i<vnum; i++) {
				data[0] = dis.readUTF();
				data[1] = dis.readUTF();
				data[2] = dis.readUTF();
				data[3] = dis.readUTF();
				data[4] = dis.readUTF();
				data[5] = dis.readUTF();
				data[6] = dis.readUTF();
				model.addRow(data);
			}
		}
		
		catch (Exception e) {
			//System.out.println(e.getMessage()+"2");
		}
        
        JLabel lblDdmmyyyy = new JLabel("dd-mm-yyyy");
        lblDdmmyyyy.setFont(new Font("Calisto MT", Font.BOLD, 15));
        lblDdmmyyyy.setBounds(304, 275, 138, 20);
        frame.getContentPane().add(lblDdmmyyyy);
        
        // selection
        table.addMouseListener (new MouseAdapter(){
            public void mouseClicked (MouseEvent me){
                int numberofRow =table.getSelectedRow();
                
                String s = model.getValueAt(numberofRow,0).toString();
                nameF.setText(s);
                s = model.getValueAt(numberofRow,1).toString();
                idF.setText(s);
                s = model.getValueAt(numberofRow,2).toString();
                phnF.setText(s);
                s = model.getValueAt(numberofRow,3).toString();
                deptF.setText(s);
                s = model.getValueAt(numberofRow,4).toString();
                emailF.setText(s);
                s = model.getValueAt(numberofRow,5).toString();
                dobF.setText(s);
                s = model.getValueAt(numberofRow,6).toString();
                addressF.setText(s);
               }
              });
        
        
        // search
        searchF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
               search(searchF.getText());
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
               search(searchF.getText());
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
               search(searchF.getText());
            }
            public void search(String str) {
               if (str.length() == 0) {
                  sorter.setRowFilter(null);
               } else {
                  sorter.setRowFilter(RowFilter.regexFilter(str));
               }
            }
         });
        
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==edit) {
			int row = table.getSelectedRow();
			String s[][] = new String[vnum][7];
			Voter v = new Voter(nameF.getText(),idF.getText(),phnF.getText(),deptF.getText(),emailF.getText(),dobF.getText(),addressF.getText());
			File f = new File("voter.dat");
			try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
				for(int i=0; i<vnum; i++) {
					s[i][0] = dis.readUTF();
					s[i][1] = dis.readUTF();
					s[i][2] = dis.readUTF();
					s[i][3] = dis.readUTF();
					s[i][4] = dis.readUTF();
					s[i][5] = dis.readUTF();
					s[i][6] = dis.readUTF();
				}
			}
			catch(EOFException ex) {
				//
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
				for(int i=0; i<vnum; i++) {
					if(i==row) {
						dos.writeUTF(v.getName());
						dos.writeUTF(v.getId());
						dos.writeUTF(v.getPhnum());
						dos.writeUTF(v.getDept());
						dos.writeUTF(v.getEmail());
						dos.writeUTF(v.getDob());
						dos.writeUTF(v.getAddress());
					}
					else {
						dos.writeUTF(s[i][0]);
						dos.writeUTF(s[i][1]);
						dos.writeUTF(s[i][2]);
						dos.writeUTF(s[i][3]);
						dos.writeUTF(s[i][4]);
						dos.writeUTF(s[i][5]);
						dos.writeUTF(s[i][6]);
					}
				}
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			model.setValueAt(v.getName(), row, 0);
			model.setValueAt(v.getId(), row, 1);
			model.setValueAt(v.getPhnum(), row, 2);
			model.setValueAt(v.getDept(), row, 3);
			model.setValueAt(v.getEmail(), row, 4);
			model.setValueAt(v.getDob(), row, 5);
			model.setValueAt(v.getAddress(), row, 6);
			
		}
		
		if(e.getSource()==delete) {
			int row = table.getSelectedRow();
			
			String s[][] = new String[vnum][7];
			Voter v = new Voter(nameF.getText(),idF.getText(),phnF.getText(),deptF.getText(),emailF.getText(),dobF.getText(),addressF.getText());
			File f = new File("voter.dat");
			try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
				for(int i=0; i<vnum; i++) {
					s[i][0] = dis.readUTF();
					s[i][1] = dis.readUTF();
					s[i][2] = dis.readUTF();
					s[i][3] = dis.readUTF();
					s[i][4] = dis.readUTF();
					s[i][5] = dis.readUTF();
					s[i][6] = dis.readUTF();
				}
			}
			catch(EOFException ex) {
				//
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
			}
			
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
				int j=0;
				for(int i=0; i<vnum; i++) {
					if(row==i) {
						model.removeRow(row);
						continue;
					}
					else {
						dos.writeUTF(s[i][0]);
						dos.writeUTF(s[i][1]);
						dos.writeUTF(s[i][2]);
						dos.writeUTF(s[i][3]);
						dos.writeUTF(s[i][4]);
						dos.writeUTF(s[i][5]);
						dos.writeUTF(s[i][6]);
						model.setValueAt(s[i][0], j, 0);
						model.setValueAt(s[i][1], j, 1);
						model.setValueAt(s[i][2], j, 2);
						model.setValueAt(s[i][3], j, 3);
						model.setValueAt(s[i][4], j, 4);
						model.setValueAt(s[i][5], j, 5);
						model.setValueAt(s[i][6], j, 6);
						j++;
					}
				}
			}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if(e.getSource()==Back) {
			new Admin_Panel();
			frame.dispose();
		}
		
		if(e.getSource()==menu) {
			new Menu1();
			frame.dispose();
		}
	}
}