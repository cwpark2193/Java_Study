package 객체지향6;

public class Pointer {
	private int x;
	private int y;
	public Pointer() {this(0,0);}
	public Pointer(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void set(int x,int y) {
		setX(x);
		setY(y);
	}
	public void print() {
		System.out.println("현재의 좌표는 x축으로 "+getX()+"만큼, y축으로 "+getY()+"만큼 이동되어있습니다.");
	}
}
