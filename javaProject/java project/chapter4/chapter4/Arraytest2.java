package chapter4;

import java.util.Arrays;

public class Arraytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����� ����(�ɺ��� ��� : ������ ��� ���� : COUNT 10)
		final int COUNT = 10;
		int sum=0;
		//2.1���� ������ �迭 Ŭ������ ��üȭ�Ѵ�. �����ڰ��� COUNT
		//��ü���� �������� score
		int[] score = new int [COUNT];
		//3. �ݺ��� �����ϰ� �迭 ���̸�ŭ �ݺ��Ѵ�.
		for(int i=0;i<score.length;i++) {
			//3.1 ����ó���Ѵ�.(50~100 )
			score[i]=(int)(Math.random()*(100-50+1)+50);
			//3.2 �迭���ҿ� �ִ� ������ �����Ѵ�.
			sum+=score[i];
		}
		System.out.println(Arrays.toString(score)+" �� �հ�� "+sum+"�̰� ����� "+(sum/score.length));
	}
 
}
