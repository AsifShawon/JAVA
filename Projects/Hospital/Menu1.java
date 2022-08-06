package Hospital;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu1 implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton admit,appoint,medicine;
	
	Menu1() {
		frame = new JFrame("Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		admit = new JButton("Admit a patient");
		appoint = new JButton("Appoint a Doctor");
		medicine = new JButton("Get Medicine");
		admit.addActionListener(this);
		appoint.addActionListener(this);
		medicine.addActionListener(this);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.add(admit);
		panel.add(appoint);
		panel.add(medicine);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==admit) {
			
		}
		if(e.getSource()==appoint) {
			
		}
		if(e.getSource()==medicine) {
	
		}
		
}

}
