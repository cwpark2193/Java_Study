package ��ü����3;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue=0;
		for(;;) {
			System.out.print("���ϴ� ��Ģ������ �����ϼ���: ");
			Scanner scan= new Scanner(System.in);
			String string=scan.next();
			charValue=string.charAt(0);
			if(charValue=='q') break;
			if((charValue=='+')||(charValue=='-')||(charValue=='*')||(charValue=='/')) {
				System.out.print("ù��° ���� �Է��ϼ��� : ");
				double number1=inputNumber();
				System.out.print("�ι�° ���� �Է��ϼ��� : ");
				double number2=inputNumber();
				arithmetic(charValue, number1, number2);
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���. ");
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
