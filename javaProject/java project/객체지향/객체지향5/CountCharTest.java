package ��ü����5;

import java.util.Scanner;

public class CountCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountChar excount = new CountChar();
		System.out.println(excount);
		Scanner anotherline = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String newline=anotherline.nextLine();
		excount.setCountline(newline);
		excount.countChar();
		excount.printcount();	
	}
}
