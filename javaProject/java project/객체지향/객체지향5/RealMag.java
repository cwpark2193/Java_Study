package °´Ã¼ÁöÇâ5;

public class RealMag {
	private int real;
	private int imag;
	public RealMag() {
		real=0;
		imag=0;
	}
	public RealMag(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public void printrealimag() {
		System.out.println(getReal()+"+"+getImag()+"*i");
	}
	@Override
	public String toString() {
		return "RealMag [real=" + real + ", imag=" + imag + "]";
	}
	
}
