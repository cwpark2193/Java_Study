package Q14;

public class UnderGraduate extends Student{
	private String circles;
	public UnderGraduate() {
		super();
		this.circles=null;
	}
	public UnderGraduate(String name, int studentnumber, String major, int grade, int creditearned, String circles) {
		super(name, studentnumber, major, grade, creditearned);
		this.circles = circles;
	}
	public String getCircles() {
		return circles;
	}
	public void setCircles(String circles) {
		this.circles = circles;
	}
	@Override
	public String toString() {
		return "UnderGraduate [circles=" + circles + ", toString()=" + super.toString() + "]";
	}
}
