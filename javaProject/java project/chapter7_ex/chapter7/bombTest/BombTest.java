package chapter7.bombTest;

public class BombTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bomb[] bigbomb = {new House(),new Car(),new Tree(),new Building()};
		for(int i= 0;i<bigbomb.length;i++) {
			
			if(bigbomb[i] instanceof House) {
				((House)bigbomb[i]).sbomb();
			}
			else if(bigbomb[i] instanceof Car) {
				((Car)bigbomb[i]).sbomb();
			}
			else if(bigbomb[i] instanceof Tree) {
				((Tree)bigbomb[i]).sbomb();
			}
			else if(bigbomb[i] instanceof Building) {
				((Building)bigbomb[i]).sbomb();
			}
			bigbomb[i].bomb();
			bigbomb[i].sbomb();
		}
		System.out.println("=======================");
		System.out.println("caution\tcaution\tcaution\t");
		System.out.println("=======================");
	}

}
