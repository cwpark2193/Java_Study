package ��ü����3;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=inputNumber();
		int number2=inputNumber();
		int number3=inputNumber();
		int temp=0;
		if(number1>number2 && number1>number3) {
			temp=number1;
			number1=number3;
			number3=temp;
		}
		else if (number1<number2 && number3<number2 && number1>number3) {
			temp=number2;
			number2=number1;
			number1=number3;
			number3=temp;
		}
		else if (number1>number2) {
			temp=number1;
			number1=number2;
			number2=temp;
		}
		else if(number2>number3) {
			temp=number2;
			number2=number3;
			number3=temp;
		}
		System.out.println("���ĵ� ���� : "+number1+" "+number2+" "+number3);
	}
	public static int inputNumber() {
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		return number ;
	}
}
