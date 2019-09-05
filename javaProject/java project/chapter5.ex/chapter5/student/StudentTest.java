package chapter5.student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student oneStudent = new Student();
		Student twoStudent = new Student("¹ÚÀçÈÆ",19,"³²¼º",95);
		oneStudent.setGender("³²¼º");
		oneStudent.setNumber(12);
		oneStudent.setName("¹ÚÀçÈÆ");
		oneStudent.setGrade(87);
		
		System.out.println(oneStudent.getGender());
		System.out.println(oneStudent.getNumber());
		System.out.println(oneStudent.getName());
		System.out.println(oneStudent.getGrade());
		
		System.out.println(twoStudent.toString());
		oneStudent.someonesGrade();
		twoStudent.someonesGrade();
	}

}
