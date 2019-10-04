package chapter10.javafx_main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	//1. ������ ���Լ�
	public AppMain() {
		System.out.println(Thread.currentThread().getName()+"������ AppMain()"+"AppMain() ������");		
	}
	//2. init() ���Լ�
	@Override
	public void init() throws Exception {
		Parameters ps=getParameters();
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set=map.entrySet();
		for(Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = "+key+", value = "+value);
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"������ main()");
		launch(args); 
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ start()");
		primaryStage.setTitle("�������");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"������ stop()");
		
	}
	
}
