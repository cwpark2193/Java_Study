package chapter6.ArrayProc2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProc {
	private int[] score; 
	private int sum; 
	private double average; 
	private int max; 
	private int min;
	public ArrayProc() {
		this(20,0,0.0,0,0);
	}
	public ArrayProc(int size, int sum, double average,int max,int min) {
		this.score=new int [size];
		this.sum=sum;
		this.average=average;
		this.max=max;
		this.min=min;
	}
	
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public int getSum() {
		for(int i=0;i<score.length;i++) {
			this.sum+=score[i];
		}
		return this.sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		this.average=this.sum/(double)(score.length);
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getMax() {
		this.max=score[0];
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}
		}
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		this.min=score[0];
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) {
				min=score[i];
			}
		}
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void getValue() {
		for(int i=0;i<score.length;i++) {
			score[i]=(int)((Math.random()*(100-1+1)+1));
		}
	}
	@Override
	public String toString() {
		return "ArrayProc [score=" + Arrays.toString(score) + ", sum=" + sum + ", average=" + average + ", max=" + max
				+ ", min=" + min + "]";
	}
	public void printArray() {
		
	}
	
}
