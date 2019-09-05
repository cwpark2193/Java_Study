package chapter3;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int comValue=(int)(Math.random()*(100-1+1)+1);
		for(;;) {
			Scanner scan = new Scanner(System.in);
			System.out.print("정답 추측 가즈아아아아아아아!!!!! ");
			int userValue=scan.nextInt();
			count++;
			if(comValue<userValue) {
				System.out.println("너무 크다 임마!");
			}
			else if(comValue>userValue) {
				System.out.println("니 속은 밴댕이 소갈딱지냐?! 작아!");
			}
			else{
				System.out.println("정답이다! 짜식!");
				System.out.println("시도 횟수 : "+count);
				break;
			}
		}
	}
}
