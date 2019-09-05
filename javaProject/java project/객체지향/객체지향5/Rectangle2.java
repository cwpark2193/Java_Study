package °´Ã¼ÁöÇâ5;

public class Rectangle2 {
	private int width;
	private int height;
	public Rectangle2() {
		width=0;
		height=0;
	}
	public Rectangle2(int width,int height) {
		this.width=width;
		this.height=height;
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
	public int area() { return width*height; }
	public int perimeter() { return ((width+height)*2); }
	@Override
	public String toString() {
		return "Rectangle2 [width=" + width + ", height=" + height + "]";
	}
	
}
