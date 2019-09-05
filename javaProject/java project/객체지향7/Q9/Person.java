package Q9;

public class Person {
	private String name;
	private String address;
	private String phonenumber;
	public Person() {
		super();
	}
	public Person(String name) {
		this.name = name;
		this.address = null;
		this.phonenumber = null;
	}
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
		this.phonenumber = null;
	}
	public Person(String name, String address, String phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + "]";
	}
}
