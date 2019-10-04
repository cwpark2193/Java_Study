package chapter10.dialog;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController extends Object implements Initializable {
	@FXML private HBox hBox;
	private String string = "5�� �����";
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Stage stage=(Stage) hbox.getScene().getWindow();
		//System.out.println("Stage="+stage);
	}//end of init
	//���Ͽ��� ���̾�α�â Ȱ��ȭ
	public void handleOpenFileChooser(ActionEvent event) {
		//1. �������� �θ���.(��������,��,��Ʈ ����)
		FileChooser fc=new FileChooser();
		//2. fc�� Ȯ���� ��� �ο� ����
		fc.getExtensionFilters().addAll(new ExtensionFilter("�ؽ�Ʈ����(*.txt)", "*.txt"),
				new ExtensionFilter("�̹�������(*.png,*.jpg,*.gif)", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("�ѱ�����(*.hwp)", "*.hwp"),
				new ExtensionFilter("�������(*.*)", "*.*"));
		//2. ���� ���������� �Ҵ��ϱ�
		File file = fc.showOpenDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
	}
	//����������̾�α�â Ȱ��ȭ�ϱ�
	public void handleSaveFileChooser(ActionEvent event) {
		FileChooser fc=new FileChooser();
		fc.getExtensionFilters().addAll(new ExtensionFilter("�������", "*.*"));
		File file=fc.showSaveDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
		
	}
	//���丮���� ��������
	public void handleDirectoryFileChooser(ActionEvent event) {
		DirectoryChooser dc=new DirectoryChooser();
		File file=dc.showDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
	}
	//
	public void handlePopup(ActionEvent event) {
		Popup popup=new Popup();//��������,���� ������ ��Ʈ�����̳ʰ� ����.
		//popup.fxml ��Ʈ�����̳� ��������ϱ� �����;ߵ��� �������...
		HBox hBox=null;//wognsdl qkqh
		try {
			hBox=FXMLLoader.load(getClass().getResource("popup.fxml"));
			//UI��ü�� ã�Ƽ� �����Ű�� ���.(id�� ã�� ���)
			ImageView iv=(ImageView) hBox.lookup("#imageView");
			Label lb=(Label) hBox.lookup("#lbText");
			lb.setText(string);
			iv.setOnMouseClicked((e1)-> {
					popup.hide();
			});
			popup.getContent().add(hBox);//�ſ��ٰ� ��Ʈ �����̳ʸ� �ִ´�.
			//�˾�â�� ������� �ϴ� ���
			popup.setAutoHide(true); //�ٸ� â�� ������ �������.
			popup.show(this.hBox.getScene().getWindow());
			
		} catch (IOException e) {e.printStackTrace();}
		
	}
	public void handleCustom(ActionEvent event) throws IOException {
		//1. ���������� �����(â ��Ÿ�� 5�� �� ��1)
				Stage stage=new Stage(StageStyle.UTILITY);
				//2. �� â�� �������, ��޸������� �����Ѵ�.(���â�� �����.)
				stage.initModality(Modality.WINDOW_MODAL);
				//3. ���� ����â�� �������� Ȯ���Ѵ�. 
				stage.initOwner(hBox.getScene().getWindow());
				//4. Ÿ��Ʋ�� ���Ѵ�.
				stage.setTitle("������");
				stage.setResizable(false);
				//5. ��Ʈ�����̳ʸ� �����´�.
				AnchorPane ap=FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
				//6. UI��ü�� ã�´�.
				TextField tfKor=(TextField)ap.lookup("#tfKor");
				TextField tfEng=(TextField)ap.lookup("#tfEng");
				TextField tfMath=(TextField)ap.lookup("#tfMath");
				TextField tfSum=(TextField)ap.lookup("#tfSum");
				TextField tfAver=(TextField)ap.lookup("#tfAver");
				Button btnOK=(Button)ap.lookup("#btnOK");
				Button btnClear=(Button)ap.lookup("#btnClear");
				//7.�̺�Ʈ�� �ɰ� ó����ı��� �����Ѵ�.
				btnOK.setOnAction((e1)-> {
					int sum=Integer.parseInt(tfKor.getText())+
					Integer.parseInt(tfEng.getText())+
					Integer.parseInt(tfMath.getText());
					double average=sum/3.0;
					tfSum.setText(Integer.toString(sum));
					tfAver.setText(Double.toString(average));
				});
				btnClear.setOnAction((e1)-> {
					tfKor.setText("0");
					tfEng.setText("0");
					tfMath.setText("0");
					tfSum.setText("0");
					tfAver.setText("0");
				});
				//8.���� �����Ų��.
				Scene scene=new Scene(ap);
				stage.setScene(scene);
				stage.show();
	}//end of custom
}
