package chapter10.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.*;


public class RootController implements Initializable {
	@FXML private TextArea ta;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void handleNew(ActionEvent e) {
		ta.appendText("새로 만들기 \n");
	}
	public void handleOpen(ActionEvent e) {
		ta.appendText("열기 \n");
	}
	public void handleSave(ActionEvent e) {
		ta.appendText("저장 \n");
	}
	public void handleExit(ActionEvent e) {
		Platform.exit();
	}
}
