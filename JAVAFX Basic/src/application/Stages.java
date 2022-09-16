package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;


public class Stages extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// Stage stage = new Stage(); // creates a new stage
		Group root  = new Group();
		Scene scene = new Scene(root,Color.AQUA); // changing the background color
		
		// setting the title icon
		Image icon = new Image("valo.png");
		stage.getIcons().add(icon);
		
		// setting the title
		stage.setTitle("First Fx");
		
		// adding a scene to stage
		stage.setScene(scene);
		
		// resizing window/ stage
		stage.setWidth(500);
		stage.setHeight(500);
		stage.setResizable(false);
		
		// setting location
		stage.setX(100);
		stage.setY(100);
		
		stage.setFullScreen(true); // to set full screen 
		stage.setFullScreenExitHint("Press / to view lower"); 
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("/")); // "esc" key in default
		
		// showing the stage
		stage.show();
		
	}
}
