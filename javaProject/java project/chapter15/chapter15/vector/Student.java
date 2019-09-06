package chapter15.vector;

public class Student {
	public int num;
	public String name;
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
