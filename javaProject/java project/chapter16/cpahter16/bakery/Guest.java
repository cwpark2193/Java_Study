package cpahter16.bakery;

public class Guest extends Thread {
	private static String[] menu = { "���ϻ�", "���ڻ�", "�Ļ�", "�����", "�ؾ" };
	private Bakery bakery;

	public Guest(Bakery bakery) {
		this.bakery = bakery;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				String str= bakery.getBread();
				System.out.println(str + "��(��) ���ְ� �Ծ����ϴ�.");
				Thread.sleep(200);
			} catch (Exception e) {}
		}

	}
}
