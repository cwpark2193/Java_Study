package 객체지향3;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("몇 번째 항까지 조화수열의 합을 구하시오: ");
		int number=input.nextInt();
		double sum=0.0;
		for(int i=1;i<=number;i++) {
			sum+=(double)1/(double)i;
		}
		System.out.println("수열의 합은"+sum);
	}
}
