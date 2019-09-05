package chapter9.rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(20, 10);
		Circle c1 = new Circle(100);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(c1);
		int returnValue = r1.compareTo(r2);
		switchFunction(returnValue, "��ü1", "��ü2");;
		returnValue = r1.compareTo(c1);
		switchFunction(returnValue, "��ü1", "��ü2");
	}
	public static void switchFunction(int returnValue,String str1,String str2) {
		switch(returnValue) {
		case 1 : System.out.println("��ü1�� �� �۽��ϴ�."); break;
		case -1 : System.out.println("��ü1�� �� Ů�ϴ�."); break;
		case 0 : System.out.println("�� ��ü�� �����ϴ�"); break;
		}
		return;
	}
}
