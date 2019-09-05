package chapter7.play;

public class BombTest {
	public static void main(String[] args) {
		Bomb[] bomb = {new Building(),new Car(),new House(),new Tree()};
		for(int i=0;i<bomb.length;i++) {
			if(bomb[i] instanceof Building) {
				((Building)bomb[i]).sbomb();
			}
			else if(bomb[i] instanceof Car) {
				((Car)bomb[i]).sbomb();
			}
			else if(bomb[i] instanceof House) {
				((House)bomb[i]).sbomb();
			}
			else if(bomb[i] instanceof Tree) {
				((Tree)bomb[i]).sbomb();
			}
			bomb[i].fireInTheHole();
			bomb[i].sbomb();
			System.out.println("=======================");
		}
	}
}
