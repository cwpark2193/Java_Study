package cpahter16.bakery;

public class Baker implements Runnable {
	// �������
	private static String[] menu = { "���ϻ�", "���ڻ�", "�Ļ�", "�����", "�ؾ" };
	private Bakery bakery;

	// �������Լ�
	public Baker(Bakery bakery) {
		this.bakery = bakery;
	}

	@Override
	public void run() {
		// 1. 10�� ������.
		for (int i = 0; i < 5; i++) {
			try {
				this.bakery.setBread(menu[i]);
				System.out.println(menu[i] + "��(��) ��������ϴ�.");
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
}
