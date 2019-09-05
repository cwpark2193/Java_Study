package test;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oranges=0;
		Scanner inputOranges = new Scanner(System.in);
		System.out.println("오렌지의 개수를 입력하세요 : ");
		oranges=inputOranges.nextInt();
		System.out.println(oranges/10+" 박스가 필요하고 "+oranges%10+"개가 남았습니다.");
	}

}
