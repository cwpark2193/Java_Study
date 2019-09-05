package test;

import java.util.Scanner;

public class q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		String result = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수: "); // 입력 안내 출력
		value =  input.nextInt();
		
		result = toBinaryString(value);
        System.out.println(result);
		

	}

	public static String toBinaryString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length() <32){
			str = "0"+str;
		}
		return str;
	}
}




