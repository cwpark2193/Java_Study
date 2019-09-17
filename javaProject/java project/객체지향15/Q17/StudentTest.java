package Q17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		int menu = 0;
		String name = null, address = null, phoneNumber = null;
		Scanner scan = new Scanner(System.in);
//		정보 추가,검색,삭제 메뉴
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student("학생1", "서울시 강남구", "010-1234-5678");
		Student student2 = new Student("학생2", "서울시 동작구", "010-2345-6789");
		Student student3 = new Student("학생3", "서울시 송파구", "010-3456-7890");
		Student student4 = new Student("학생4", "서울시 관악구", "010-5678-8901");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		System.out.println(list);
		for (;;) {
			System.out.println("원하는 작업을 선택하세요.");
			System.out.println("1.학생정보 추가 2.학생정보 검색 3.학생정보 삭제 4.종료");
			menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("이름 : ");
				scan.nextLine();
				name = scan.nextLine();
				System.out.println("주소 : ");
				
				address = scan.nextLine();
				System.out.println("전화번호 : ");
			
				phoneNumber = scan.nextLine();
				Student student = new Student(name, address, phoneNumber);
				list.add(student);
				System.out.println(list);
				continue;
			} else if (menu == 2) {
				System.out.println("검색을 원하는 학생의 이름를 입력하세요.");
				scan.nextLine();
				name = scan.nextLine();
//		향상 포문 사용
				for (Student stu : list) {
					if (stu.getName()==name) {
						System.out.println("이름 : " + stu.getName());
						System.out.println("주소 : " + stu.getAddress());
						System.out.println("전화번호 : " + stu.getPhoneNumber());
						break;
					} else {
						System.out.println("존재하지 않는 학생입니다. 다시 입력하세요.");
					}
				}
				
			} else if (menu == 3) {
				System.out.println("삭제를 원하시는 학생의 이름을 입력하세요.");
				scan.nextLine();
				name = scan.nextLine();
				for (Student stu : list) {
					if (true) {
						list.remove(stu);
						System.out.println("삭제되었습니다.");
						break;
					} else {
						System.out.println("존재하지 않는 학생입니다. 다시 입력하세요.");
					}
				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

		}
	}// end of main
}
