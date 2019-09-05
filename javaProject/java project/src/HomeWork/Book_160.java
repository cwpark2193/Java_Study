package HomeWork;

import java.util.Arrays;

public class Book_160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX=10;
		int minimum=0,maximum=0;
		int [] s = new int [INDEX];
		for(int i =0;i<s.length;i++) {
			s[i]=(int)(Math.random()*(100-50+1)+50);
		}
		maximum=s[0];
		minimum=s[0];
		for(int i =0;i<s.length;i++) {
			if(minimum>s[i])	minimum=s[i];
			if(maximum<s[i])	maximum=s[i];
		}
		System.out.println(Arrays.toString(s));
		System.out.println("배열의 최소값은 "+minimum+" 이고 최대값은 "+maximum+" 이다.");
	}
}
