package chapter3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner inputNumber= new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int number=inputNumber.nextInt();
		toBinaryString(number);
	}
	public static void toBinaryString(int number) {
		String strValue=Integer.toBinaryString(number);
		while(strValue.length()<=32) {
			strValue="0"+strValue;
		}
		System.out.println(number+"�� ������ ��ȯ ���="+strValue);
		return;
	}
}


