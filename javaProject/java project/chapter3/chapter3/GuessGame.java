package chapter3;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int comValue=(int)(Math.random()*(100-1+1)+1);
		for(;;) {
			Scanner scan = new Scanner(System.in);
			System.out.print("���� ���� ����ƾƾƾƾƾƾ�!!!!! ");
			int userValue=scan.nextInt();
			count++;
			if(comValue<userValue) {
				System.out.println("�ʹ� ũ�� �Ӹ�!");
			}
			else if(comValue>userValue) {
				System.out.println("�� ���� ����� �Ұ�������?! �۾�!");
			}
			else{
				System.out.println("�����̴�! ¥��!");
				System.out.println("�õ� Ƚ�� : "+count);
				break;
			}
		}
	}
}
