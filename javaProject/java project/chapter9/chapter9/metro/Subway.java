package chapter9.metro;

public class Subway implements Metro{
	public void start() {
		System.out.println("열차가 출발합니다.");
	}
	public void stop() {
		System.out.println("열차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("열차의 속도를 " + speed + "km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("열차의 방향을 " + degree + "도 만큼 바꿉니다.");
	}
}
