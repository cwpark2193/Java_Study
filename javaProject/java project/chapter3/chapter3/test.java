package chapter3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner inputNumber= new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int number=inputNumber.nextInt();
		toBinaryString(number);
	}
	public static void toBinaryString(int number) {
		String strValue=Integer.toBinaryString(number);
		while(strValue.length()<=32) {
			strValue="0"+strValue;
		}
		System.out.println(number+"의 이진법 변환 결과="+strValue);
		return;
	}
}


