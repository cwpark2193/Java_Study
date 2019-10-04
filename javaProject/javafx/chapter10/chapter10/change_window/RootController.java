package chapter10.change_window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {
	@FXML private Button btnLogin;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnLogin.setOnAction((event)->{
			handleButtonLoginAction(event);
		});
	}
	//로그인 화면을 보여주는 이벤트처리함수
	public void handleButtonLoginAction(ActionEvent event) {
		//root.fxml에 있는 최상위에 있는 루트 컨테이너객체값을 가져온다.(StackPane객체)
		StackPane sp=null;
		AnchorPane ap=null;
		try {
			sp=(StackPane) btnLogin.getScene().getRoot();
			//login.fxml을 로더(login.fxml을 모두 객체화시키고 
			//LoginController까지 객체화 후 매치화한 뒤 
			//이벤트처리 및 바인드 속성처리 등을 한다.)하고 최상위 루트 컨테이너 객체값을 불러온다.
			ap=FXMLLoader.load(getClass().getResource("login.fxml"));
			//현재 스택페인에 다른 화면에 있는 앵커페인을 집어넣는다.
			sp.getChildren().add(ap);
			
		} catch (IOException e) {e.printStackTrace();}
		
	}

}
