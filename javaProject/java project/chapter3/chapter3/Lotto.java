package chapter3;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long number1=0,number2=0,fact1=1,fact2=1,sum=1;
		do {
			System.out.print("전체 수 입력 : ");
			number1=input.nextLong();
			System.out.print("선택 수 입력 : ");
			number2=input.nextLong();
		}while((number1<1||number1>45)||(number2<1||number2>45));
		for(int i=1;i<=number2;i++) {
			fact1*=(number1-i+1);
			fact2*=i;
		}
		sum=(fact1/fact2);
		System.out.println("1/"+sum);
	}

}
