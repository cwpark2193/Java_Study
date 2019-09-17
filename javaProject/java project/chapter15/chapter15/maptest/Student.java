package chapter15.maptest;

public class Student implements Comparable<Student>{
	public int number;
	public String name;
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[number=" + number + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		Student stu1 = null;
		if(this.number>stu1.number) {
			return 1;
		}
		if(this.number<stu1.number) {
			return -1;
		}
		return 0;
	}
}
