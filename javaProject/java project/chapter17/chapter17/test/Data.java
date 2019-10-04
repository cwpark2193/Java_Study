package chapter17.test;

import java.io.Serializable;

public class Data implements Serializable{
	public String name;
	public int birthday;
	public String address;
	public Data(String name, int birthday, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	
	
}
