package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Book {	
	//1. �������(���� �������, �ν��Ͻ��������)
	public static Scanner scan = new Scanner(System.in);
	public static final int COUNT = 10;//�������
	public int [] seat =new int [COUNT];//�ν��Ͻ����
	public int index; 
	//2. ����Լ�
	public void inputArrayValue(int[]seat) {
		System.out.print("�迭 �ʱⰪ ����(0���� ���� ����) : ");
		int iniitValue=scan.nextInt();
		for(int i=0;i<seat.length;i++) {
			seat[i]=iniitValue;
		}
		return;
	}
	public void seatPrint() {
		System.out.println(Arrays.toString(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(Arrays.toString(seat));
		return;
	}
	public void inputBookIndex() {
		for(;;) {
			System.out.print("�¼��� �����ϼ���(����� -1) : ");
			index=scan.nextInt();
			if(index==-1) {
				System.out.println("�߰�.");
				System.exit(0);
			}
			if(index>=1 && index<=10) break;
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		return ;
	}
	
	public int[] getSeat() {
		return seat;
	}
	public void setSeat(int[] seat) {
		this.seat = seat;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	//3. �������Լ�
	public Book(int init) {
		index = 0;
		for(int i=0;i<seat.length;i++) {
			seat[i]=init;
		}
	}
}
