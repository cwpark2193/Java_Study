package HomeWork;

import java.util.Scanner;

public class Book_163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 6;
		int count=0;
		int [] dice = new int[SIZE];
		Scanner input = new Scanner(System.in);
		System.out.print("�ֻ����� �� �� ������ ���ϼ��� : ");
		count=input.nextInt();
		for(int i =0;i< count;i++) {
			++dice[(int)(Math.random()*SIZE)];
		}
		System.out.println("------------------------------------");
		System.out.println("\t��\t|\t��");
		System.out.println("------------------------------------");
		for(int i =0;i< SIZE;i++) {
			System.out.println("\t"+(i+1)+"\t|\t"+dice[i]);
		}
		System.out.println("------------------------------------");
	}

}
