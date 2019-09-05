package chapter5.student;

public class Student {
	private String name;
	private int number;
	private String gender;
	private float grade;
	public Student() {
		name=null;
		number=0;
		gender=null;
		grade=0.0f;
	}
	public Student(String name, int number, String gender, float grade) {
		this.name=name;
		this.number=number;
		this.gender=gender;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", gender=" + gender + ", grade=" + grade + "]";
	}
	public void someonesGrade() {
		System.out.println(getGender()+"인 "+getNumber()+"번 학생"+getName()+"의 평점은 "+getGrade()+"점 입니다.");
	}
}
