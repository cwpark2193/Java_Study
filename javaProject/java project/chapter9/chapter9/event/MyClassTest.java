package chapter9.event;

import java.awt.event.ActionListener;

import javax.swing.Timer;


public class MyClassTest {

	public static void main(String[] args) throws InterruptedException {
		ActionListener actionListener = new MyClass();
		//1. �ð� Ÿ�̸ӷ� �̺�Ʈ �ڵ��߻���Ų��.4
		Timer t = new Timer(1000, actionListener);
		t.start();
		for(int i=0;i<10;i++) {
			Thread.sleep(1000);
		}
	}

}
