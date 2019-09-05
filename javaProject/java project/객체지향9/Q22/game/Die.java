package Q22.game;

public class Die {
	private int dicenumber;
	public Die() {
		this.dicenumber=1;
	}
	public int roll() {
		dicenumber=(int)(Math.random()*(6-1+1)+1);
		return dicenumber;
	}
	public int getDicenumber() {
		return dicenumber;
	}
	public void setDicenumber(int dicenumber) {
		this.dicenumber = dicenumber;
	}
	@Override
	public String toString() {
		return "Die [dicenumber=" + dicenumber + "]";
	}
	public int compareTo(Object obj) {
		Die die = null;
		int returnValue = 0;
		if (obj instanceof Die) {
			die = (Die) obj;
			if (this.dicenumber > die.dicenumber) {
				returnValue = 1;
			} else if (this.dicenumber < die.dicenumber) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}
		}
		return returnValue;
	}
}
