package chapter7.play;

public class House extends Bomb{
	public House() {
		super();	//부모 생성자를 부르고 있다. 
	}
	public static void sbomb() {
		System.out.println("static House sbomb()함수");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("House fireInTheHole2() function");
	}
}
