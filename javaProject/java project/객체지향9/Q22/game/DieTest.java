package Q22.game;

public class DieTest {

	public static void main(String[] args) {
		Die humanValue = new Die();
		Die comValue = new Die();
		System.out.println(humanValue);
		System.out.println(comValue);
		humanValue.roll();
		comValue.roll();
		System.out.println(humanValue);
		System.out.println(comValue);
		int returnValue = humanValue.compareTo(comValue);
		match(returnValue);
	}
	public static void match(int returnValue) {
		switch(returnValue) {
		case 1 : System.out.println("사용자가 이겼습니다.");	break;
		case -1 : System.out.println("컴퓨터가 이겼습니다.");	break;
		case 0 : System.out.println("둘이 비겼습니다.");		break;
		}
	}
	
}
