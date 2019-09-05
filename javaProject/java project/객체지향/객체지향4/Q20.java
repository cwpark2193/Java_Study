package 객체지향4;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade=0;
		double sum=0.0;
		Scanner inputMember = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오 : ");
		int[] members = new int[inputMember.nextInt()];
		for(int i=0;i<members.length;i++) {			
			System.out.print("학생"+(i+1)+"의 성적을 입력하시오: ");
			Scanner inputGrade = new Scanner(System.in);
			grade=inputGrade.nextInt();
			if(grade>=1 && grade <=100) {
				sum=(sum+grade)/(i+1);
				continue;
			}
			else {
				System.out.println("잘못된 성적입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println("성적의 평균은 "+sum+"입니다");
	}

}
