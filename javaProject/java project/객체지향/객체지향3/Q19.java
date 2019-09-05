package 객체지향3;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=inputNumber();
		double result=0;
		if(number>=0) {
			result=(number*number*number)-9*number+2;
			System.out.println(number+"에 의한 함수 결과값은"+result+"입니다.");
		}
		else if(number<0) {
			result=7*number+2;
			System.out.println(number+"에 의한 함수 결과값은"+result+"입니다.");
		}
	}
	public static double inputNumber() {
		System.out.print("실수를 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		double number=input.nextDouble();
		return number;
	}
}
