package Q17;

public class MovableTest {

	public static void main(String[] args) {
		Movable[] mseries = {new Circle(),new Rectangle(),new Triangle()};
		for(int i=0;i<mseries.length;i++) {
			mseries[i].draw();
		}
	}
}
