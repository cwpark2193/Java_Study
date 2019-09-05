package 객체지향4;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX=9;
		int[] numbers = new int [INDEX];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=INDEX-i;
		}
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("3의 위치 : "+Arrays.binarySearch(numbers,3)+"번째");
	}

}
