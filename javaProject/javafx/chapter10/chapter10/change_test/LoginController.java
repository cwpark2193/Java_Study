package chapter10.change_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable {
	@FXML private AnchorPane apLogin;
	@FXML private TextField tfID;
	@FXML private PasswordField pfPass;
	@FXML private Button btnMain;
	@FXML private Button btnCheck;
	@FXML private Button btnClear;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnMain.setOnAction((event)->{
			handleButtonMainAction(event);
		});
		btnCheck.setOnAction((event)->{
			handleButtonCheck(event);
		});
		btnClear.setOnAction((event)->{
			handleButtonClear(event);
		});
	}
	public void handleButtonMainAction(ActionEvent event) {
		StackPane sp = (StackPane) btnMain.getScene().getRoot();
		sp.getChildren().remove(apLogin);
		
	}
	public void handleButtonCheck(ActionEvent event) {
	
	}
	public void handleButtonClear(ActionEvent event) {
		tfID.setText("");
		pfPass.setText("");
	}
	

}
