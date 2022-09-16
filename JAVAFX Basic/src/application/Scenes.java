package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scenes extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.SKYBLUE);
		Stage stage = new Stage();
		
		// Adding text
		Text text = new Text();
		text.setText("Hello! \nGood People...");
		text.setX(100);
		text.setY(200);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.LIGHTBLUE);
		
		// adding line
		Line line = new Line(/* 50,50,200,200 */);
		// we can use
		line.setStartX(50);
		line.setStartY(80);
		line.setEndX(400);
		line.setEndY(50);
		line.setStrokeWidth(4);
		line.setStroke(Color.BLUEVIOLET);
		line.setOpacity(0.3);
		line.setRotate(45);
		
		// rectangle
		Rectangle rectangle = new Rectangle(100,220,400,50);// [ .setX(),.setY(),.setWidth(),setHeight() ]
		rectangle.setFill(Color.BEIGE);
		rectangle.setStrokeWidth(2);
//		rectangle.setStroke(Color.BLACK);
		
		// triangle
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(370.0,100.0,
									320.0,300.0,
									420.0,300.0);
		triangle.setFill(Color.CADETBLUE);
		
		//circle
		Circle circle = new Circle(200,230,120.0); // [ .setCenterX(), .setCenterY(), .setRadius() ]
		circle.setFill(Color.CRIMSON);
		
		Image image = new Image("valo.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(200);
		imageView.setY(400);
		
		// adding components
		root.getChildren().add(imageView);
		root.getChildren().add(circle);
		root.getChildren().add(triangle);
		root.getChildren().add(rectangle);
		root.getChildren().add(line);
		root.getChildren().add(text);
		stage.setScene(scene);
		stage.show();
	}

}
