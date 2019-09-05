package Q13;

public class Phone {
	public String manufacturer;
	public int price;
	public String mobileservice;
	public Phone(String manufacturer, int price, String mobileservice) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.mobileservice = mobileservice;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMobileservice() {
		return mobileservice;
	}
	public void setMobileservice(String mobileservice) {
		this.mobileservice = mobileservice;
	}
	@Override
	public String toString() {
		return "Phone [manufacturer=" + manufacturer + ", price=" + price + ", mobileservice=" + mobileservice + "]";
	}
	
}
