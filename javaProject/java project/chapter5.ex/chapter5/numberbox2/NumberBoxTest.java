package chapter5.numberbox2;

public class NumberBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 생성자를 3개 만들어라.
		NumberBox2 nBox1 = new NumberBox2();
		NumberBox2 nBox2 = new NumberBox2(10, 10.0f, 10.0);
		NumberBox2 nBox3 = new NumberBox2(20, 20.0f, 20.0, 'c');
		//2. 출력하기
		System.out.println(nBox1.toString());
		System.out.println(nBox2.toString());
		System.out.println(nBox3.toString());
		//3. 메소드 오버로딩함수 사용할 것
		float returnValue=nBox3.calculate(10, 10.0f);
		System.out.println(nBox3);
		
		System.out.println("returnValue = "+returnValue);
		
		double returnValue2 = nBox3.calculate(10, 10.0f,10.0);
		System.out.println(nBox3);
		System.out.println("returnValue2 = "+returnValue2);
	}

}
