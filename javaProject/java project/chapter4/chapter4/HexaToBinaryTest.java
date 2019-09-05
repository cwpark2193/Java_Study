package chapter4;

import java.util.Scanner;

public class HexaToBinaryTest {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		String binaryStirng=null;
		//1. 16진수 문자열을 2진수 문자열로 변환하는 프로그램 작성
		System.out.print("16진수 문자열 입력하시오(4자리) : ");
		String hexaValue = scan.nextLine();
		for(int i=0;i<hexaValue.length();i++) {
			char charValue = hexaValue.charAt(i);
			if(charValue>='0'&& charValue<='9') {
				number = charValue-'0';
			}
			else if(charValue>='a'&& charValue<='f') {
				number = charValue-'a'+10;
			}
			else if(charValue>='A'&& charValue<='F') {
				number = charValue-'A'+10;
			}
			binaryStirng=toBinaryString(number);
			System.out.print(binaryStirng+" ");
		}
	}
	public static String toBinaryString(int number) {
		String str=null;
		str=Integer.toBinaryString(number);
		while(str.length()<4) {
			str="0"+str;
		}
		return str;
	}
}
