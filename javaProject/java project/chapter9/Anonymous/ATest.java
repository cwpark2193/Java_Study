package Anonymous;

public class ATest {

	public static void main(String[] args) {
		B b = new A();
		b.turnOn();
		//b.turnOff();
		B b1 = new B() { //객체 선언 뒤에 중괄호를 붙이는 것으로 컴파일러는 다른 클래스 없이 여기에 바로 클래스 선언을 하는 것으로 받아들인다.
			@Override
			public void turnOn() {
				System.out.println("On");
			}
			/*
			 * @Override public void turnOff() { System.out.println("Off"); }
			 */
		};
		b1.turnOn();
		//b1.turnOff();
		
		//람다식으로 표현
		B b2 = ()-> { 
			System.out.println("end");
		};
		b2.turnOn();
	}

}
