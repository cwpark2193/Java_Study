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
	//1.������� ����(ȭ�鿡 �ִ� ��ü ���̵�� ���� �Ѵ�.)
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
		//2. �̵��並 �����ϱ� ���ؼ���  �̵�� ��ü�� �����;� �Ѵ�.(��Ʈ��)
		Media media=new Media(getClass().getResource("medias/video.m4v").toString());
		//3. �̵�� �÷��̾ ����� �̵�ü�� �޴´�.
		MediaPlayer mp = new MediaPlayer(media);
		//4. �̵��信 �̵���÷��̾ �����Ѵ�.
		mv.setMediaPlayer(mp);
		//5. �����̴��� �̵�� �÷��̾� ������ �߰� ������ ����
		sliVolume.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mp.setVolume(sliVolume.getValue()/100.0);
			}
		}); 
		sliVolume.setValue(50.0);
		//6. �غ����,�������,�������,��������,�Ϸ� �ȳ� ����. 5���� ���¸� �������ش�.
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
			//6-1 ���Ȱ��ȭ,���� �� ���� ��Ȱ��ȭ
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
			//6-2 �غ���¿��� �ڵ����� ����ȴٸ� ������ �̵��並 ����������
			if(mp.isAutoPlay()) {mv.setVisible(false);}
			
			
		});
		//7. �����Ȳ�� �Ǿ��� ��
		mp.setOnPlaying(()-> {
			btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
			
		});
		//8. ��������϶� 
		mp.setOnPaused(() ->{
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
		});
		//9. ������Ȳ�� �Ǿ��� ��
		mp.setOnStopped(()-> {
			//�̵���÷��̾� ������Ȳ�� ������ ����ġ
			mp.seek(mp.getStartTime()); btnPlay.setDisable(false);
			btnPause.setDisable(true); btnStop.setDisable(true);
		});
		//10. �Ϸ� �ȳ� �����϶� 
		mp.setOnEndOfMedia(()-> {
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
			//10-1 �������� ������ ������ �� ���α׷������� �÷��� ������ �˷��ش�.
			endOfMedia=true;
			//10-2 �������� ������ ���α׷����ٿ� �ε�����͸� 1�� �����ؾ��Ѵ�.
			pbTime.setProgress(1.0); piPercent.setProgress(1.0); lbTime.setText("�Ϸ�");
		});
		//11�÷��̹�ư�� ������ ��
		btnPlay.setOnAction((event)-> {
				if(endOfMedia) {mp.stop(); mp.seek(mp.getStartTime());}
				mp.play(); endOfMedia=false;
		});
		btnPause.setOnAction((event)->{mp.pause();});
		btnStop.setOnAction((event)->{mp.stop();});
	}


}
