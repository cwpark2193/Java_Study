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
			System.out.println("���� ���� "+num+"��(��) ¦���Դϴ�.");
		}
		else
		{
			System.out.println("���� ���� "+num+"��(��) Ȧ���Դϴ�.");
		}
	}
}
	
