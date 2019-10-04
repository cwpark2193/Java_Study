package chapter10.change_test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;


public class CustomController implements Initializable {
	@FXML private AnchorPane apCustom;
	@FXML private TextField tfKor;
	@FXML private TextField tfEng;
	@FXML private TextField tfMath;
	@FXML private TextField tfTotal;
	@FXML private TextField tfAver;
	@FXML private Button btnMain;
	@FXML private Button btnTotal;
	@FXML private Button btnAver;
	@FXML private Button btnClear;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnTotal.setOnAction((event)-> {
			handleButtonTotal(event);
		});
		btnAver.setOnAction((event)-> {
			handleButtonAverage(event);
		});
		btnClear.setOnAction((event)-> {
			handleButtonClear(event);
		});
		btnMain.setOnAction((event)->{
			handleButtonMainAction(event);
		});
	}
	public void handleButtonTotal(ActionEvent e) {
		int sum = Integer.parseInt(tfKor.getText())+Integer.parseInt(tfEng.getText())+Integer.parseInt(tfMath.getText());
		tfTotal.setText(Integer.toString(sum));
	}
	public void handleButtonAverage(ActionEvent e) {
		double average= (Double.parseDouble(tfKor.getText())+Double.parseDouble(tfEng.getText())+Double.parseDouble(tfMath.getText()))/3.0;
		tfAver.setText(Double.toString(Math.round(average*100)/100.0));	
	}
	public void handleButtonClear(ActionEvent e) {
		tfKor.setText("0");
		tfEng.setText("0");
		tfMath.setText("0");
		tfTotal.setText("0");
		tfAver.setText("0");
	}
	public void handleButtonMainAction(ActionEvent event) {
		StackPane sp = (StackPane) btnMain.getScene().getRoot();
		sp.getChildren().remove(apCustom);
		
	}

}
