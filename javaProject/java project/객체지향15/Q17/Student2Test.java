package Q17;

import java.util.ArrayList;
import java.util.Iterator;

public class Student2Test {

	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		// ���� �Է�
		list.add(new Student2("�輺��", "������", "12345678"));
		list.add(new Student2("������", "���ı�", "987654321"));
		list.add(new Student2("������", "���", "17745678"));
		// ���� �˻�
		Iterator<Student2> iter = list.iterator();
		boolean tag = false;
		while (iter.hasNext()) {
			Student2 stu = iter.next();
			if (stu.getName().equals("������")) {
				tag = true;
				System.out.println(stu.getName() + " �л��� �ֽ��ϴ�.");
				System.out.println(stu.getAddress());
				System.out.println(stu.getPhoneNumber());
			}
		}
		if (tag == false) {
			System.out.println("������ �л��� �����ϴ�.");
		}
		// ���� ���
		Iterator<Student2> iter2 = list.iterator();
		while (iter2.hasNext()) {
			Student2 stu = iter2.next();
			if (stu.getName().equals("������")) {
				iter2.remove();
			}
			// ��±��
			for (Student2 stu2 : list) {
				System.out.println(stu2);
			}
		} // end of main
	}
}
