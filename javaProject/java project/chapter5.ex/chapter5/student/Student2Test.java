package chapter5.student;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2("�赿��",28,"����",100);
		
		//2. stu1 ��ü�� ���� �����Ѵ�.
		stu1.setName("���μ�"); stu1.setNo(29); stu1.setGender("����"); stu1.setScore(89);
		//3. stu1 ��ü�� getter ����Ѵ�.
		System.out.println(stu1.getName());
		System.out.println(stu1.getNo());
		System.out.println(stu1.getGender());
		System.out.println(stu1.getScore());
		
		//4. stu2 ��ü�� toString���� �Ѵ�.
		System.out.println(stu2.hashCode());
		System.out.println(stu2.toString());
		//5. stu1,stu2�� �̸��� ������ ����Ѵ�.
		stu1.printNameScore();
		stu2.printNameScore();
	}

}
