package chapter7.bombTest;

public class Building extends Bomb{
	public Building() {
		super();
	}
	public void bomb() {
		System.out.println("�ǹ��� ��Ÿ�� �ֽ��ϴ�.");
	}
	public static void sbomb(){
		System.out.println("static Building sbomb");
	}
}
