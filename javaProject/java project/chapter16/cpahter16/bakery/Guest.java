package cpahter16.bakery;

public class Guest extends Thread {
	private static String[] menu = { "´ÜÆÏ»§", "ÇÇÀÚ»§", "½Ä»§", "°í·ÎÄÉ", "ºØ¾î»§" };
	private Bakery bakery;

	public Guest(Bakery bakery) {
		this.bakery = bakery;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				String str= bakery.getBread();
				System.out.println(str + "À»(¸¦) ¸ÀÀÖ°Ô ¸Ô¾ú½À´Ï´Ù.");
				Thread.sleep(200);
			} catch (Exception e) {}
		}

	}
}
