package test;

import java.util.Scanner;

public class toBinary_test {
	//정적 멤버 함수
	public static void main(String[] args) {
		int number=0;
		System.out.print("2진법으로 바꿀 정수값을 입력요망 : ");
		Scanner inputT=new Scanner(System.in); //입력받는 기계를 만들었다.
		number=inputT.nextInt();
		String strValue=toBinaryString(number);
		System.out.println(number+"값을 2진법변환= "+strValue);
	}
	public static String toBinaryString(int value) {
		String strValue=Integer.toBinaryString(value);
		System.out.println("2진법으로 변환된 문자열길이 : "+strValue.length());
		while (strValue.length()<=32) {
			strValue="0"+strValue;
		}
		return strValue;
	}
}
