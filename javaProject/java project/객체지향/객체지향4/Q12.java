package ��ü����4;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX=4;
		double max=0.0,min=0.0,sum=0.0;
		double[] numbers = new double [INDEX];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;
			sum+=numbers[i];
		}
		max=numbers[0];
		min=numbers[0];
		for(int i =0;i<numbers.length;i++) {
			if(min>numbers[i])	min=numbers[i];
			if(max<numbers[i])	max=numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("�迭�� �ִ밪�� "+max+" �̰� �ּҰ��� "+min+" �̸� ���� "+sum+" �Դϴ�.");
	}

}
