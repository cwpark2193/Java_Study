package Q23;

public class RpsTest {

	public static void main(String[] args) {
		Rps humanValue = new Rps((int)(Math.random()*(2-0+1)+0));
		Rps comValue = new Rps((int)(Math.random()*(2-0+1)+0));
		System.out.println(humanValue);
		System.out.println(comValue);
		System.out.print("사용자는 ");select(humanValue.getRpsnumber());
		System.out.print("컴퓨터는 ");select(comValue.getRpsnumber());
		int returnValue = humanValue.compareTo(comValue);
		match(returnValue);
	}
	public static void select(int Value) {
		switch(Value) {
		case 0 : System.out.println("가위를 선택했습니다.");	break;
		case 1 : System.out.println("바위를 선택했습니다.");	break;
		case 2 : System.out.println("보를 선택했습니다.");	break;
		}
	}
	public static void match(int returnValue) {
		switch(returnValue) {
		case 1 : System.out.println("사용자가 이겼습니다.");	break;
		case -1 : System.out.println("컴퓨터가 이겼습니다.");	break;
		case 0 : System.out.println("둘이 비겼습니다.");		break;
		}
	}
}
