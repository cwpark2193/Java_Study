package ��ü����3;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Ű�� ü���Է�
		Scanner input = new Scanner(System.in);
		System.out.println("����� Ű�� �Է��ϼ���. ");
		double height=input.nextDouble();
		System.out.println("����� ü���� �Է��ϼ���. ");
		double weight=input.nextDouble();		
		//2. ǥ�� ü�� ���
		double standardWeight=(height-100)*0.9;
		//3. ü�� ��
		double max=(standardWeight+1.0);
		double min=(standardWeight-1.0);		
		if(weight>max) {
			System.out.println("����� Ű"+height+"cm�� �ش�Ǵ� ǥ�� ü���� "+standardWeight+"�Դϴ�. ������ 1kg�����Դϴ�.");
			System.out.println("����� ü����"+weight+"kg���� ǥ��ü��"+standardWeight+"�� "+(weight-max)+"kg��ŭ �Ѵ� ��ü���Դϴ�.");
		}
		if(weight<min) {
			System.out.println("����� Ű"+height+"cm�� �ش�Ǵ� ǥ�� ü���� "+standardWeight+"�Դϴ�. ������ 1kg�����Դϴ�.");
			System.out.println("����� ü����"+weight+"kg���� ǥ��ü��"+standardWeight+"���� "+(min-weight)+"kg��ŭ ������ ��ü���Դϴ�.");
		}
		if(weight>min&& weight<max) {
			System.out.println("����� Ű"+height+"cm�� �ش�Ǵ� ǥ�� ü���� "+standardWeight+"�Դϴ�. ������ 1kg�����Դϴ�.");
			System.out.println("����� ü����"+weight+"kg���� ǥ��ü��"+standardWeight+"�� �ش�˴ϴ�.");
		}
	}

}
