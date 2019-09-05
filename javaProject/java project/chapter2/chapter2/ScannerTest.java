package chapter2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문장을 사용자로부터 입력받는 방법.
		//1. Scanner 객체를 만든다.	
		//2. 문자열(nextLine),문자단어 next,정수값nextInt,실수값nextDouble,부울값nextBoolean 
		Scanner parkScanner = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하시오 : ");
		String name=parkScanner.nextLine();
		System.out.print("당신의 나이를 입력하시오 : ");
		int age=parkScanner.nextInt();
		System.out.println("당신의 이름은 : "+name+"입니다.");
		System.out.println("당신의 나이는 : "+age+"입니다.");
	}

}
