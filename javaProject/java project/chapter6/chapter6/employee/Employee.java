package chapter6.employee;

public class Employee {
	//1. �������(�����������/�ν��Ͻ� �������)
	private static int count=0;
	private double salary;
	private String name;
	//2. ������ �����ε�(����Ʈ,�Ű�����)
	public Employee() {
		this(0.0,null);
	}
	public Employee(double salary, String name) {
		this.salary = salary;
		this.name = name;
		Employee.count++;
	}
	//3. �������̵�
	@Override
	protected void finalize() { //throws Throwable {//throw�� ����ó��
		System.out.println("�� �ְŶ� ���� ����.");
		this.count--;
	}
	//4. getter �Լ� ����
	public static int getCount() {
		return count;
	}
	
	
	
}
