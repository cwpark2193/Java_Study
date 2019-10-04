package chapter10.media_player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	//1.멤버변수 선언(화면에 있는 객체 아이디와 같게 한다.)
	@FXML private MediaView mv;
	@FXML private ImageView iv;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	@FXML private ProgressBar pbTime;
	@FXML private ProgressIndicator piPercent;
	@FXML private Slider sliVolume;
	@FXML private Label lbTime;	
	private boolean endOfMedia = false;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//2. 미디어뷰를 진행하기 위해서는  미디어 객체를 가져와야 한다.(스트림)
		Media media=new Media(getClass().getResource("medias/video.m4v").toString());
		//3. 미디어 플레이어를 만들고 미디어객체를 받는다.
		MediaPlayer mp = new MediaPlayer(media);
		//4. 미디어뷰에 미디어플레이어를 삽입한다.
		mv.setMediaPlayer(mp);
		//5. 슬라이더와 미디어 플레이어 볼륨을 중간 정도로 셋팅
		sliVolume.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mp.setVolume(sliVolume.getValue()/100.0);
			}
		}); 
		sliVolume.setValue(50.0);
		//6. 준비상태,진행상태,멈춤상태,정지상태,완료 안내 상태. 5가지 상태를 정의해준다.
		mp.setOnReady(()-> {
			mp.currentTimeProperty().addListener(new ChangeListener<Duration>() {

				@Override
				public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
						Duration newValue) {
					double currentTime = mp.getCurrentTime().toSeconds();
					double totalTime = mp.getTotalDuration().toSeconds();
					pbTime.setProgress(currentTime/totalTime);
					piPercent.setProgress(currentTime/totalTime);
					lbTime.setText((int)currentTime+"/"+(int)totalTime+" sec");
				}
			});
			//6-1 재생활성화,멈춤 및 정지 비활성화
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
			//6-2 준비상태에서 자동으로 진행된다면 지금은 미디어뷰를 보이지마라
			if(mp.isAutoPlay()) {mv.setVisible(false);}
			
			
		});
		//7. 진행상황이 되었을 때
		mp.setOnPlaying(()-> {
			btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
			
		});
		//8. 멈춤상태일때 
		mp.setOnPaused(() ->{
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
		});
		//9. 정지상황이 되었을 때
		mp.setOnStopped(()-> {
			//미디어플레이어 정지상황시 동영상 원위치
			mp.seek(mp.getStartTime()); btnPlay.setDisable(false);
			btnPause.setDisable(true); btnStop.setDisable(true);
		});
		//10. 완료 안내 상태일때 
		mp.setOnEndOfMedia(()-> {
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
			//10-1 동영상이 실제로 끝났을 때 프로그램상으로 플래그 정보를 알려준다.
			endOfMedia=true;
			//10-2 동영상이 끝나면 프로그래스바와 인디게이터를 1로 설정해야한다.
			pbTime.setProgress(1.0); piPercent.setProgress(1.0); lbTime.setText("완료");
		});
		//11플레이버튼을 눌렀을 때
		btnPlay.setOnAction((event)-> {
				if(endOfMedia) {mp.stop(); mp.seek(mp.getStartTime());}
				mp.play(); endOfMedia=false;
		});
		btnPause.setOnAction((event)->{mp.pause();});
		btnStop.setOnAction((event)->{mp.stop();});
	}


}
