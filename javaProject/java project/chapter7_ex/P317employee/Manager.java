package P317employee;

public class Manager extends Employee{
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn) {
		super(name, address, salary, rrn);
		this.bonus=bonus;
	}
	public void test() {
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("salary = "+salary);
		//System.out.println("rrn = "+rrn); private, 즉 접근제어자가 한정되어 자식클래스로서 직접접근이 불가하다.
	}
}
