package Q17;

public class Student2 implements Comparable{
	private String name;
	private String address;
	private String phoneNumber;
	public Student2 (String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Student2 stu=null;
		if(o instanceof Student2) {
			stu=(Student2)o;
		}
		return phoneNumber.compareTo(stu.phoneNumber);
	}
}
