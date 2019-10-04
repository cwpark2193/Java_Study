package chapter10.circle_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDivide;
	@FXML private Circle circle;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		circle.setCenterX(ancDivide.getWidth()/2);
//		circle.setCenterY(ancDivide.getHeight()/2);
		circle.centerXProperty().bind(Bindings.divide(ancDivide.widthProperty(), 2));;
		circle.centerYProperty().bind(Bindings.divide(ancDivide.heightProperty(), 2));;
		
			
	}

}
