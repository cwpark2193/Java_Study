package chapter7.play;

public class Car extends Bomb{
	public Car() {
		super();	//�θ� �����ڸ� �θ��� �ִ�. 
	}
	public static void sbomb() {
		System.out.println("static Car sbomb()�Լ�");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Car fireInTheHole2() function");	
	}
}
