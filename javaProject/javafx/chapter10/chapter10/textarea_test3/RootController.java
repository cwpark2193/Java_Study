package chapter10.textarea_test3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML private TextArea txtSend;
	@FXML private TextArea txtReceive;
	@FXML private Button btnBind;
	@FXML private Button btnUnbind;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnBind.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Bindings.bindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
			}
		});
		btnUnbind.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Bindings.unbindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
			}
		});
	}

}
