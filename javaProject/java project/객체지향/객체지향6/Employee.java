package 객체지향6;

public class Employee {
	private String name;
	private String phoneNumber;
	private int pay;
	public Employee() {
		this(null,null,0);
	}
	public Employee(String name, String phoneNumber, int pay) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void print() {
		System.out.println(getName()+"씨의 전화번호는 "+getPhoneNumber()+"이고 연봉은 연 "+getPay()+"만원입니다.");
	}
	
}
