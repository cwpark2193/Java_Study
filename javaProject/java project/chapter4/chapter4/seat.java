package chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ��ü�� �����Ѵ�.
		Book book = new Book(0);//1�� ��ü�迭 ����� 2�� �ʱ�ȭ ���� �ϼ�
		book.seatPrint();//3. ��¿Ϸ�
		for(;;) {
			//4. ����ޱ�
			book.inputBookIndex();
			//5. ���࿩�� Ȯ��
			int[] seat = book.getSeat();
			if(seat[book.getIndex()-1]==1) {
				System.out.println("�̹� ����Ǿ����ϴ�.");
				continue;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			else {
				seat[book.getIndex()-1]=1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				book.seatPrint();
			}
		}
	}
}