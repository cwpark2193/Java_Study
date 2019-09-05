package Q8;

public class Circle {
	public static final double PI=3.141592;
	private double radius;
	private String color;
	public Circle() {
		this(0.0,null);
	}
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	
}
