package chapter6.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1,e2,e3;
		e1 = new Employee(3400, "일바보");
		e2 = new Employee(3500, "이바보");
		e3 = new Employee(3600, "삼바보");
		e1 = null;
		System.err.println("직원수 : "+Employee.getCount());
		
	}

}
