package °´Ã¼ÁöÇâ4;

import java.util.Arrays;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX=10;
		double[]value = new double[INDEX]; 
		init(value);
		System.out.println(Arrays.toString(value));
	} 
	public static void init(double[] value) {
		for(int i =0;i<value.length;i++) {
			value[i]=i+1;
		}
	}
}
