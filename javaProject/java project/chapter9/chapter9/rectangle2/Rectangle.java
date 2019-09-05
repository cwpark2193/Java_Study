package chapter9.rectangle2;

public class Rectangle implements Comparable {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println(this);
	}
	//3. ����Լ�
	public int getArea() {
		return width*height;
	}
	//4. �������̵� �Լ�
	@Override
	public int compareTo(Object other) {
		// �츮�� �����ؾߵ� �����̴�.
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
