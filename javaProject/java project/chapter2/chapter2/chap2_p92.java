package chapter2;

import java.util.Scanner;

public class chap2_p92 {
	public static void main(String[] args) {
		int x=0,y=0,sum=0;
		
		Scanner input= new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		x=input.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		y=input.nextInt();
		
		sum=x+y;
		System.out.println("�� ������ ���� "+sum+"�Դϴ�.");
		
	}
}
