package chapter7.car;

public class SportsCar extends Car{
	private boolean turbo;
	int dspeed;
	boolean dturbo;
	
	public SportsCar(int speed) {
		super(speed); //super는 첫쨰 라인에
		System.out.println("sportsCar 생성자");
		
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
		super.dspeed= 10;
		Car.mycar=20;
		super.mycar=20;
		this.mycar=20;
	}

}
