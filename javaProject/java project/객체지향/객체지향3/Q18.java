package ��ü����3;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=inputNumber();
		int number2=inputNumber();
		int number3=inputNumber();
		if(number1<number2 && number1<number3) {
			System.out.println(number1+","+number2+","+number3+"�� ���� ���� ���ڴ� "+number1+"�Դϴ�.");
		}
		else if (number2<number1 && number2<number3) {
			System.out.println(number1+","+number2+","+number3+"�� ���� ���� ���ڴ� "+number2+"�Դϴ�.");
		}
		else {
			System.out.println(number1+","+number2+","+number3+"�� ���� ���� ���ڴ� "+number3+"�Դϴ�.");
		}
	}
	public static int inputNumber() {
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		return number ;
	}

}
