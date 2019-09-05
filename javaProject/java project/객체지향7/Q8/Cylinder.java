package Q8;

public class Cylinder extends Circle{
	private double height;
	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius, null);
		this.height = 0;
	}
	public Cylinder(double radius, String color) {
		super(radius, color);
		this.height = 0;
	}
	public Cylinder(double radius, String color,double height) {
		super(radius, color);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea()*height;
	}
	
}
