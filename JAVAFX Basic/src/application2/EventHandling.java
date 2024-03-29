package application2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventHandling extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("eventHandling.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

}
