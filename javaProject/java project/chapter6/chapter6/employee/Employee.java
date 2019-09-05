package chapter6.employee;

public class Employee {
	//1. 멤버변수(정적멤버변수/인스턴스 멤버변수)
	private static int count=0;
	private double salary;
	private String name;
	//2. 생성자 오버로딩(디폴트,매개변수)
	public Employee() {
		this(0.0,null);
	}
	public Employee(double salary, String name) {
		this.salary = salary;
		this.name = name;
		Employee.count++;
	}
	//3. 오버라이딩
	@Override
	protected void finalize() { //throws Throwable {//throw는 예외처리
		System.out.println("잘 있거라 나는 간다.");
		this.count--;
	}
	//4. getter 함수 진행
	public static int getCount() {
		return count;
	}
	
	
	
}
