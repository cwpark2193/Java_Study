package chapter16.jframe;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	//멤버변수
	private JLabel label;
	//멤버 내부 인스턴스 클래스
	private class MyThread extends Thread{
		@Override
		public void run() {
			//반복문 실행 1~10까지 라벨객체출력, 화면객체에다 출력
			for(int i=0;i<=10;i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				label.setText(String.valueOf(i));
			}//end of for
		}//end of run
	}//end of innerClass
	//생성자 함수
	public CountDownTest() throws HeadlessException {
		super();
		setTitle("고길동");	//윈도우 창 이름 세팅
		setSize(300,200);	//윈도우 창 크기 세팅
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//윈도우 창 닫기기능 부여
		this.label = new JLabel("스타트");	//라벨객체를 만든다.
		this.label.setFont(new Font("Serif", Font.BOLD,	50));
		add(label);	//윈도우 창에 라벨컴포넌트 배치
		add(label);	//윈도우 창에 라벨컴포넌트 배치
		Thread t1 = new MyThread();
		t1.start();
		setVisible(true);	//윈도우창을 보여지도록 활성화
	}
}
