package chapter3;

import java.util.Scanner;

public class Bouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�(���� : ����) : ");
		int number=input.nextInt();
		checkBonus(number);
	}
	
	public static void checkBonus(int num) {
		if(num>=1000) {
			System.out.println("���� �޼�! �����߽��ϴ�.");
			int bonus=(int)((num-1000)*0.1);
			System.out.println("���ʽ� "+bonus+"������ �繫ó���� �޾ư�����.");
		}
		else {
			int minus = 1000-num;
			System.out.println("���� "+minus+"����ŭ �̴޼�. �й��ϼ���.");
		}
		return;
	}
}
