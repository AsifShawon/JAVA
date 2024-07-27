package Table;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class BookTable extends JFrame implements ActionListener {
    
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLabel, categoryLabel,nameLabel,priceLabel;
    private JTextField categoryTF,nameTF,priceTF;
    private JButton addButton,updateButton,deleteButton,clearButton,nextButton;;
    
    private  String[] columns = {"Category","Book Name","Price" }; 
     private  String[] rows= new String[3];
   private int bookCount = 0;
     
//    BookTable(){
//        
//        initComponents();
//        
//    }

   		 public BookTable() {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(780,690);
         this.setLocationRelativeTo(null);
         this.setTitle("Book table");
         
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.white);
         
         Font font=new Font("Arial",Font.BOLD,16);
         
         titleLabel=new JLabel("Book list & Price");
          titleLabel.setFont(font);
          titleLabel.setBounds(140,10,250,50);
          c.add( titleLabel);
          
          
         categoryLabel=new JLabel("Category");
         categoryLabel.setBounds(10,80,140,30);
          categoryLabel.setFont(font);
          c.add( categoryLabel);
          
               
         categoryTF=new JTextField();
        categoryTF.setBounds(110,80,200,30);
          categoryTF.setFont(font);
          c.add(categoryTF);
          
          addButton=new JButton("Add");
          addButton.setBounds(400,80,100,30);
                  addButton.setFont(font);
                  c.add(addButton);
          
                   
         nameLabel=new JLabel("Book name");
        nameLabel.setBounds(10,130,150,30);
          nameLabel.setFont(font);
          c.add( nameLabel);
          
           nameTF=new JTextField();
        nameTF.setBounds(110,130,200,30);
          nameTF.setFont(font);
          c.add(nameTF);
          
          updateButton=new JButton("Update");
           updateButton.setBounds(400,130,100,30);
                  updateButton.setFont(font);
                  c.add(updateButton);
                  
          priceLabel=new JLabel("Price");
      priceLabel.setBounds(10,180,150,30);
         priceLabel.setFont(font);
          c.add( priceLabel);
          
              priceTF=new JTextField();
        priceTF.setBounds(110,180,200,30);
          priceTF.setFont(font);
          c.add(priceTF);
                  
          
           deleteButton=new JButton("Delete");
           deleteButton.setBounds(400,180,100,30);
                  deleteButton.setFont(font);
                  c.add(deleteButton);
          
              clearButton=new JButton("Clear");
           clearButton.setBounds(400,230,100,30);
                  clearButton.setFont(font);
                  c.add(clearButton);  
                  
                  	 nextButton=new JButton("Next");
          nextButton.setBounds(400,280,100,30);
                  nextButton.setFont(font);
                  c.add(nextButton);
                 nextButton.addActionListener(this);
        
                  
                   table=new JTable();
                   model=new DefaultTableModel();
                   model.setColumnIdentifiers(columns);
                   table.setModel(model);
                   table.setFont(font);
                   table.setSelectionBackground(Color.GREEN);
                   table.setBackground(Color.WHITE);
                   table.setRowHeight(30);
                   
                   // ----

                   File f = new File("BookTable.dat");
                   
                   if(f.exists()) {
                   try(DataInputStream dos = new DataInputStream(new FileInputStream(f))){
                   	while(true) {
                	   rows[0] = dos.readUTF();
                	   rows[1] = dos.readUTF();
                	   rows[2] = dos.readUTF();
                	   bookCount++;
                	   model.addRow(rows);
                   	}
                   }
                   catch(EOFException ex) {
                	   
                   }
                   catch(Exception ex) {
                   	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
                   }
                   }
                   
                  
                 scroll=new JScrollPane(table);
                 scroll.setBounds(10,360,740,265);
                 c.add(scroll);
          addButton.addActionListener(this);
          clearButton.addActionListener(this);
          deleteButton.addActionListener(this);
          updateButton.addActionListener(this);
           
            
            
          table.addMouseListener (new MouseAdapter(){
          
        public void mouseClicked (MouseEvent me){
           
            int numberofRow =table.getSelectedRow();
            
            String category= model.getValueAt(numberofRow,0).toString();
              String name= model.getValueAt(numberofRow,1).toString(); 
              String price= model.getValueAt(numberofRow,2).toString();
            
               categoryTF.setText(category);
              nameTF.setText(name);
             priceTF.setText( price);    
           }
          });
          setVisible(true);
                  }
    
       @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==addButton){
        
        rows[0]= categoryTF.getText();
        rows[1]= nameTF.getText();      
        rows[2]= priceTF.getText();
        model.addRow(rows);
        
        File f = new File("BookTable.dat");
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))){
        	dos.writeUTF(rows[0]);
        	dos.writeUTF(rows[1]);
        	dos.writeUTF(rows[2]);
        }
        catch(Exception ex) {
        	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
        else if(e.getSource()==clearButton){
        
            
            categoryTF.setText("");
          nameTF.setText("");
            priceTF.setText("");
              
    }
        
        else if(e.getSource()==deleteButton){
            
            int numberofRow = table.getSelectedRow();
             if(numberofRow>=0){
                 model.removeRow(numberofRow);
             }
             else {
                 
                 JOptionPane.showMessageDialog(null,"No row has been selected or no row exist");
             }
            
             File f = new File("BookTable.dat");
             String cat[] = new String[bookCount], Bname[] = new String[bookCount], Bprice[] = new String[bookCount];
             
             if(f.exists()) { 
             try(DataInputStream dos = new DataInputStream(new FileInputStream(f))){
             	for(int i=0; i<bookCount; i++) {
             		cat[i] = dos.readUTF();
             		Bname[i] = dos.readUTF();
             		Bprice[i] = dos.readUTF();
             	}
             }
             catch(EOFException ex) {
            	 JOptionPane.showMessageDialog(null,"Not possible","Error",JOptionPane.ERROR_MESSAGE);
             }
             catch(Exception ex) {
             	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
             	}
             }
             try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
            	 for(int i=0; i<bookCount; i++) {
            		 if(i!=numberofRow) {
            	 dos.writeUTF(cat[i]);
             	dos.writeUTF(Bname[i]);
             	dos.writeUTF(Bprice[i]);
            		 }
             	}
             }
             catch(Exception ex) {
             	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
             }
        }
        
        else if(e.getSource()==updateButton){
            int numberofrow=table.getSelectedRow();
            
             String category=categoryTF.getText();
            String name= nameTF.getText();
              String price=  priceTF.getText();
              
             model.setValueAt(category,numberofrow ,0 );
             model.setValueAt(name,numberofrow ,1 );
             model.setValueAt(price,numberofrow ,2 );
             
             File f = new File("BookTable.dat");
             
             String cat[] = new String[bookCount], Bname[] = new String[bookCount], Bprice[] = new String[bookCount];
             
             if(f.exists()) {
             try(DataInputStream dos = new DataInputStream(new FileInputStream(f))){
             	for(int i=0; i<bookCount; i++) {
             		cat[i] = dos.readUTF();
             		Bname[i] = dos.readUTF();
             		Bprice[i] = dos.readUTF();
             	}
             }
             catch(EOFException ex) {
            	 JOptionPane.showMessageDialog(null,"Updating Not Possible","Error",JOptionPane.ERROR_MESSAGE);
             }
             catch(Exception ex) {
             	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
             	}
             }
             
             
             // updating 
             cat[numberofrow] = category;
             Bname[numberofrow] = name;
             Bprice[numberofrow] = price;
             
             
             try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
            	 for(int i=0; i<bookCount; i++) {
            	 dos.writeUTF(cat[i]);
             	dos.writeUTF(Bname[i]);
             	dos.writeUTF(Bprice[i]);
             	}
             }
             catch(Exception ex) {
             	JOptionPane.showMessageDialog(null,"File Cannot be created","Error",JOptionPane.ERROR_MESSAGE);
             }
        }
        
//        else {
//        
//            ArtTable frame= new ArtTable();
//            frame.setVisible(true);    
//        } 
        
        
    }
    
}

