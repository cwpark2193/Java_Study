package test;

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=0,price=0,added_tax=0,change=0; 
        Scanner input = new Scanner(System.in);
    	System.out.print("���� �ݾ�: "); 
    	money=input.nextInt();
    	System.out.print("��ǰ ����: "); 
    	price=input.nextInt();
    	
    	added_tax=price/10;
    	System.out.println("�ΰ��� : "+added_tax);
		
		change=money-price;
		System.out.println("�ܱ� :  "+change);
	}

}
