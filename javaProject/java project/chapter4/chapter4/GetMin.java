package chapter4;

import java.util.Arrays;

public class GetMin {

	public static void main(String[] args) {
		final int INDEX=10;
		int minimum=0;
		// TODO Auto-generated method stub
		//1. �������迭��ü�� �����.(s)
		int[] s = new int[INDEX];
		//2. �������� 10~50���� �迭 ��ü �����Ѵ�.
		inputIntArray(s);
		//3. ù��° �迭��ü��Ұ��� minimum������ �����Ѵ�.
		minimum=s[0];
		//4. ��� �迭��ü��Ҹ� ���ʴ�� ���Ͽ� ���� �����Ѵ�.
		for(int i=0;i<s.length;i++) {
			if(minimum>s[i])	minimum=s[i];
		}
		//5. �ּҰ��� ����Ѵ�.
		System.out.println(Arrays.toString(s));
		System.out.println("�ּҰ��� = "+minimum);
	}
	public static void inputIntArray(int[]s) {
		for(int i=0;i<s.length;i++) {
			s[i]=(int)(Math.random()*(50-10+1)+10);
		}
	}

}
