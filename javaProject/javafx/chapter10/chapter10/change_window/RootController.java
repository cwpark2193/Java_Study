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
	//�α��� ȭ���� �����ִ� �̺�Ʈó���Լ�
	public void handleButtonLoginAction(ActionEvent event) {
		//root.fxml�� �ִ� �ֻ����� �ִ� ��Ʈ �����̳ʰ�ü���� �����´�.(StackPane��ü)
		StackPane sp=null;
		AnchorPane ap=null;
		try {
			sp=(StackPane) btnLogin.getScene().getRoot();
			//login.fxml�� �δ�(login.fxml�� ��� ��üȭ��Ű�� 
			//LoginController���� ��üȭ �� ��ġȭ�� �� 
			//�̺�Ʈó�� �� ���ε� �Ӽ�ó�� ���� �Ѵ�.)�ϰ� �ֻ��� ��Ʈ �����̳� ��ü���� �ҷ��´�.
			ap=FXMLLoader.load(getClass().getResource("login.fxml"));
			//���� �������ο� �ٸ� ȭ�鿡 �ִ� ��Ŀ������ ����ִ´�.
			sp.getChildren().add(ap);
			
		} catch (IOException e) {e.printStackTrace();}
		
	}

}
