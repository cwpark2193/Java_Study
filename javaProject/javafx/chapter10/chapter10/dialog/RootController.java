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
	private String string = "5반 힘들다";
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Stage stage=(Stage) hbox.getScene().getWindow();
		//System.out.println("Stage="+stage);
	}//end of init
	//파일열기 다이얼로그창 활성화
	public void handleOpenFileChooser(ActionEvent event) {
		//1. 파일추저 부른다.(스테이지,씬,루트 구성)
		FileChooser fc=new FileChooser();
		//2. fc에 확장자 기능 부여 가능
		fc.getExtensionFilters().addAll(new ExtensionFilter("텍스트파일(*.txt)", "*.txt"),
				new ExtensionFilter("이미지파일(*.png,*.jpg,*.gif)", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("한글파일(*.hwp)", "*.hwp"),
				new ExtensionFilter("모든파일(*.*)", "*.*"));
		//2. 주인 스테이지를 할당하기
		File file = fc.showOpenDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
	}
	//파일저장다이얼로그창 활성화하기
	public void handleSaveFileChooser(ActionEvent event) {
		FileChooser fc=new FileChooser();
		fc.getExtensionFilters().addAll(new ExtensionFilter("모든파일", "*.*"));
		File file=fc.showSaveDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
		
	}
	//디렉토리정보 가져오기
	public void handleDirectoryFileChooser(ActionEvent event) {
		DirectoryChooser dc=new DirectoryChooser();
		File file=dc.showDialog(hBox.getScene().getWindow());
		if(file!=null) {
			System.out.println(file.getPath());
		}
	}
	//
	public void handlePopup(ActionEvent event) {
		Popup popup=new Popup();//스테이지,씬는 있으나 루트컨테이너가 없다.
		//popup.fxml 루트컨테이너 만들었으니까 가져와야되지 않을까요...
		HBox hBox=null;//wognsdl qkqh
		try {
			hBox=FXMLLoader.load(getClass().getResource("popup.fxml"));
			//UI객체를 찾아서 저장시키는 방법.(id를 찾는 방법)
			ImageView iv=(ImageView) hBox.lookup("#imageView");
			Label lb=(Label) hBox.lookup("#lbText");
			lb.setText(string);
			iv.setOnMouseClicked((e1)-> {
					popup.hide();
			});
			popup.getContent().add(hBox);//신에다가 루트 컨테이너를 넣는다.
			//팝업창을 사라지게 하는 방법
			popup.setAutoHide(true); //다른 창을 찍으면 사라진다.
			popup.show(this.hBox.getScene().getWindow());
			
		} catch (IOException e) {e.printStackTrace();}
		
	}
	public void handleCustom(ActionEvent event) throws IOException {
		//1. 스테이지를 만든다(창 스타일 5개 중 택1)
				Stage stage=new Stage(StageStyle.UTILITY);
				//2. 이 창이 모달인지, 모달리스인지 결정한다.(모달창을 만든다.)
				stage.initModality(Modality.WINDOW_MODAL);
				//3. 너의 주인창이 누구인지 확인한다. 
				stage.initOwner(hBox.getScene().getWindow());
				//4. 타이틀을 정한다.
				stage.setTitle("박재훈");
				stage.setResizable(false);
				//5. 루트컨테이너를 가져온다.
				AnchorPane ap=FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
				//6. UI객체를 찾는다.
				TextField tfKor=(TextField)ap.lookup("#tfKor");
				TextField tfEng=(TextField)ap.lookup("#tfEng");
				TextField tfMath=(TextField)ap.lookup("#tfMath");
				TextField tfSum=(TextField)ap.lookup("#tfSum");
				TextField tfAver=(TextField)ap.lookup("#tfAver");
				Button btnOK=(Button)ap.lookup("#btnOK");
				Button btnClear=(Button)ap.lookup("#btnClear");
				//7.이벤트를 걸고 처리방식까지 정의한다.
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
				//8.씬에 적용시킨다.
				Scene scene=new Scene(ap);
				stage.setScene(scene);
				stage.show();
	}//end of custom
}
