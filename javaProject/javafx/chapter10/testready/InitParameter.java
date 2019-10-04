package testready;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.stage.Stage;

public class InitParameter extends Application{

	public InitParameter() {
		System.out.println(Thread.currentThread().getName()+"스레드 생성자");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드 main()");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		Parameters ps=getParameters();
//		Map<String, String> map = ps.getNamed();
//		Set<Entry<String, String>> set = map.entrySet();
//		for(Entry<String, String> entry:set) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println("key = "+key+", value="+value);
//		}
		List<String> list= ps.getRaw();
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
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
