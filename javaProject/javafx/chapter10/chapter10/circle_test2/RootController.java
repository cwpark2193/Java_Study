package chapter10.circle_test2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private AnchorPane ancSize;
	@FXML private Circle circle;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		circle.centerXProperty().bind(Bindings.divide(ancSize.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(ancSize.heightProperty(), 2));
	}

}
