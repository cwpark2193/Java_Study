package Q14;

public class Student {
	private String name;
	private int studentnumber;
	private String major;
	private int grade;
	private int creditearned;
	public Student() {
		super();
	}
	public Student(String name, int studentnumber, String major, int grade, int creditearned) {
		this.name = name;
		this.studentnumber = studentnumber;
		this.major = major;
		this.grade = grade;
		this.creditearned = creditearned;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCreditearned() {
		return creditearned;
	}
	public void setCreditearned(int creditearned) {
		this.creditearned = creditearned;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentnumber=" + studentnumber + ", major=" + major + ", grade=" + grade
				+ ", creditearned=" + creditearned + "]";
	}
}
