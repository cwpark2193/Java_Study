package SecondRectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(30, 40);
		Rectangle rect2 = new Rectangle(50, 20);
		System.out.println(rect1);
		System.out.println(rect2);
		int returnValue=rect1.compareTo(rect2);
		switch(returnValue) {
		case 1 : System.out.println("1�� �簢���� �� �н��ϴ�."); break;
		case -1 : System.out.println("2�� �簢���� �� �н��ϴ�."); break;
		case 0 : System.out.println("�� �簢�� ���̰� �����ϴ�."); break;
		}
	}

}