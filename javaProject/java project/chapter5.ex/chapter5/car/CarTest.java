package chapter5.car;

import java.util.Scanner;

import chapter2.chap2_p76;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ��ü�� �����.(ren,2,80), String str=new String ("red")
		//Scanner scan=new Scanner(System.in);
		//System.out.println("");
		//String color=scan.nextLine();
		Car car= new Car("red", 2, 80);
		//2. ���(��ü)
		car.printcar();
		//3. ���4,���ǵ� �ι� ���, ���ǵ� �ٿ� 1��
		car.setchangeGear(4);
		car.setupSpeed(2);
		car.setdownSpeed(1);
		//4. ��� ��ü
		car.printcar();
	}

}
