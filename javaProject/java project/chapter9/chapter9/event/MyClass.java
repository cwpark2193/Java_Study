package chapter9.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count=0;
	//이벤트가 발생하면 불러지는 함수다=콜백함수
	//매개변수는 이벤트가 발생이 되면 발생이 될 때 모든 정보를 객체로 만들어서
	//ActionEvent event = 객체 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//이벤트가 발생이 되었을 때 해야될 일을 적으면 됩니다.
		System.out.println((count++)+"Event Horizen fallen down");
	}

}
