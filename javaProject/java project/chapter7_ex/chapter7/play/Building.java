package chapter7.play;

public class Building extends Bomb{
	public Building() {
		super();	//�θ� �����ڸ� �θ��� �ִ�. 
	}
	public static void sbomb() {
		System.out.println("static Building sbomb()�Լ�");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Building fireInTheHole2() function");
	}
	
}
