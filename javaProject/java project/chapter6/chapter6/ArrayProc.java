package chapter6;

import java.util.Scanner;

public class ArrayProc {
	public static Scanner scan;
	static {//정적 초기화
		scan=new Scanner(System.in);
	}
	//1. 멤버변수
	private int[] score;	private int sum;	private double average;
	//2. 생성자 함수
	public ArrayProc() {
		this(5,0,0.0);
	}
	public ArrayProc(int size, int sum, double average) {
		this.score = new int[size];
		this.sum=sum;
		this.average=average;
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
		return this.average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public void getValue() {
		for(int i=0;i<score.length;i++) {
			System.out.print((i+1)+"번째 값을 입력 : ");
			score[i]=scan.nextInt();
			if(score[i]<0 || score[i]>100) {
				System.out.println("다시 입력하세요.");
				i--;
			}
		}
	}
	public void printArray(){
		for(int value :score) {
			System.out.print(String.format("%4d", value));
		}
	}
	
}
