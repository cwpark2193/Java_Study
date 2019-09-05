package 객체지향3;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("알파벳을 입력하시오 : ");
		Scanner scan= new Scanner(System.in);
		String string=scan.next();
		char charValue=string.charAt(0);
		System.out.println(charValue);
		switch(charValue) {
		case 'A' : case 'a' : 
		case 'E' : case 'e' : 
		case 'I' : case 'i' : 
		case 'O' : case 'o' : 
		case 'U' : case 'u' : System.out.println(charValue+"는 모음입니다."); break;
		default : System.out.println(charValue+"는 자음입니다.");
		}
	}

}
