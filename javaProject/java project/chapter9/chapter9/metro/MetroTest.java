package chapter9.metro;

public class MetroTest {

	public static void main(String[] args) {
		Metro[] operateor = {new Bus(),new Car(),new Subway()};
		for(int i=0;i<operateor.length;i++) {
			System.out.println("==================");
			operateor[i].start();
			operateor[i].stop();
			operateor[i].setSpeed(100);
			operateor[i].turn(180);
		}
		System.out.println("==================");
	}

}
