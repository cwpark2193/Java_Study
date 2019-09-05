package °´Ã¼ÁöÇâ4;

import java.util.Arrays;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			++numbers[((int)(Math.random()*(100)+1))/10];
		}
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<10;i++) {
			System.out.print((i*10+1)+"~"+(i*10+10));
			for(int j=0;j<numbers[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
