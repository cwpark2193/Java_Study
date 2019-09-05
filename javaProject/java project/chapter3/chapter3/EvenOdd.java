package chapter3;

import java.util.Random;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0,i=0;
		for(i=1;i<=10;i++)
		{
			number=(int)(Math.random()*51)+50;
			EvenOdd(number);
		}
	}
	public static void EvenOdd(int num)
	{
		if (num%2==0)
		{
			System.out.println("랜덤 정수 "+num+"은(는) 짝수입니다.");
		}
		else
		{
			System.out.println("랜덤 정수 "+num+"은(는) 홀수입니다.");
		}
	}
}
	
