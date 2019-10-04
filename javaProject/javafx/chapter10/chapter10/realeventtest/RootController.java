package chapter10.realeventtest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	@FXML private Label lb;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String data=button1.getText();
				lb.setText(data);
			}
		});
		button2.setOnAction((event)-> {
				String data=button2.getText();
				lb.setText(data);				
		});
	}//end of init
	public void handlerButton3Action(ActionEvent e) {
		String data=button3.getText();
		lb.setText(data);
	}
}
