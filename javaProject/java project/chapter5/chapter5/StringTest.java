package chapter5;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		Scanner scan = new Scanner(System.in);
		System.out.print("����Ʈ�� �Է��ؿ�. :");
		str=scan.nextLine();
		if(str.equals("quit")) {
			System.exit(0);
		}else if(str.matches("^www\\.(.+)$")) {
			System.out.println("�°� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
	}

}
