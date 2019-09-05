package 객체지향6;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(5.0,2.0,3.0);
		System.out.println(myCircle);
		System.out.println("원의 반지름 = "+myCircle.getRadious()+", 원의 넓이 = "+myCircle.area());
	}
}
