package Q21;

import Q17.Circle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rec= new Rectangle("���", 5, 10);
		Triangle tri = new Triangle("����", 6, 18);
		System.out.println(rec);
		System.out.println(rec.calcArea());
		System.out.println(tri);
		System.out.println(tri.calcArea());
	}

}
