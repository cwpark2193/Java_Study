package chapter16.ximsbakery;

public class Bakery {
	private static int num;
	private String[] bread = { "�Һ��� ��", "ũ����", "���ϻ�", "��ũ����", "�Ļ�", "�׻�", "����" };
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

		System.out.println(this.bread[num] + "�� �Ծ����ϴ�.");
		isBread = false;
		notifyAll();

		return this.bread[num];
	}
	}//�Ӱ迵��

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
		System.out.println(this.bread[num] + "�� ��������ϴ�. ");
		isBread = true;

		notifyAll();
	}

}
