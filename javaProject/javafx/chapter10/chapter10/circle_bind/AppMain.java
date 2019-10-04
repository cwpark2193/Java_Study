package chapter10.circle_bind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//1. root container ����(�� ����: �ڹ����α׷�,fxml)
		//2. scene ����
		//3. scene ����
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("����");
		primaryStage.show();
		
	}

}
