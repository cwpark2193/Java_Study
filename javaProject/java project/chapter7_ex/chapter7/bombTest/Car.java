package chapter7.bombTest;

public class Car extends Bomb{
	public Car() {
		super();
	}
	public void bomb() {
		System.out.println("차가 불타고 있습니다.");
	}
	public static void sbomb(){
		System.out.println("static Car sbomb");
	}
	
}
