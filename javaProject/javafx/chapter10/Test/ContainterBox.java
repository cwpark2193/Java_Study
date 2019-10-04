package Test;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContainterBox extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vb = new VBox();
		vb.setPrefSize(700, 500);
		vb.setAlignment(Pos.CENTER);
		vb.setSpacing(18);
		
		Label lb = new Label();
		lb.setText("Welcome! Come on!");
		lb.setFont(new Font(55));
		
		Button button=new Button();
		button.setText("End");
		button.setOnAction((e)->Platform.exit());
		
		ObservableList<Node> list = vb.getChildren();
		list.add(lb);
		list.add(button);
		
		Scene scene = new Scene(vb);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
