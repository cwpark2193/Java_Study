package chapter5.numberbox;

public class NumberBox {
	private int ivalue;
	private float fvalue;
	public NumberBox(int ivalue, float fvalue) {
		this.ivalue=ivalue;
		this.fvalue=fvalue;
	}
	public int getIvalue() {
		return ivalue;
	}
	public void setIvalue(int ivalue) {
		this.ivalue = ivalue;
	}
	public float getFvalue() {
		return fvalue;
	}
	public void setFvalue(float fvalue) {
		this.fvalue = fvalue;
	}
	public float multiFunction() {
		return ivalue*fvalue;
	}
	public void printNumberBox() {
		System.out.println(this.ivalue+","+this.fvalue);
	}
}
