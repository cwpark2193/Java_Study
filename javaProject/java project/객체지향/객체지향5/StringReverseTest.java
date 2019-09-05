package 객체지향5;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse string1 = new StringReverse();
		System.out.println(string1);
		Scanner string2 = new Scanner(System.in);
		System.out.print("역순출력할 문자를 입력하세요: ");
		String newstring=string2.nextLine();
		string1.setExline(newstring);
		System.out.println(string1);
		string1.changeReverse(newstring);
		System.out.println(string1.changeReverse(newstring));		
	}

}
