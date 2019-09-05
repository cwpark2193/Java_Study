package °´Ã¼ÁöÇâ6;

public class Dice {
	private int dicenumber;
	public Dice() {
		this(0);
	}
	public Dice(int dicenumber) {
		this.dicenumber = dicenumber;
	}
	public int getDicenumber() {
		return dicenumber;
	}
	public void setDicenumber(int dicenumber) {
		this.dicenumber = dicenumber;
	}
	@Override
	public String toString() {
		return "Dice [dicenumber=" + dicenumber + "]";
	}
	public int roll() {
		int face = (int)(Math.random()*6+1);
		return face;
	}
}
