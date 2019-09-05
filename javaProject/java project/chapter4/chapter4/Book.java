package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Book {	
	//1. 멤버변수(정적 멤버변수, 인스턴스멤버변수)
	public static Scanner scan = new Scanner(System.in);
	public static final int COUNT = 10;//정적멤버
	public int [] seat =new int [COUNT];//인스턴스멤버
	public int index; 
	//2. 멤버함수
	public void inputArrayValue(int[]seat) {
		System.out.print("배열 초기값 선언(0으로 값을 설정) : ");
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
			System.out.print("좌석을 예약하세요(종료는 -1) : ");
			index=scan.nextInt();
			if(index==-1) {
				System.out.println("잘가.");
				System.exit(0);
			}
			if(index>=1 && index<=10) break;
			System.out.println("다시 입력하세요.");
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
	//3. 생성자함수
	public Book(int init) {
		index = 0;
		for(int i=0;i<seat.length;i++) {
			seat[i]=init;
		}
	}
}
