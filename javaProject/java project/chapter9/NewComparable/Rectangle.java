package NewComparable;

public class Rectangle implements Comparable {
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
	@Override
	public int compareTo(Object other) {
		Rectangle r1=null;
		int returnValue=0;
		if(other instanceof Rectangle) {
			r1=(Rectangle)other;
			if(this.width>r1.width) {
				returnValue=1;
			}
			else if(this.width<r1.width) {
				returnValue=-1;
			}else {
				returnValue=0;
			}
		}
		return returnValue;
	}
	

}
