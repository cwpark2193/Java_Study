package chapter7.play;

public class House extends Bomb{
	public House() {
		super();	//�θ� �����ڸ� �θ��� �ִ�. 
	}
	public static void sbomb() {
		System.out.println("static House sbomb()�Լ�");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("House fireInTheHole2() function");
	}
}
