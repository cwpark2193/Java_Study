package 객체지향6;

public class MyMetric {
	private double kilometer;
	private double mile;
	public MyMetric() {
		this(0.0,0.0);
	}
	public MyMetric(double kilometer, double mile) {
		this.kilometer = kilometer;
		this.mile = mile;
	}
	public void kiloToMile() {
		mile=1.609*kilometer;
		System.out.println(kilometer+"의 마일변환 = "+mile);
	}
	public void mileToKilo() {
		kilometer=0.621*mile;
		System.out.println(mile+"의 km변환은 = "+kilometer);
	}
	public double getKilometer() {
		return kilometer;
	}
	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
	}
	public double getMile() {
		return mile;
	}
	public void setMile(double mile) {
		this.mile = mile;
	}
	@Override
	public String toString() {
		return "MyMetric [kilometer=" + kilometer + ", mile=" + mile + "]";
	}
	
}
