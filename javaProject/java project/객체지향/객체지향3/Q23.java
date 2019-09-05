package 객체지향3;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue=0;
		for(;;) {
			System.out.print("원하는 사칙연산을 시행하세요: ");
			Scanner scan= new Scanner(System.in);
			String string=scan.next();
			charValue=string.charAt(0);
			if(charValue=='q') break;
			if((charValue=='+')||(charValue=='-')||(charValue=='*')||(charValue=='/')) {
				System.out.print("첫번째 수를 입력하세요 : ");
				double number1=inputNumber();
				System.out.print("두번째 수를 입력하세요 : ");
				double number2=inputNumber();
				arithmetic(charValue, number1, number2);
			}
			else {
				System.out.println("다시 입력하세요. ");
			}
		}		
	}
	public static double inputNumber() {
		Scanner input = new Scanner(System.in);
		double number=input.nextDouble();
		return number;
	}
	public static void arithmetic(char charValue,double numberOne,double numberTwo) {
		if(charValue=='+') {
			System.out.println(numberOne+"+"+numberTwo+"="+(numberOne+numberTwo));
		}
		else if(charValue=='-') {
			System.out.println(numberOne+"-"+numberTwo+"="+(numberOne-numberTwo));
		}
		else if(charValue=='*') {
			System.out.println(numberOne+"*"+numberTwo+"="+(numberOne*numberTwo));
		}
		else if((charValue=='/')&& numberTwo!=0) {
			System.out.println(numberOne+"/"+numberTwo+"="+(numberOne/numberTwo));
		}
	}
}
