package chapter3;

import java.util.Scanner;

public class Gcf {

	public static void main(String[] args) {
		int x=inputValue();
		int y= inputValue();
		int temp=0;
		if(x<y) {
			temp=x;
			x=y;
			y=temp;
		}
		GodPrint(x,y);
	}
	public static int inputValue() {
		int value=0;
		do {
			System.out.print("1~100������ ���� �Է��Ͻÿ�: ");
			Scanner inputNumber= new Scanner(System.in);
			value=inputNumber.nextInt();
		}while(value<1 || value>100);
		return value;
	}
	public static void GodPrint(int number1,int number2) { 
		int temp=0;
		while(true) {
			if(number2==0) {
				System.out.println("�ִ� ������� "+number1+"�̴�.");break;
			}
			else {
				temp=number1%number2;
				number1=number2;
				number2=temp;
			}
		}
	}
}
		
