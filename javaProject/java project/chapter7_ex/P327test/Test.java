package P327test;
class Shape{
	public Shape() {
		System.out.println("Shape ������()");
	}
}
class Rectangle extends Shape{
	public Rectangle() {

		System.out.println("Rectangle ������()");
	}
}
public class Test {

	public static void main(String[] args) {
		Rectangle r3 = new Rectangle();
	}

}
