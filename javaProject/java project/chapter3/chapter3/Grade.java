package chapter3;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputName = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String name = inputName.next();
		System.out.print("성적을 입력하시오 : ");
		int grade = inputNumber.nextInt();
		
		checkGrade(name,grade);
	}
	public static void checkGrade(String num1,int num2) {
		/*
		 * switch(num2/10) { case 10 : case 9 :
		 * System.out.println(num1+"님의 성적은 "+num2+"로 A입니다."); break; case 8 :
		 * System.out.println(num1+"님의 성적은 "+num2+"로 B입니다."); break; case 7 :
		 * System.out.println(num1+"님의 성적은 "+num2+"로 C입니다."); break; case 6 :
		 * System.out.println(num1+"님의 성적은 "+num2+"로 D입니다."); break; default :
		 * System.out.println(num1+"님의 성적은 "+num2+"로 F입니다.");
		 * System.out.println("넌 낙제야!"); break; }
		 */
		if(num2>=95 && num2<=100) {
			System.out.println(num1+"님의 성적은 "+num2+"로 A+입니다.");
		}
		else if(num2>=90 && num2<95) {
			System.out.println(num1+"님의 성적은 "+num2+"로 A입니다.");
		}
		else if(num2>=85 && num2<90) {
			System.out.println(num1+"님의 성적은 "+num2+"로 B+입니다.");
		}
		else if(num2>=80 && num2<85) {
			System.out.println(num1+"님의 성적은 "+num2+"로 B입니다.");
		}
		else if(num2>=75 && num2<80) {
			System.out.println(num1+"님의 성적은 "+num2+"로 C+입니다.");
		}
		else if(num2>=70 && num2<75) {
			System.out.println(num1+"님의 성적은 "+num2+"로 C입니다.");
		}
		else if(num2>=65 && num2<70) {
			System.out.println(num1+"님의 성적은 "+num2+"로 D+입니다.");
		}
		else if(num2>=60 && num2<65) {
			System.out.println(num1+"님의 성적은 "+num2+"로 D입니다.");
		}
		else {
			System.out.println(num1+"님의 성적은 "+num2+"로 F입니다.");
			System.out.println("자넨 낙제야!");
		}
	}
}
