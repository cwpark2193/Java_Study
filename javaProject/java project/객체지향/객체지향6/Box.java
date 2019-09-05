package 객체지향6;

public class Box {
	private int width;
	private int depth;
	private int height;
	private boolean empty=true;
	public Box() {
		this(0,0,0);
		this.empty=empty;
	}
	public Box(int width) {
		this.width = width;
		this.depth = 0;
		this.height = 0;
	}
	public Box(int width, int depth) {
		this.width = width;
		this.depth = depth;
		this.height = 0;
	}
	public Box(int width, int depth, int height) {
		this.width = width;
		this.depth = depth;
		this.height = height;
		this.empty=empty;
	}
	public void checkeEmpty() {
		if(empty) {
			System.out.println("빈 상자");
		}else {
			System.out.println("내용물이 있습니다.");
		}
	}
}
