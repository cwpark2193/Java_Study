package 객체지향6;

public class Q19 {
	private double side;	// 정육면체의 한변
	public Q19() {
		this(0.0);
	}
	public Q19(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public double getVolume() {
		return side*side*side;
	}
}
