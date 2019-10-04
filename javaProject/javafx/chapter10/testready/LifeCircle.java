package testready;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCircle extends Application{
	
	public LifeCircle() {
		System.out.println(Thread.currentThread().getName()+"������ ������");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"������ main()");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ init()");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ stop()");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ start()");
		primaryStage.setTitle("������");
		primaryStage.show();
	}

}
