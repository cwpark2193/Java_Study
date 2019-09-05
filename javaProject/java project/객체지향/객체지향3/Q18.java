package 객체지향3;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=inputNumber();
		int number2=inputNumber();
		int number3=inputNumber();
		if(number1<number2 && number1<number3) {
			System.out.println(number1+","+number2+","+number3+"중 가장 작은 숫자는 "+number1+"입니다.");
		}
		else if (number2<number1 && number2<number3) {
			System.out.println(number1+","+number2+","+number3+"중 가장 작은 숫자는 "+number2+"입니다.");
		}
		else {
			System.out.println(number1+","+number2+","+number3+"중 가장 작은 숫자는 "+number3+"입니다.");
		}
	}
	public static int inputNumber() {
		System.out.print("정수를 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		return number ;
	}

}
