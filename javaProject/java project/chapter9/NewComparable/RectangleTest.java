package NewComparable;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10, 20);
		Rectangle rect2 = new Rectangle(30, 20);
		System.out.println(rect1);
		System.out.println(rect2);
		
		int returnValue=rect1.compareTo(rect2);
		switch(returnValue) {
		case 1: System.out.println("��ü1�� Ů�ϴ�.");	break;
		case -1: System.out.println("��ü1�� �۽��ϴ�.");	break;
		case 0: System.out.println("�� ��ü�� �����ϴ�.");	break;
		default : System.out.println("�۵� ����"); break;
		}
	}

}
