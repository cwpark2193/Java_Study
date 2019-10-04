package chapter10.eventtest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	//��������� �����Ѵ�. ȭ�鿡�� ������ ��� ��ü�� ���⼭ �����Ѵ�.
	@FXML private Label lb;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	//start���� �̺�Ʈ ó���ϵ��� ���⼭ ó���ϸ� �ȴ�.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 //1�� ������� �̺�Ʈó���Ѵ�. �ӽð�ü
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String data=button1.getText();
				lb.setText(data);
			}
		});
		//2�� ������� �̺�Ʈó���Ѵ�. �̺�Ʈ ó���Լ�(���ٽ�)
		button2.setOnAction((event)-> {
				String data=button2.getText();
				lb.setText(data);
		});
		
	}
	//3�� ������� �̺�Ʈ ó���Ѵ�. �ڵ鷯�Լ� ���� ���ؼ� ó���Ѵ�.
	public void handlerButton3Action(ActionEvent event) {
		String data=button3.getText();
		lb.setText(data);
	}
}
