package ��ü����4;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade=0;
		double sum=0.0;
		Scanner inputMember = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
		int[] members = new int[inputMember.nextInt()];
		for(int i=0;i<members.length;i++) {			
			System.out.print("�л�"+(i+1)+"�� ������ �Է��Ͻÿ�: ");
			Scanner inputGrade = new Scanner(System.in);
			grade=inputGrade.nextInt();
			if(grade>=1 && grade <=100) {
				sum=(sum+grade)/(i+1);
				continue;
			}
			else {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
			}
		}
		System.out.println("������ ����� "+sum+"�Դϴ�");
	}

}
