package ��ü����4;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hexa2bin = {"0000", "0001", "0010", "0011","0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011","1100", "1101", "1110", "1111"};
		Scanner scan = new Scanner(System.in);
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ� : ");
		String hexaChange = scan.nextLine();
		for(int i=0;i<hexaChange.length();i++) {
			int hexaToBin = hexaChange.charAt(i);
			if(hexaToBin>=48 && hexaToBin<=57) {
				System.out.print(hexa2bin[hexaToBin-48]+" ");				
			}
			else if(hexaToBin>=97 && hexaToBin<=102) {
				System.out.print(hexa2bin[hexaToBin-87]+" ");
			}
		}
	}
}
