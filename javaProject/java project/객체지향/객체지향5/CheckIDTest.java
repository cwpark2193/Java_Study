package ��ü����5;

import java.util.Scanner;

public class CheckIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckID someid = new CheckID();
		Scanner otherid = new Scanner(System.in);
		System.out.print("���̵� �Է��ض�. ���̵� �Է����� ������ ü���ϰڴ�. : ");
		String anotherid = otherid.nextLine();
		someid.setNewid(anotherid);
		System.out.println(someid);
		someid.matchid();
	}
}
