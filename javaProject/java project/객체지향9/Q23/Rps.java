package Q23;

public class Rps {
	private int rpsnumber;
	public Rps(int rpsnumber) {
		this.rpsnumber = rpsnumber;
	}
	public int getRpsnumber() {
		return rpsnumber;
	}
	public void setRpsnumber(int rpsnumber) {
		this.rpsnumber = rpsnumber;
	}
	@Override
	public String toString() {
		return "Rps [rpsnumber=" + rpsnumber + "]";
	}
	public int compareTo(Object obj) {
		Rps rps = null;
		int returnValue = 0;
		if (obj instanceof Rps) {
			rps = (Rps) obj;
			if (this.rpsnumber > rps.rpsnumber) {
				returnValue = 1;
			} else if (this.rpsnumber < rps.rpsnumber) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}
		}
		return returnValue;
	}
}
