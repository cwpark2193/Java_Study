package chapter7.play;

public class Tree extends Bomb{
	public Tree() {
		super();	//�θ� �����ڸ� �θ��� �ִ�. 
	}
	public static void sbomb() {
		System.out.println("static Tree sbomb()�Լ�");
	}
	@Override
	public void fireInTheHole() {
		System.out.println("Tree fireInTheHole2() function");
	}
}
