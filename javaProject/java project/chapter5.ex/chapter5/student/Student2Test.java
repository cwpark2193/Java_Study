package chapter5.student;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2("김동진",28,"여성",100);
		
		//2. stu1 객체를 값을 셋팅한다.
		stu1.setName("조민수"); stu1.setNo(29); stu1.setGender("남성"); stu1.setScore(89);
		//3. stu1 객체를 getter 출력한다.
		System.out.println(stu1.getName());
		System.out.println(stu1.getNo());
		System.out.println(stu1.getGender());
		System.out.println(stu1.getScore());
		
		//4. stu2 객체를 toString으로 한다.
		System.out.println(stu2.hashCode());
		System.out.println(stu2.toString());
		//5. stu1,stu2의 이름과 평점을 출력한다.
		stu1.printNameScore();
		stu2.printNameScore();
	}

}
