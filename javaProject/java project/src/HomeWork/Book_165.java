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
				System.out.print("���ϴ� �¼� ��ȣ�� �Է��ϼ���(����� -1) : ");
				Scanner inputseats = new Scanner(System.in);
				seatNumber = inputseats.nextInt();
				if(seatNumber==-1) {flag=1; break;}
				if(seatNumber>=1 && seatNumber<=10) {
					if(seats[seatNumber-1]==0) {
						seats[seatNumber-1]=1;
						System.out.println("���� �Ϸ�Ǿ����ϴ�."); break;
					}else {
						System.out.println("����� �ڸ��Դϴ�.");
					}
				}
				else {
					System.out.println("���� �¼��Դϴ�. �ٽ� �Է��ϼ���.");
				}
				
			}
			if(seats[seatNumber-1]==1) continue;
			if(flag==1); break;
		}
	}

}
