package °´Ã¼ÁöÇâ5;

public class Q13 {
	private int number1;
	private int number2;
	private double number3;
	private double number4;
	public Q13() {
		number1=0;
		number2=0;
		number3=0.0;
		number4=0.0;
	}
	public Q13(int number1,int number2,double number3,double number4) {
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
		this.number4=number4;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public double getNumber3() {
		return number3;
	}
	public void setNumber3(double number3) {
		this.number3 = number3;
	}
	public double getNumber4() {
		return number4;
	}
	public void setNumber4(double number4) {
		this.number4 = number4;
	}
	public int sum(int number1,int number2) {
		this.number1 += number1; this.number2 += number2;
		return this.number1+this.number2;
	}
	public double sum(double number3,double number4) {
		this.number3 += number3; this.number4 += number4;
		return this.number3+this.number4;
	}
	@Override
	public String toString() {
		return "Q13 [number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + ", number4=" + number4
				+ "]";
	}
	
}
