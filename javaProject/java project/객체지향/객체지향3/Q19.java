package ��ü����3;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=inputNumber();
		double result=0;
		if(number>=0) {
			result=(number*number*number)-9*number+2;
			System.out.println(number+"�� ���� �Լ� �������"+result+"�Դϴ�.");
		}
		else if(number<0) {
			result=7*number+2;
			System.out.println(number+"�� ���� �Լ� �������"+result+"�Դϴ�.");
		}
	}
	public static double inputNumber() {
		System.out.print("�Ǽ��� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		double number=input.nextDouble();
		return number;
	}
}
