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
		// 1. ��Ʈ �����̳ʿ� ��Ʈ�ѷ��� �����.
		VBox vBox = new VBox();
		vBox.setPrefSize(375, 150);
		vBox.setAlignment(Pos.CENTER);// �������
		vBox.setSpacing(20);

		// 2. ��Ʈ�ѷ� ����
		label=new Label();
		label.setText("Hello javaFX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("Ȯ��");
		// button.setOnAction((e)->Platform.exit());//�ӽð�ü����
		button.setOnAction((event) -> handlerAction(event));

		// 3. ��Ʈ�����̳ʿ� ��Ʈ�ѷ��� ����ִ´�.
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(button);

		// 4.��Ʈ �����̳ʸ� scene�� ����ִ´�.
		Scene scene = new Scene(vBox);

		// 5. stage�� scene�� ����ִ´�.
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void handlerAction(ActionEvent event) {
		if (flag) {
			label.setText("Hello ��");
			label.setFont(new Font(30));
		} else {
			label.setText("Hello javaFX");
			label.setFont(new Font(50));
		}
		flag = !flag;
	}

}
