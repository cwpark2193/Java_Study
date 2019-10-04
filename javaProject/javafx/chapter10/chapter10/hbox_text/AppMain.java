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
//		//1. ��Ʈ �����̳ʿ� ��Ʈ�ѷ��� �����.
//		HBox hBox=new HBox();
//		hBox.setPrefSize(500, 150);
//		hBox.setAlignment(Pos.CENTER);//�������
//		hBox.setSpacing(20);
//		
//		//2. ��Ʈ�ѷ� ����(TextFied,Button)
//		TextField tf=new TextField();
//		tf.setPrefSize(375, 60);
//				
//		Button button = new Button();
//		button.setText("Ȯ��");
//		button.setOnAction((e)->Platform.exit());//�ӽð�ü����
//		
//		//3. ��Ʈ�����̳ʿ� ��Ʈ�ѷ��� ����ִ´�.
//		ObservableList<Node> list=hBox.getChildren();
//		list.add(tf);
//		list.add(button);
		
		Parent hBox = FXMLLoader.load(getClass().getResource("root.fxml"));
		//1.~3.������ ������ root.fxml�� �����´�
		//4.��Ʈ �����̳ʸ� scene�� ����ִ´�.
		Scene scene=new Scene(hBox);
		
		//5. stage�� scene�� ����ִ´�.
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
