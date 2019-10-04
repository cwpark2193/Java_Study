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
	//1.������� ����(ȭ�鿡 �ִ� ��ü ���̵�� ���� �Ѵ�.)
	@FXML private MediaView mv;
	@FXML private ImageView iv;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	private boolean endOfMedia = false;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//2. �̵��並 �����ϱ� ���ؼ���  �̵�� ��ü�� �����;� �Ѵ�.(��Ʈ��)
		Media media=new Media(getClass().getResource("media/video.mp4").toString());
		//3. �̵�� �÷��̾ ����� �̵�ü�� �޴´�.
		MediaPlayer mp = new MediaPlayer(media);
		//4. �̵��信 �̵���÷��̾ �����Ѵ�.
		mv.setMediaPlayer(mp);
		//5. �غ����,�������,�������,��������,�Ϸ� �ȳ� ����. 5���� ���¸� �������ش�.
		mp.setOnReady(()-> {
			//���Ȱ��ȭ,���� �� ���� ��Ȱ��ȭ
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			//�غ���¿��� �ڵ����� ����ȴٸ� ������ �̵��並 ����������
			if(mp.isAutoPlay()) {
				mv.setVisible(false);
			}
			
		});
		//6. �����Ȳ�� �Ǿ��� ��
		mp.setOnPlaying(()-> {
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
			
		});
		//7. ��������϶� 
		mp.setOnPaused(() ->{
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});
		//8. ������Ȳ�� �Ǿ��� ��
		mp.setOnStopped(()-> {
			//�̵���÷��̾� ������Ȳ�� ������ ����ġ
			mp.seek(mp.getStartTime());
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		//9. �Ϸ� �ȳ� �����϶� 
		mp.setOnEndOfMedia(()-> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			//�������� ������ ������ �� ���α׷������� �÷��� ������ �˷��ش�.
			endOfMedia=true;
		});
		//�÷��̹�ư�� ������ ��
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
