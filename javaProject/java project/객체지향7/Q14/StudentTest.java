package Q14;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동",1234,"컴공",3,32);
		System.out.println(student1);
		
		UnderGraduate student2 = new UnderGraduate("저길동",1235,"시컴",3,31,"축구부");
		System.out.println(student2);
		
		Graduate student3 = new Graduate("고길동", 1236, "전자학과", 4, 33, "연구조교", 0.56);
		System.out.println(student3);
	}
}
