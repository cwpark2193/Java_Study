package chapter6.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1,e2,e3;
		e1 = new Employee(3400, "�Ϲٺ�");
		e2 = new Employee(3500, "�̹ٺ�");
		e3 = new Employee(3600, "��ٺ�");
		e1 = null;
		System.err.println("������ : "+Employee.getCount());
		
	}

}
