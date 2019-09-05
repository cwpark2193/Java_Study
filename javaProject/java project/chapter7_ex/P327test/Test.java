package P327test;
class Shape{
	public Shape() {
		System.out.println("Shape 持失切()");
	}
}
class Rectangle extends Shape{
	public Rectangle() {

		System.out.println("Rectangle 持失切()");
	}
}
public class Test {

	public static void main(String[] args) {
		Rectangle r3 = new Rectangle();
	}

}
