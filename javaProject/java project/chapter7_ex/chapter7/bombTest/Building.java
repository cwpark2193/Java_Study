package chapter7.bombTest;

public class Building extends Bomb{
	public Building() {
		super();
	}
	public void bomb() {
		System.out.println("건물이 불타고 있습니다.");
	}
	public static void sbomb(){
		System.out.println("static Building sbomb");
	}
}
