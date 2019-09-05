package chapter9.rectangle2;

public class Rectangle implements Comparable {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println(this);
	}
	//3. 멤버함수
	public int getArea() {
		return width*height;
	}
	//4. 오버라이드 함수
	@Override
	public int compareTo(Object other) {
		// 우리가 구현해야될 로직이다.
		Rectangle rectangle=null;
		int returnValue=0;
		if(other instanceof Rectangle) {
			rectangle=(Rectangle)other;
			if((width+height)>(rectangle.width+rectangle.height)) {
				return 1;
			}
			else if((width+height)<(rectangle.width+rectangle.height)) {
				return -1;
			}else {
				return 0;
			}
		}
		System.out.println(rectangle);
		return 0;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
