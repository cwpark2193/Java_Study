package Test;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	
	public LifeCycle() {
		System.out.println(Thread.currentThread().getName()+"������ LifeCycle() ������");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ init()");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ stop()");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"������ main()");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ start()");
		primaryStage.setTitle("������");
		primaryStage.show();
	}

}
