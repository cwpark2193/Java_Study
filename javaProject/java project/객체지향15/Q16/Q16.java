package Q16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		double max=0.0,min=0.0,sum=0.0,value=0.0;
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("�ɻ������� ���� : ");
			double grade = scan.nextDouble();
			list.add(grade);
			max=Collections.max(list);
			min=Collections.min(list);
			value=list.get(i);
			sum=sum+value;
		}
		System.out.println("������ �� : "+(sum-max-min));
	}

}
