package chapter7.play;

public abstract class Bomb extends Object{

	public Bomb() {
		super();
	}
	public static void sbomb() {
		System.out.println("static Bomb sbomb()ÇÔ¼ö");
	}
	public abstract void fireInTheHole();
	public void fireInTheHole2() {
		System.out.println("fireInTheHole fireInTheHole2() function");	
	}
	
}
