package ��ü����3;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long a = 0, b = 1, c = 0;
		 Scanner input = new Scanner(System.in);
		 System.out.print("�� ��° �ױ��� ����� ������ ���Ͻÿ� : ");
		 int number=input.nextInt();
		 System.out.print(a+" "+b);
		 for(int i = 2; i <= number; i++)
		 {
		    c=a+b;// ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
		    a=b;// ���� b�� ���� ���� a�� �ű��. 
		    b=c;// ���� c�� ���� ���� b�� �ű��.
		    System.out.print(" "+c);
		 }
   }
}
