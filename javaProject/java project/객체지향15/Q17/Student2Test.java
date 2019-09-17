package Q17;

import java.util.ArrayList;
import java.util.Iterator;

public class Student2Test {

	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<Student2>();
		// 정보 입력
		list.add(new Student2("김성민", "오동동", "12345678"));
		list.add(new Student2("유영삼", "송파구", "987654321"));
		list.add(new Student2("정민지", "잠실", "17745678"));
		// 정보 검색
		Iterator<Student2> iter = list.iterator();
		boolean tag = false;
		while (iter.hasNext()) {
			Student2 stu = iter.next();
			if (stu.getName().equals("정민지")) {
				tag = true;
				System.out.println(stu.getName() + " 학생이 있습니다.");
				System.out.println(stu.getAddress());
				System.out.println(stu.getPhoneNumber());
			}
		}
		if (tag == false) {
			System.out.println("정민지 학생이 없습니다.");
		}
		// 삭제 기능
		Iterator<Student2> iter2 = list.iterator();
		while (iter2.hasNext()) {
			Student2 stu = iter2.next();
			if (stu.getName().equals("정민지")) {
				iter2.remove();
			}
			// 출력기능
			for (Student2 stu2 : list) {
				System.out.println(stu2);
			}
		} // end of main
	}
}
