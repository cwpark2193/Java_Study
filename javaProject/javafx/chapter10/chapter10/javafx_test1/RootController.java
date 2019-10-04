package chapter10.javafx_test1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private Label lblText;
	@FXML private Slider sldSize;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sldSize.setOnMouseDragged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				Double value = sldSize.getValue();
				lblText.setFont(new Font(value));
			}
		});
	}

}
