package chapter7.play;

public class Car extends Bomb{
	public Car() {
		super();	//부모 생성자를 부르고 있다. 
	}
	public static void sbomb() {
		System.out.println("static Car sbomb()함수");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Car fireInTheHole2() function");	
	}
}
