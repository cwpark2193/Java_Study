package NewComparable;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10, 20);
		Rectangle rect2 = new Rectangle(30, 20);
		System.out.println(rect1);
		System.out.println(rect2);
		
		int returnValue=rect1.compareTo(rect2);
		switch(returnValue) {
		case 1: System.out.println("객체1이 큽니다.");	break;
		case -1: System.out.println("객체1이 작습니다.");	break;
		case 0: System.out.println("두 객체가 같습니다.");	break;
		default : System.out.println("작동 오류"); break;
		}
	}

}
