package 객체지향5;

import java.util.Scanner;

public class CheckIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckID someid = new CheckID();
		Scanner otherid = new Scanner(System.in);
		System.out.print("아이디를 입력해라. 아이디를 입력하지 않으면 체포하겠다. : ");
		String anotherid = otherid.nextLine();
		someid.setNewid(anotherid);
		System.out.println(someid);
		someid.matchid();
	}
}
