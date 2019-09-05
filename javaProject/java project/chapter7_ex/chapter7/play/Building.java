package chapter7.play;

public class Building extends Bomb{
	public Building() {
		super();	//부모 생성자를 부르고 있다. 
	}
	public static void sbomb() {
		System.out.println("static Building sbomb()함수");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Building fireInTheHole2() function");
	}
	
}
