package ��ü����3;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�� ��° �ױ��� ��ȭ������ ���� ���Ͻÿ�: ");
		int number=input.nextInt();
		double sum=0.0;
		for(int i=1;i<=number;i++) {
			sum+=(double)1/(double)i;
		}
		System.out.println("������ ����"+sum);
	}
}
