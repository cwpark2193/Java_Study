package chapter2;

import java.util.Scanner;

public class chap2_p93 {
	public static void main(String[] args) {
		String name;
		int age=0;
		
		Scanner allscanner= new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է��Ͻÿ� : ");
		name=allscanner.nextLine();
		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		age=allscanner.nextInt();
		System.out.println("����� �̸��� : "+name+"�̰� ���̴� "+age+"�Դϴ�.");
	}
}
