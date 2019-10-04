package media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	//1.멤버변수 선언(화면에 있는 객체 아이디와 같게 한다.)
	@FXML private MediaView mv;
	@FXML private ImageView iv;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	private boolean endOfMedia = false;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//2. 미디어뷰를 진행하기 위해서는  미디어 객체를 가져와야 한다.(스트림)
		Media media=new Media(getClass().getResource("media/video.mp4").toString());
		//3. 미디어 플레이어를 만들고 미디어객체를 받는다.
		MediaPlayer mp = new MediaPlayer(media);
		//4. 미디어뷰에 미디어플레이어를 삽입한다.
		mv.setMediaPlayer(mp);
		//5. 준비상태,진행상태,멈춤상태,정지상태,완료 안내 상태. 5가지 상태를 정의해준다.
		mp.setOnReady(()-> {
			//재생활성화,멈춤 및 정지 비활성화
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			//준비상태에서 자동으로 진행된다면 지금은 미디어뷰를 보이지마라
			if(mp.isAutoPlay()) {
				mv.setVisible(false);
			}
			
		});
		//6. 진행상황이 되었을 때
		mp.setOnPlaying(()-> {
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
			
		});
		//7. 멈춤상태일때 
		mp.setOnPaused(() ->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});
		//8. 정지상황이 되었을 때
		mp.setOnStopped(()-> {
			//미디어플레이어 정지상황시 동영상 원위치
			mp.seek(mp.getStartTime());
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		//9. 완료 안내 상태일때 
		mp.setOnEndOfMedia(()-> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			//동영상이 실제로 끝났을 때 프로그램상으로 플래그 정보를 알려준다.
			endOfMedia=true;
		});
		//플레이버튼을 눌렀을 때
		btnPlay.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(endOfMedia=true) {
					mp.stop();
					mp.seek(mp.getStartTime());
				}
				mp.play();
				endOfMedia=false;
			}
		});
	}


}
