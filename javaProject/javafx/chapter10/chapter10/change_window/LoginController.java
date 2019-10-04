package chapter10.change_window;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable {
	@FXML private Button btnMain;
	@FXML private AnchorPane apRoot;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnMain.setOnAction((event)->{
			handleButtonMainAction(event);
		});
	}
	public void handleButtonMainAction(ActionEvent event) {
		StackPane sp = (StackPane) btnMain.getScene().getRoot();
		sp.getChildren().remove(apRoot);
		
	}
	

}
