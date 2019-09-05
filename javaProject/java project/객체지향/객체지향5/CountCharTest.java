package 객체지향5;

import java.util.Scanner;

public class CountCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountChar excount = new CountChar();
		System.out.println(excount);
		Scanner anotherline = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String newline=anotherline.nextLine();
		excount.setCountline(newline);
		excount.countChar();
		excount.printcount();	
	}
}
