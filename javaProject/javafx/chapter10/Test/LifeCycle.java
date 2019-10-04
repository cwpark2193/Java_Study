package Test;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	
	public LifeCycle() {
		System.out.println(Thread.currentThread().getName()+"스레드 LifeCycle() 생성자");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 init()");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 stop()");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드 main()");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+"스레드 start()");
		primaryStage.setTitle("박재훈");
		primaryStage.show();
	}

}
