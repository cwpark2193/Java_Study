package chapter2;


public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수명을 선언한다.double(radious,area)
		//2. 반지름을 할당한다.(5)
		//3. 면적을 계산한다. (반지름*반지름*3.141592)
		//4. 면적과 반지름을 출력한다. printf,println
		double radious=0,area=0;
		
		radious=5.0;
		area=radious*radious*3.141592;
		System.out.printf("반지름 %fm의 면적은 %f입니다.",radious,area);
		System.out.println("반지름 "+radious+"m의 면적은 "+area+"m2입니다.");
		
	}

}
