package chapter16.thread;

import java.awt.Toolkit;

public class MyThreadTest2 {

	public static void main(String[] args) throws InterruptedException {
		// Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
		// 3. Thread에 입력해야된다.
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				if (i == 2 || i == 3) {
					Thread.yield();
				} else {
					toolkit.beep();
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
