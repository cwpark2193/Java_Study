package °´Ã¼ÁöÇâ6;

public class Circle {
	public static final double PI = 3.141592;
	private double radious;
	private double cx;
	private double cy;	
	public Circle() {
		this(0.0,0.0,0.0);
	}
	public Circle(double radious, double cx, double cy) {
		this.radious = radious;
		this.cx = cx;
		this.cy = cy;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
	public double getCx() {
		return cx;
	}
	public void setCx(double cx) {
		this.cx = cx;
	}
	public double getCy() {
		return cy;
	}
	public void setCy(double cy) {
		this.cy = cy;
	}
	public double area() {
		return PI*radious*radious;
	}
	@Override
	public String toString() {
		return "Circle [radious=" + radious + ", cx=" + cx + ", cy=" + cy + "]";
	}
	
}
