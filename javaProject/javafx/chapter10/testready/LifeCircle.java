package testready;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCircle extends Application{
	
	public LifeCircle() {
		System.out.println(Thread.currentThread().getName()+"스레드 생성자");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드 main()");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 init()");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 stop()");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 start()");
		primaryStage.setTitle("박재훈");
		primaryStage.show();
	}

}
