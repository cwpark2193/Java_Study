package CompareToTest;

public class ComparableTest {

	public static void main(String[] args) {
		int returnValue=0;
		Rectangle rec1 = new Rectangle(40,50);
		Rectangle rec2 = new Rectangle(60,30);
		System.out.println(rec1);
		System.out.println(rec2);
		returnValue=rec1.compareTo(rec2);
		switch(returnValue) {
		case 0 : System.out.println("�� ��ü�� �����ϴ�."); break;
		case 1 : System.out.println("��ü1�� �� Ů�ϴ�."); break;
		case -1 : System.out.println("��ü2�� �� Ů�ϴ�."); break;
		}
	}

}