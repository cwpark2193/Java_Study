package chapter2;

import java.util.Scanner;

public class chap2_p97 {
	public static void main(String[] args) {
		double radious=0.0,area=0.0;
		
		System.out.println("���� �������� �Է��Ͻÿ� : ");
		Scanner input=new Scanner(System.in);
		radious=input.nextDouble();
		area=radious*radious*3.141592;
		System.out.println("���� �������� "+radious+"�̰� ������ "+area+"�Դϴ�.");
	}
}
