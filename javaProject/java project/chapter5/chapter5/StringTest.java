package chapter5;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		Scanner scan = new Scanner(System.in);
		System.out.print("사이트를 입력해요. :");
		str=scan.nextLine();
		if(str.equals("quit")) {
			System.exit(0);
		}else if(str.matches("^www\\.(.+)$")) {
			System.out.println("맞게 입력하셨습니다.");
		}else {
			System.out.println("다시 입력하세요.");
		}
	}

}
