package chapter2;

import java.util.Scanner;

public class chap2_p93 {
	public static void main(String[] args) {
		String name;
		int age=0;
		
		Scanner allscanner= new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하시오 : ");
		name=allscanner.nextLine();
		System.out.print("당신의 나이를 입력하시오 : ");
		age=allscanner.nextInt();
		System.out.println("당신의 이름은 : "+name+"이고 나이는 "+age+"입니다.");
	}
}
