package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Test1.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root, 1280, 720);
			stage.setTitle("Auto8000");
			stage.setScene(scene);
			stage.show();
		}catch (Exception e){
			System.out.println(e);
		}
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
