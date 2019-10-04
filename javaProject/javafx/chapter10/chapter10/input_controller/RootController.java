package chapter10.input_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private PasswordField pswField;
	@FXML private ComboBox<String> cobBox;
	@FXML private DatePicker datCheck;
	@FXML private TextArea txtArea;
	@FXML private Button btnSave;
	@FXML private Button btnExit;
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1. 콤보박스에 항목 입력하기
		ObservableList<String> list =FXCollections.observableArrayList();
		list.add("공개");
		list.add("비공개");
		cobBox.setItems(list);
		
		cobBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				String data=txtArea.getText();
				txtArea.setText(data+newValue);
			}
		}); 
		btnSave.setOnAction((event)->{
			String titleData = txtTitle.getText();
			String passwordData = pswField.getText();
			String comboBoxData = cobBox.getValue();
			String lddata=datCheck.getValue().toString();
			txtArea.setText(titleData+"\n"+passwordData+"\n"+comboBoxData+"\n"+lddata);
		});
		
	}
	public void handlerButtonExitAction(ActionEvent event) {
		txtArea.setText(null);
		Platform.exit();
	}
}
