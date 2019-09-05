package °´Ã¼ÁöÇâ6;

public class Average {
	private int a;
	private int b;
	private int c;
	
	public Average() {
		this(0,0,0);
	}
	public Average(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}	
	public float getAverage(int a,int b) {
		return (a+b)/(float)2;
	}
	public double getAverage(int a,int b,int c) {
		return (a+b+c)/(double)3;
	}
	@Override
	public String toString() {
		return "Average [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
