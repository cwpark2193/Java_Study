package chapter5.student;

public class Student2 {
	//1.�������
	private String name;
	private int no;
	private String gender;
	private int score;
	
	//2. ������ �Լ�
	public Student2() {
		this.name=null; this.no=0; this.gender=null; this.score=0;
	}
	public Student2(String name,int no,String gender, int score) {
		this.name=name; this.no=no; this.gender=gender; this.score=score;
	}
	//3. getters, setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//4. toString
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", no=" + no + ", gender=" + gender + ", score=" + score + "]";
	}
	//5. ����� ���� �Լ�
	public void printNameScore() {
		System.out.println("�̸� ="+name+"����"+score);
	}
}
