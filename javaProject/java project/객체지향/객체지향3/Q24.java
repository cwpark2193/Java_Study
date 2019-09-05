package 객체지향3;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long a = 0, b = 1, c = 0;
		 Scanner input = new Scanner(System.in);
		 System.out.print("몇 번째 항까지 출력할 것인지 정하시오 : ");
		 int number=input.nextInt();
		 System.out.print(a+" "+b);
		 for(int i = 2; i <= number; i++)
		 {
		    c=a+b;// 변수 a와 b를 더하여 변수 c에 대입한다.
		    a=b;// 변수 b의 값을 변수 a로 옮긴다. 
		    b=c;// 변수 c의 값을 변수 b로 옮긴다.
		    System.out.print(" "+c);
		 }
   }
}
