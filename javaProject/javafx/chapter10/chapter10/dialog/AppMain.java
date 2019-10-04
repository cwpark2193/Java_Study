package chapter10.dialog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//1. root container 만듦(두 가지: 자바프로그램,fxml)
		//2. scene 만듦
		//3. scene 적용
	
		HBox hbox = (HBox)FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene=new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("재훈");
		primaryStage.show();
		
	}

}
