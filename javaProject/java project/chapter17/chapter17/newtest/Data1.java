package chapter17.newtest;

import java.io.Serializable;

public class Data1 implements Serializable{
	private String name;
	private String birthday;
	private String address;
	public Data1(String name, String birthday, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	
}
