package chapter4;

import java.util.Arrays;

public class GetMin {

	public static void main(String[] args) {
		final int INDEX=10;
		int minimum=0;
		// TODO Auto-generated method stub
		//1. 정수형배열객체를 만든다.(s)
		int[] s = new int[INDEX];
		//2. 랜덤으로 10~50까지 배열 객체 저장한다.
		inputIntArray(s);
		//3. 첫번째 배열객체요소값을 minimum값으로 저장한다.
		minimum=s[0];
		//4. 모든 배열객체요소를 차례대로 비교하여 값을 수정한다.
		for(int i=0;i<s.length;i++) {
			if(minimum>s[i])	minimum=s[i];
		}
		//5. 최소값은 출력한다.
		System.out.println(Arrays.toString(s));
		System.out.println("최소값은 = "+minimum);
	}
	public static void inputIntArray(int[]s) {
		for(int i=0;i<s.length;i++) {
			s[i]=(int)(Math.random()*(50-10+1)+10);
		}
	}

}
