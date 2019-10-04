package chapter10.button_tool;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private CheckBox chkGlasses;
	@FXML private CheckBox chkHat;
	@FXML private ImageView imgCheck;
	@FXML private RadioButton rdoBubble;
	@FXML private RadioButton rdoBar;
	@FXML private RadioButton rdoArea;
	@FXML private ImageView imgChart;
	@FXML private Button btnExit;
	@FXML private ToggleGroup Group;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		Group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//				Image image=new Image(getClass().getResource("Images/"+newValue.getUserData().toString()+".png").toString());
//				imgChart.setImage(image);
//			}
//		});
	}

	public void handlerButtonExitAction(ActionEvent event) {
		Platform.exit();
	}

	public void handlerCheckBoxAction(ActionEvent event) {
		if (chkGlasses.isSelected() && chkHat.isSelected()) {
			imgCheck.setImage(new Image(getClass().getResource("Images/geek-glasses-hair.gif").toString()));
		} else if (chkGlasses.isSelected()) {
			imgCheck.setImage(new Image(getClass().getResource("Images/geek-glasses.gif").toString()));
		} else if (chkHat.isSelected()) {
			imgCheck.setImage(new Image(getClass().getResource("Images/geek-hair.gif").toString()));
		}else {
			imgCheck.setImage(new Image(getClass().getResource("Images/geek.gif").toString()));
		}
	}// end of checkbox
	public void handlerRadioButtonAction(ActionEvent event) {
		if(rdoBubble.isSelected()) {
			imgChart.setImage(new Image(getClass().getResource("Images/"+rdoBubble.getUserData().toString()+".png").toString()));
		}
		else if(rdoBar.isSelected()) {
			imgChart.setImage(new Image(getClass().getResource("Images/"+rdoBar.getUserData().toString()+".png").toString()));
		}
		else {
			imgChart.setImage(new Image(getClass().getResource("Images/"+rdoArea.getUserData().toString()+".png").toString()));
		}
	}
}
