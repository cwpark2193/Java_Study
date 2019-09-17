package chapter16.ximsbakery;

public class Bakery {
	private static int num;
	private String[] bread = { "¼Òº¸·ç »§", "Å©¸²»§", "´ÜÆÏ»§", "½´Å©¸²»§", "½Ä»§", "Á×»§", "¼±»§" };
	private boolean isBread = false;

	public synchronized String getBread() {
		synchronized (this) {
			
		while (!isBread) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(this.bread[num] + "¸¦ ¸Ô¾ú½À´Ï´Ù.");
		isBread = false;
		notifyAll();

		return this.bread[num];
	}
	}//ÀÓ°è¿µ¿ª

	public synchronized void setBread() {

		while (isBread) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		num = (int) (Math.random() * 7);
		System.out.println(this.bread[num] + "À» ¸¸µé¾ú½À´Ï´Ù. ");
		isBread = true;

		notifyAll();
	}

}
