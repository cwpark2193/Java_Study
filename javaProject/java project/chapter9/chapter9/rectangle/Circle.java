package chapter9.rectangle;

public class Circle {
	public int radious;
	public final double PI=3.141592;
	public Circle(int radious) {
		super();
		this.radious = radious;
	}
	public double getArea() {
		return PI*radious*radious;
	}
	
}