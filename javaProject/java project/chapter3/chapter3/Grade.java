package chapter3;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputName = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = inputName.next();
		System.out.print("������ �Է��Ͻÿ� : ");
		int grade = inputNumber.nextInt();
		
		checkGrade(name,grade);
	}
	public static void checkGrade(String num1,int num2) {
		/*
		 * switch(num2/10) { case 10 : case 9 :
		 * System.out.println(num1+"���� ������ "+num2+"�� A�Դϴ�."); break; case 8 :
		 * System.out.println(num1+"���� ������ "+num2+"�� B�Դϴ�."); break; case 7 :
		 * System.out.println(num1+"���� ������ "+num2+"�� C�Դϴ�."); break; case 6 :
		 * System.out.println(num1+"���� ������ "+num2+"�� D�Դϴ�."); break; default :
		 * System.out.println(num1+"���� ������ "+num2+"�� F�Դϴ�.");
		 * System.out.println("�� ������!"); break; }
		 */
		if(num2>=95 && num2<=100) {
			System.out.println(num1+"���� ������ "+num2+"�� A+�Դϴ�.");
		}
		else if(num2>=90 && num2<95) {
			System.out.println(num1+"���� ������ "+num2+"�� A�Դϴ�.");
		}
		else if(num2>=85 && num2<90) {
			System.out.println(num1+"���� ������ "+num2+"�� B+�Դϴ�.");
		}
		else if(num2>=80 && num2<85) {
			System.out.println(num1+"���� ������ "+num2+"�� B�Դϴ�.");
		}
		else if(num2>=75 && num2<80) {
			System.out.println(num1+"���� ������ "+num2+"�� C+�Դϴ�.");
		}
		else if(num2>=70 && num2<75) {
			System.out.println(num1+"���� ������ "+num2+"�� C�Դϴ�.");
		}
		else if(num2>=65 && num2<70) {
			System.out.println(num1+"���� ������ "+num2+"�� D+�Դϴ�.");
		}
		else if(num2>=60 && num2<65) {
			System.out.println(num1+"���� ������ "+num2+"�� D�Դϴ�.");
		}
		else {
			System.out.println(num1+"���� ������ "+num2+"�� F�Դϴ�.");
			System.out.println("�ڳ� ������!");
		}
	}
}
