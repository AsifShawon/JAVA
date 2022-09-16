package application2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
	private Circle myCircle, myCircle2;
	private double x,y;
	
	public void up(ActionEvent e) {
//		System.out.println("UP");
		myCircle.setCenterY(y-=10);
//		System.out.println(x + "," + y + "|" + myCircle2.getCenterX() + ","+myCircle2.getCenterY());
//		if(x==90.0 && y==100.0) {
//			new Congo();
//		}
	}
	
	public void down(ActionEvent e) {
//		System.out.println("UP");
		myCircle.setCenterY(y+=10);
//		System.out.println(x + "," + y + "|" + myCircle2.getCenterX() + ","+myCircle2.getCenterY());
//		if(x==90.0 && y==100.0) {
//			new Congo();
//		}
	}

	public void left(ActionEvent e) {
//		System.out.println("LEFT");
		myCircle.setCenterX(x-=10);
//		System.out.println(x + "," + y + "|" + myCircle2.getCenterX() + ","+myCircle2.getCenterY());
//		if(x==90.0 && y==100.0) {
//			new Congo();
//		}
	}
	
	public void right(ActionEvent e) {
//		System.out.println("RIGHT");
		myCircle.setCenterX(x+=10);
//		System.out.println(x + "," + y + "|" + myCircle2.getCenterX() + ","+myCircle2.getCenterY());
//		if(x==90.0 && y==100.0) {
//			new Congo();
//		}
	}
}
