package Q17Test;

public class MovableTest {
	public static final int NO = 3;
	public static void main(String[] args) {
		Movable[] moveable = {new Circle(10,20),new Rectangle(10,20),new Triangle(10,20)};
		for(int i=0;i<moveable.length;i++) {
			int dx = (int)(Math.random()*(10)+1);
			int dy = (int)(Math.random()*(10)+1);
			moveable[i].move(dx,dy);
		}
	}

}
