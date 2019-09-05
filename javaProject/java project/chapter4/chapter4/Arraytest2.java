package chapter4;

import java.util.Arrays;

public class Arraytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.상수를 정의(심볼릭 상수 : 변수형 상수 정의 : COUNT 10)
		final int COUNT = 10;
		int sum=0;
		//2.1차원 정수형 배열 클래스를 객체화한다. 생성자값은 COUNT
		//객체참조 변수명은 score
		int[] score = new int [COUNT];
		//3. 반복문 선언하고 배열 길이만큼 반복한다.
		for(int i=0;i<score.length;i++) {
			//3.1 랜덤처리한다.(50~100 )
			score[i]=(int)(Math.random()*(100-50+1)+50);
			//3.2 배열원소에 있는 값들을 누적한다.
			sum+=score[i];
		}
		System.out.println(Arrays.toString(score)+" 총 합계는 "+sum+"이고 평균은 "+(sum/score.length));
	}
 
}
