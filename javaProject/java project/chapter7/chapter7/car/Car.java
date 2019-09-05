package chapter7.car;

public class Car{
	private int speed;
	int dspeed;
	public static int mycar; 
	public Car(int speed) {
		super();
		System.out.println("부모 생성자 ");
		this.speed = speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
