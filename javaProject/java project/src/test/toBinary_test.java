package test;

import java.util.Scanner;

public class toBinary_test {
	//���� ��� �Լ�
	public static void main(String[] args) {
		int number=0;
		System.out.print("2�������� �ٲ� �������� �Է¿�� : ");
		Scanner inputT=new Scanner(System.in); //�Է¹޴� ��踦 �������.
		number=inputT.nextInt();
		String strValue=toBinaryString(number);
		System.out.println(number+"���� 2������ȯ= "+strValue);
	}
	public static String toBinaryString(int value) {
		String strValue=Integer.toBinaryString(value);
		System.out.println("2�������� ��ȯ�� ���ڿ����� : "+strValue.length());
		while (strValue.length()<=32) {
			strValue="0"+strValue;
		}
		return strValue;
	}
}
