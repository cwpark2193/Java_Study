package chapter7.play;

public class Tree extends Bomb{
	public Tree() {
		super();	//부모 생성자를 부르고 있다. 
	}
	public static void sbomb() {
		System.out.println("static Tree sbomb()함수");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Tree fireInTheHole2() function");
	}
}
