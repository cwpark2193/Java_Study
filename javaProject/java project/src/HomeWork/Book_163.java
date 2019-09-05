package HomeWork;

import java.util.Scanner;

public class Book_163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 6;
		int count=0;
		int [] dice = new int[SIZE];
		Scanner input = new Scanner(System.in);
		System.out.print("주사위를 몇 번 돌릴지 정하세요 : ");
		count=input.nextInt();
		for(int i =0;i< count;i++) {
			++dice[(int)(Math.random()*SIZE)];
		}
		System.out.println("------------------------------------");
		System.out.println("\t면\t|\t빈도");
		System.out.println("------------------------------------");
		for(int i =0;i< SIZE;i++) {
			System.out.println("\t"+(i+1)+"\t|\t"+dice[i]);
		}
		System.out.println("------------------------------------");
	}

}
