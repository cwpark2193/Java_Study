package chapter3;

import java.util.Scanner;

public class Bouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("실적을 입력하시오(단위 : 만원) : ");
		int number=input.nextInt();
		checkBonus(number);
	}
	
	public static void checkBonus(int num) {
		if(num>=1000) {
			System.out.println("실적 달성! 수고했습니다.");
			int bonus=(int)((num-1000)*0.1);
			System.out.println("보너스 "+bonus+"만원을 사무처에서 받아가세요.");
		}
		else {
			int minus = 1000-num;
			System.out.println("실적 "+minus+"원만큼 미달성. 분발하세요.");
		}
		return;
	}
}
