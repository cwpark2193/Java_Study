package chapter14.tricatch;

import javax.management.RuntimeErrorException;

public class BadIndex {
	public static final int SIZE = 10;

	public static void main(String[] args) throws RuntimeException {
		int[] array = new int[SIZE];
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		testprint();
		try {
			result = array[12];
			System.out.println("1. 프로그램 진행 중입니다.");
		} catch (ArrayIndexOutOfBoundsException a) {
			result = array[9];
			System.out.println("2. 잘 맞췄어요(속았어요.). 당신은 성공했습니다.(사기당했습니다.) 결과값은 " + result);

		} finally {
			System.out.println("3. 프로그램 진행이 끝났습니다.");
		}
		System.out.println("4. 과연 이 문장이 실행이 될까요?" + result);
	}

	private static void testprint() throws RuntimeException{
		System.out.println("11. 함수 실행");
		int number=0;
		try{
			number=10/0;			
		}catch(ArithmeticException c) {
			System.out.println("12. 프로그램 오류입니다.");
			throw new RuntimeException();
		}
		System.out.println("13. 값을 찍습니다."+number);
		System.out.println("14. 프로그램 종료");
	}

}
