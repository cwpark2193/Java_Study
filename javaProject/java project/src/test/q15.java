package test;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mile=0.0,km=0.0;
		Scanner inputMile=new Scanner(System.in);
		System.out.print("mile을 입력하시오 : ");
		mile=inputMile.nextDouble();
		km=1.609*mile;
		System.out.println(mile+"마일은 "+km+"km입니다.");
	}

}
