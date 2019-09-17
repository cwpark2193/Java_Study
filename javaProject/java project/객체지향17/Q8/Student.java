package Q8;

import java.io.Serializable;

public class Student implements Serializable{
	public int number;
	public String name;
	public String phoneNumber;
	public String emailAddress;
	public Student(int number, String name, String phoneNumber, String emailAddress) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}

	
}
