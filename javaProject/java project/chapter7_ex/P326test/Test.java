package P326test;
class Shape{
	public Shape() {
		System.out.println("Shape ������()");
	}
}
class Rectangle extends Shape{
	public Rectangle() {
		super();
		System.out.println("Rectangle ������()");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
	}

}
