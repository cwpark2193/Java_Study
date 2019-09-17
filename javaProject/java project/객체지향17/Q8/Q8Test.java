package Q8;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q8Test {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int number=1;
		File file = new File("Gimbab.dat");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos= new ObjectOutputStream(bos);
		ArrayList<Student> list=new ArrayList<Student>();
		for(;;) {
			System.out.print(number+"번 이름을 입력 요망");
			String name=scan.nextLine();
			System.out.print(number+"번 전화번호를 입력 요망");
			String phoneNumber=scan.nextLine();
			System.out.print(number+"번 이메일 주소를 입력 요망");
			String emailAddress=scan.nextLine();
			list.add(new Student(number, name, phoneNumber, emailAddress));
			number++;
			System.out.println("계속 진행하시겠습니까? (y/n)");
			String go = scan.nextLine();
			if(go.equals("N")||go.equals("n"))break;	
		}
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		//역직렬화방식
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois= new ObjectInputStream(bis);
		ArrayList<Student> list2=(ArrayList<Student>)ois.readObject();
		
		Iterator<Student> iter = list2.iterator();
		boolean find=false;
		System.out.println("원하는 학생의 번호를 입력하세요.");
		int num=scan.nextInt();
		while(iter.hasNext()) {
			Student stu= iter.next();
			if(stu.number==num) {
				System.out.println(stu); find=true; break;
			}
		}//end of while
		if(find==false) {
			System.out.println("없습니다.");
		}
		if(ois!=null) {ois.close();}
	}//end of main

}
