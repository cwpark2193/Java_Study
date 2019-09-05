package chapter6;

import java.util.Scanner;

public class ArrayProc {
	public static Scanner scan;
	static {//���� �ʱ�ȭ
		scan=new Scanner(System.in);
	}
	//1. �������
	private int[] score;	private int sum;	private double average;
	//2. ������ �Լ�
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
			System.out.print((i+1)+"��° ���� �Է� : ");
			score[i]=scan.nextInt();
			if(score[i]<0 || score[i]>100) {
				System.out.println("�ٽ� �Է��ϼ���.");
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
