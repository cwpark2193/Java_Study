package Q17Test;

public class Rectangle implements Movable {
	private int dx;
	private int dy;
	
	public Rectangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		this.toString();
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangle [dx=" + dx + ", dy=" + dy + "]";
	}

	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("사각형의 원점 x="+dx+", y= "+dy+"로 이동했습니다.");
	}

}
