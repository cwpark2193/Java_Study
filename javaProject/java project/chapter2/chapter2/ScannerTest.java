package chapter2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ����ڷκ��� �Է¹޴� ���.
		//1. Scanner ��ü�� �����.	
		//2. ���ڿ�(nextLine),���ڴܾ� next,������nextInt,�Ǽ���nextDouble,�οﰪnextBoolean 
		Scanner parkScanner = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��Ͻÿ� : ");
		String name=parkScanner.nextLine();
		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		int age=parkScanner.nextInt();
		System.out.println("����� �̸��� : "+name+"�Դϴ�.");
		System.out.println("����� ���̴� : "+age+"�Դϴ�.");
	}

}
