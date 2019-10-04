package chapter10.hbox_text;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		//1. 루트 컨테이너와 컨트롤러를 만든다.
//		HBox hBox=new HBox();
//		hBox.setPrefSize(500, 150);
//		hBox.setAlignment(Pos.CENTER);//가운데정렬
//		hBox.setSpacing(20);
//		
//		//2. 컨트롤러 생성(TextFied,Button)
//		TextField tf=new TextField();
//		tf.setPrefSize(375, 60);
//				
//		Button button = new Button();
//		button.setText("확인");
//		button.setOnAction((e)->Platform.exit());//임시객체형태
//		
//		//3. 루트컨테이너에 컨트롤러를 집어넣는다.
//		ObservableList<Node> list=hBox.getChildren();
//		list.add(tf);
//		list.add(button);
		
		Parent hBox = FXMLLoader.load(getClass().getResource("root.fxml"));
		//1.~3.번까지 진행한 root.fxml을 가져온다
		//4.루트 컨테이너를 scene에 집어넣는다.
		Scene scene=new Scene(hBox);
		
		//5. stage에 scene를 집어넣는다.
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
