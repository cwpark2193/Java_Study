package cpahter16.bakery;

public class Baker implements Runnable {
	// 멤버변수
	private static String[] menu = { "단팥빵", "피자빵", "식빵", "고로케", "붕어빵" };
	private Bakery bakery;

	// 생성자함수
	public Baker(Bakery bakery) {
		this.bakery = bakery;
	}

	@Override
	public void run() {
		// 1. 10번 돌린다.
		for (int i = 0; i < 5; i++) {
			try {
				this.bakery.setBread(menu[i]);
				System.out.println(menu[i] + "을(를) 만들었습니다.");
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
}
