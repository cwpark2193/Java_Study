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
			System.out.print(number+"�� �̸��� �Է� ���");
			String name=scan.nextLine();
			System.out.print(number+"�� ��ȭ��ȣ�� �Է� ���");
			String phoneNumber=scan.nextLine();
			System.out.print(number+"�� �̸��� �ּҸ� �Է� ���");
			String emailAddress=scan.nextLine();
			list.add(new Student(number, name, phoneNumber, emailAddress));
			number++;
			System.out.println("��� �����Ͻðڽ��ϱ�? (y/n)");
			String go = scan.nextLine();
			if(go.equals("N")||go.equals("n"))break;	
		}
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		//������ȭ���
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois= new ObjectInputStream(bis);
		ArrayList<Student> list2=(ArrayList<Student>)ois.readObject();
		
		Iterator<Student> iter = list2.iterator();
		boolean find=false;
		System.out.println("���ϴ� �л��� ��ȣ�� �Է��ϼ���.");
		int num=scan.nextInt();
		while(iter.hasNext()) {
			Student stu= iter.next();
			if(stu.number==num) {
				System.out.println(stu); find=true; break;
			}
		}//end of while
		if(find==false) {
			System.out.println("�����ϴ�.");
		}
		if(ois!=null) {ois.close();}
	}//end of main

}
