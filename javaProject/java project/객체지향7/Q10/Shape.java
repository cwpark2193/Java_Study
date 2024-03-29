package Q10;

public class Shape {
	private double x;
	private double y;
	private int width;
	private int height;
	public Shape() {
		super();
	}
	public Shape(double x, double y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getPeremeter() {
		return (width+height)*2;
	}
	public double getArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
}
