package chapter2;

import java.util.Scanner;

public class chap2_p92 {
	public static void main(String[] args) {
		int x=0,y=0,sum=0;
		
		Scanner input= new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		x=input.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		y=input.nextInt();
		
		sum=x+y;
		System.out.println("두 숫자의 합은 "+sum+"입니다.");
		
	}
}
