package Q17Test;

public class Triangle implements Movable {
	private int dx;
	private int dy;

	public Triangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		this.toString();
	}
	

	public Triangle() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Triangle [dx=" + dx + ", dy=" + dy + "]";
	}


	@Override
	public void move(int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
		System.out.println("삼각형의 원점 x="+dx+", y= "+dy+"로 이동했습니다.");
	}


}
