package chapter5.car;

public class Car {
	private String color;
	private int gear;
	private int speed;
	public Car(String color,int gear,int speed) {
		this.color=color;
		this.gear=gear;
		this.speed=speed;
	}	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getchangeGear() {
		return gear;
	}
	public void setchangeGear(int gear) {
		this.gear = gear;
	}
	public int getupSpeed() {
		return speed;
	}
	public void setupSpeed(int speed) {
		this.speed += speed*40;
	}
	public int getdownSpeed() {
		return speed;
	}
	public void setdownSpeed(int speed) {
		this.speed -= speed*40;
	}
	public void printcar() {
		System.out.println(color+"�� �ڵ����� ���� "+getchangeGear()+"�̰� �ӵ��� "+getSpeed()+"km�̴�.");
	}
	//String color,int gear, int speed
	//this.color=color,
}
