package Q17Test;

public class Circle extends Object implements Movable{
	private int dx;
	private int dy;
	public Circle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		this.toString();
	}

	@Override
	public String toString() {
		return "Circle [dx=" + dx + ", dy=" + dy + "]";
	}

	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("원의 원점 x="+dx+", y= "+dy+"로 이동했습니다.");
	}
	
}
