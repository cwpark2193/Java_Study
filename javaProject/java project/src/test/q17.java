package test;

import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		double radius; 
        double volume; 
        Scanner input = new Scanner(System.in);
 
        System.out.print("���� ������: "); // �Է� �ȳ� ���
    	radius = input.nextDouble(); 
    	volume = (4.0/3.0)*radius*radius*radius;
        System.out.println("���� ����: " + volume);
	}

}
