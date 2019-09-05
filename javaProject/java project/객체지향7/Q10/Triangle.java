package Q10;

public class Triangle extends Shape{
	private int width2;
	private int width3;
	public Triangle() {
		super();
	}
	public Triangle(double x, double y, int width, int height,int width2,int width3) {
		super(x, y, width, height);
		this.width2 = width2;
		this.width3 = width3;	
	}
	@Override
	public int getPeremeter() {
		return super.getWidth()+this.width2+this.width3;
	}
	@Override
	public double getArea() {
		return (super.getWidth()*super.getHeight())/2.0;
	}
	@Override
	public String toString() {
		return "�ﰢ���� �߾��� ��ǥ�� x��ǥ : "+super.getX()+" y��ǥ : "+super.getY()+"�̸� �� ���� ���̴� "+super.getWidth()+","+width2+","+width3+"�̰� ���̴� "+super.getHeight()+"�̴�.";
	}	
}
