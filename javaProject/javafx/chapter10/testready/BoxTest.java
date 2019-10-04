package testready;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BoxTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hb = new HBox();
		hb.setPrefSize(600, 300);
		hb.setAlignment(Pos.CENTER);
		hb.setSpacing(15);
		
		TextField tf = new TextField();
		tf.setPrefSize(400, 180);
		
		Button button = new Button();
		button.setText("End");
		button.setOnAction((e)->Platform.exit());
		
		ObservableList<Node> list = hb.getChildren();
		list.add(tf);
		list.add(button);
		
		Scene scene = new Scene(hb);
		
	
	}

}
