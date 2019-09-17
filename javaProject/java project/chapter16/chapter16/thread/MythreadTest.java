package chapter16.thread;

import java.awt.Toolkit;

public class MythreadTest {

	public static void main(String[] args) throws InterruptedException {
		// 1. ���ڸ� ����ִ� ������
		// 2. �Ҹ��� �۵���Ű�� ���
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("t1="+Thread.currentThread().getName());
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		};
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}
