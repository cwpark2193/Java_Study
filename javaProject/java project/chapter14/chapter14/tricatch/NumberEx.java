package chapter14.tricatch;

public class NumberEx {

	public static void main(String[] args) {
		int number=0;
		System.out.println("1. 숫자 계산합니다.");
		try {
			number=10/0; //비체크예외
		}catch (ArithmeticException e) {
			number=10/1;
		}finally {
			System.out.println("프로그램 종료");
		}
		System.out.println("2. 결과값 출력합니다.="+number);
	}

}
