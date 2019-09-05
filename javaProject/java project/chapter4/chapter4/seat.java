package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체를 선언한다.
		Book book = new Book(0);//1번 객체배열 선언과 2번 초기화 동시 완성
		book.seatPrint();//3. 출력완료
		for(;;) {
			//4. 예약받기
			book.inputBookIndex();
			//5. 예약여부 확인
			int[] seat = book.getSeat();
			if(seat[book.getIndex()-1]==1) {
				System.out.println("이미 예약되었습니다.");
				continue;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			else {
				seat[book.getIndex()-1]=1;
				System.out.println("예약이 완료되었습니다.");
				book.seatPrint();
			}
		}
	}
}