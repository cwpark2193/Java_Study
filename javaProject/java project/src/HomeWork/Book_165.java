package HomeWork;

import java.util.Scanner;

public class Book_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		int [] seats = new int[SIZE];
		int flag=0;
		int seatNumber=0;
		for(;;) {
			System.out.println("----------------------");
			for(int i=0;i<SIZE;i++) {
				System.out.print((i+1)+" ");
			}
			System.out.println("\n----------------------");
			for(int i=0;i<SIZE;i++) {
				System.out.print(seats[i]+" ");
			}
			System.out.println("\n----------------------");
			for(;;) {
				System.out.print("원하는 좌석 번호를 입력하세요(종료는 -1) : ");
				Scanner inputseats = new Scanner(System.in);
				seatNumber = inputseats.nextInt();
				if(seatNumber==-1) {flag=1; break;}
				if(seatNumber>=1 && seatNumber<=10) {
					if(seats[seatNumber-1]==0) {
						seats[seatNumber-1]=1;
						System.out.println("예약 완료되었습니다."); break;
					}else {
						System.out.println("예약된 자리입니다.");
					}
				}
				else {
					System.out.println("없는 좌석입니다. 다시 입력하세요.");
				}
				
			}
			if(seats[seatNumber-1]==1) continue;
			if(flag==1); break;
		}
	}

}
