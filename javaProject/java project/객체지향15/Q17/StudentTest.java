package Q17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		int menu = 0;
		String name = null, address = null, phoneNumber = null;
		Scanner scan = new Scanner(System.in);
//		���� �߰�,�˻�,���� �޴�
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student("�л�1", "����� ������", "010-1234-5678");
		Student student2 = new Student("�л�2", "����� ���۱�", "010-2345-6789");
		Student student3 = new Student("�л�3", "����� ���ı�", "010-3456-7890");
		Student student4 = new Student("�л�4", "����� ���Ǳ�", "010-5678-8901");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		System.out.println(list);
		for (;;) {
			System.out.println("���ϴ� �۾��� �����ϼ���.");
			System.out.println("1.�л����� �߰� 2.�л����� �˻� 3.�л����� ���� 4.����");
			menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("�̸� : ");
				scan.nextLine();
				name = scan.nextLine();
				System.out.println("�ּ� : ");
				
				address = scan.nextLine();
				System.out.println("��ȭ��ȣ : ");
			
				phoneNumber = scan.nextLine();
				Student student = new Student(name, address, phoneNumber);
				list.add(student);
				System.out.println(list);
				continue;
			} else if (menu == 2) {
				System.out.println("�˻��� ���ϴ� �л��� �̸��� �Է��ϼ���.");
				scan.nextLine();
				name = scan.nextLine();
//		��� ���� ���
				for (Student stu : list) {
					if (stu.getName()==name) {
						System.out.println("�̸� : " + stu.getName());
						System.out.println("�ּ� : " + stu.getAddress());
						System.out.println("��ȭ��ȣ : " + stu.getPhoneNumber());
						break;
					} else {
						System.out.println("�������� �ʴ� �л��Դϴ�. �ٽ� �Է��ϼ���.");
					}
				}
				
			} else if (menu == 3) {
				System.out.println("������ ���Ͻô� �л��� �̸��� �Է��ϼ���.");
				scan.nextLine();
				name = scan.nextLine();
				for (Student stu : list) {
					if (true) {
						list.remove(stu);
						System.out.println("�����Ǿ����ϴ�.");
						break;
					} else {
						System.out.println("�������� �ʴ� �л��Դϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}

		}
	}// end of main
}
