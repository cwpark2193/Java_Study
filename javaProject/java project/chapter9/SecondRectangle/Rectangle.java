package SecondRectangle;

public class Rectangle implements Comparable{
	public int width; 
	public int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public int getArea() {
		return width*height;
	}
	@Override
	public int compareTo(Object obj) {
		Rectangle r1 = null;
		int returnValue=0;
		if(obj instanceof Rectangle) {
			r1=(Rectangle)obj;
			if(this.getArea()>r1.getArea()) {
				returnValue=1;
			}
			else if(this.getArea()<r1.getArea()) {
				returnValue=-1;
			}
			else {
				returnValue=0;
			}
		}
		return returnValue;
	} 
	
}