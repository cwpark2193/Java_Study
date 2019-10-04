package chapter10.root_container;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	public boolean flag = false;
	public Label label;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 1. 루트 컨테이너와 컨트롤러를 만든다.
		VBox vBox = new VBox();
		vBox.setPrefSize(375, 150);
		vBox.setAlignment(Pos.CENTER);// 가운데정렬
		vBox.setSpacing(20);

		// 2. 컨트롤러 생성
		label=new Label();
		label.setText("Hello javaFX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
		// button.setOnAction((e)->Platform.exit());//임시객체형태
		button.setOnAction((event) -> handlerAction(event));

		// 3. 루트컨테이너에 컨트롤러를 집어넣는다.
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);

		// 4.루트 컨테이너를 scene에 집어넣는다.
		Scene scene = new Scene(vBox);

		// 5. stage에 scene를 집어넣는다.
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void handlerAction(ActionEvent event) {
		if (flag) {
			label.setText("Hello 박");
			label.setFont(new Font(30));
		} else {
			label.setText("Hello javaFX");
			label.setFont(new Font(50));
		}
		flag = !flag;
	}

}
