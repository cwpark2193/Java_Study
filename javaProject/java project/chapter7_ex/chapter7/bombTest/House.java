package chapter7.bombTest;

public class House extends Bomb{
	
	public House() {
		super();
	}
	public void bomb() {
		System.out.println("집이 불타고 있습니다.");
	}
	public static void sbomb(){
		System.out.println("static House sbomb");
	}
	
}
