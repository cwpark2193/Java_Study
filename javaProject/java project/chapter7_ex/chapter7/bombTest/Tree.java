package chapter7.bombTest;

public class Tree extends Bomb{
	public Tree() {
		super();
	}
	public void bomb() {
		System.out.println("나무가 불타고 있습니다.");
	}
	public static void sbomb(){
		System.out.println("static Tree sbomb");
	}
}
