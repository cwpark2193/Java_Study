package Q6;

public class Rectangle implements GraphicsObject{
	private int length;
	private int width;
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public int getArea() {
		return length*width;
	}
	@Override
	public void draw() {
		System.out.println("이 사각형의 길이는 "+length+"이고 폭은 "+width+"이며 넓이는 "+getArea()+"입니다.");
	}
	public void setDimensions (int l, int w) {
		this.length=l;
		this.width=w;
	}
}
