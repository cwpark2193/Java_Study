package Q9;

public class Customer extends Person{
	private int customernumber;
	private double mileage;
	public Customer() {
		super();
		this.customernumber = 0;
		this.mileage = 0.0;
	}
	public Customer(String name) {
		super(name);
		this.customernumber = 0;
		this.mileage = 0.0;
	}
	public Customer(String name, String address) {
		super(name, address);
		this.customernumber = 0;
		this.mileage = 0.0;
	}
	public Customer(String name, String address, String phonenumber) {
		super(name, address, phonenumber);
		this.customernumber = 0;
		this.mileage = 0.0;
	}
	public Customer(String name, String address, String phonenumber,int customernumber) {
		super(name, address, phonenumber);
		this.customernumber = customernumber;
		this.mileage = 0.0;
	}
	public Customer(String name, String address, String phonenumber,int customernumber,double mileage) {
		super(name, address, phonenumber);
		this.customernumber = customernumber;
		this.mileage = mileage;
	}
	public int getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Customer [customernumber=" + customernumber + ", mileage=" + mileage + "]";
	}
}
