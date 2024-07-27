package Table;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;



public class ComboBoxDemo1 extends JFrame implements ActionListener {
    
 private Container c;
 private JComboBox cb;
 private String[] genres ={"BookTable","MovieTable","ModelTable","MusicTable"};
 private JButton nextButton;
    ComboBoxDemo1(){
        initComponents();

    }

    public void  initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("ComboBox Demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
		
		  Font font=new Font("Arial",Font.BOLD,16);
		
        
        cb=new JComboBox(genres);
        cb.setBounds(150,200,150,50);
        cb.setEditable(true);
        c.add(cb);
		
		 nextButton=new JButton("Next");
          nextButton.setBounds(300,350,70,30);
                  nextButton.setFont(font);
                  c.add(nextButton);
                   nextButton.addActionListener(this);
                   
                   setVisible(true);
        
    }
          @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nextButton) {
        	if(cb.getSelectedItem().equals("BookTable")) {
        		new BookTable();
        		dispose();
        	}
        	else if(cb.getSelectedItem().equals("MovieTable")) {
        		
        		//new MovieTable();
        		dispose();
        	}
        	else if(cb.getSelectedItem().equals("ModelTable")) {
        		//new ModelTable();
        		dispose();
        	}
        	else if(cb.getSelectedItem().equals("MusicTable")) {
        		//new MusicTable();
        		dispose();
        	}
        }
    }      
}
