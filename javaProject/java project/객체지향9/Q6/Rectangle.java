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
		System.out.println("�� �簢���� ���̴� "+length+"�̰� ���� "+width+"�̸� ���̴� "+getArea()+"�Դϴ�.");
	}
	public void setDimensions (int l, int w) {
		this.length=l;
		this.width=w;
	}
}
