package SecondRectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(30, 40);
		Rectangle rect2 = new Rectangle(50, 20);
		System.out.println(rect1);
		System.out.println(rect2);
		int returnValue=rect1.compareTo(rect2);
		switch(returnValue) {
		case 1 : System.out.println("1번 사각형이 더 넓습니다."); break;
		case -1 : System.out.println("2번 사각형이 더 넓습니다."); break;
		case 0 : System.out.println("두 사각형 넓이가 같습니다."); break;
		}
	}

}
