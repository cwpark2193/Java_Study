package chapter2;

import java.util.Scanner;

public class chap2_p99 {
	public static void main(String[] args) {
		double width=0.0,depth=0.0,area=0.0,perimeter=0.0;
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("사각형의 가로를 입력하시오 : ");
		width=input.nextDouble();
		System.out.println("사각형의 세로를 입력하시오 : ");
		depth=input.nextDouble();
		
		perimeter=(width+depth)*2;
		area=width*depth;
		
		System.out.println("사각형의 둘레는 "+perimeter+"이고 면적은 "+area+"입니다.");
	}
}
