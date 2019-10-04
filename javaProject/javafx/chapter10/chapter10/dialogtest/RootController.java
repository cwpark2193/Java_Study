package chapter10.dialogtest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private HBox hBox;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void handleMyCustom(ActionEvent e) throws IOException {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("박재훈의 점수");
		stage.setResizable(false);
		AnchorPane ap = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		TextField tfKor = (TextField) ap.lookup("#tfKor");
		TextField tfEng = (TextField) ap.lookup("#tfEng");
		TextField tfMath = (TextField) ap.lookup("#tfMath");
		TextField tfTotal = (TextField) ap.lookup("#tfTotal");
		TextField tfAver = (TextField) ap.lookup("#tfAver");
		Button btnTotal = (Button) ap.lookup("#btnTotal");
		Button btnAver = (Button) ap.lookup("#btnAver");
		Button btnClear = (Button) ap.lookup("#btnClear");
		Button btnExit = (Button) ap.lookup("#btnExit");
		btnTotal.setOnAction((event)-> {
			int sum = Integer.parseInt(tfKor.getText())+Integer.parseInt(tfEng.getText())+Integer.parseInt(tfMath.getText());
			tfTotal.setText(Integer.toString(sum));
		});
		btnAver.setOnAction((event)-> {
			double average= (Double.parseDouble(tfKor.getText())+Double.parseDouble(tfEng.getText())+Double.parseDouble(tfMath.getText()))/3.0;
			tfAver.setText(Double.toString(Math.round(average*100)/100.0));	
		});
		btnClear.setOnAction((event)-> {
			tfKor.setText("0");
			tfEng.setText("0");
			tfMath.setText("0");
			tfTotal.setText("0");
			tfAver.setText("0");
		});
		btnExit.setOnAction((event)-> {
			stage.close();
		});
		Scene scene=new Scene(ap);
		stage.setScene(scene);
		stage.show();
	}
}
