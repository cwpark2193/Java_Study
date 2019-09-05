package Q19;

public class VideoPlayer {


	public static void main(String[] args) {
		controllable video = new controllable() {
			@Override
			public void stop() {
				System.out.println("비디오를 정지합니다.");
			}
			@Override
			public void play() {
				System.out.println("비디오를 재생합니다.");
			}
		};
		video.play();
		video.stop();
		
	}

}
