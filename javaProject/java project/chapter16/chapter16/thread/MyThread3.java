package chapter16.thread;

import java.awt.Toolkit;

public class MyThread3 implements Runnable{
	@Override
	public void run() {
		//System.out.println("t1="+Thread.currentThread().getName());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
