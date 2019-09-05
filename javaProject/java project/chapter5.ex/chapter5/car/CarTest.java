package chapter5.car;

import java.util.Scanner;

import chapter2.chap2_p76;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체를 만든다.(ren,2,80), String str=new String ("red")
		//Scanner scan=new Scanner(System.in);
		//System.out.println("");
		//String color=scan.nextLine();
		Car car= new Car("red", 2, 80);
		//2. 출력(객체)
		car.printcar();
		//3. 기어4,스피드 두번 상승, 스피드 다운 1번
		car.setchangeGear(4);
		car.setupSpeed(2);
		car.setdownSpeed(1);
		//4. 출력 객체
		car.printcar();
	}

}
