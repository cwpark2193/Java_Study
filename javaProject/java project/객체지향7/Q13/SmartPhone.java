package Q13;

public class SmartPhone extends Phone{
	private String mobileOperatingSystem;
	private double mobileVirsion;
	private int hddsize;
	private boolean cameraonoff;
	private boolean bluetooth;
	public SmartPhone() {
		super(null, 0, null);
		this.mobileOperatingSystem = null;
		this.mobileVirsion = 0.0;
		this.hddsize = 0;
		this.cameraonoff = false;
		this.bluetooth = false;
	}
	public SmartPhone(String manufacturer, int price, String mobileservice, String mobileOperatingSystem,
			double mobileVirsion, int hddsize, boolean cameraonoff, boolean bluetooth) {
		super(manufacturer, price, mobileservice);
		this.mobileOperatingSystem = mobileOperatingSystem;
		this.mobileVirsion = mobileVirsion;
		this.hddsize = hddsize;
		this.cameraonoff = cameraonoff;
		this.bluetooth = bluetooth;
	}
	public String getMobileOperatingSystem() {
		return mobileOperatingSystem;
	}
	public void setMobileOperatingSystem(String mobileOperatingSystem) {
		this.mobileOperatingSystem = mobileOperatingSystem;
	}
	public double getMobileVirsion() {
		return mobileVirsion;
	}
	public void setMobileVirsion(double mobileVirsion) {
		this.mobileVirsion = mobileVirsion;
	}
	public int getHddsize() {
		return hddsize;
	}
	public void setHddsize(int hddsize) {
		this.hddsize = hddsize;
	}
	public boolean isCameraonoff() {
		if(cameraonoff==true) {
			System.out.println("ī�޶� ������");
		}
		else {
			System.out.println("ī�޶� �����ȵ�");
		}
		return cameraonoff;
	}
	public void setCameraonoff(boolean cameraonoff) {
		this.cameraonoff = cameraonoff;
	}
	public boolean isBluetooth() {
		if(bluetooth==true) {
			System.out.println("������� ������");
		}
		else {
			System.out.println("������� �����ȵ�");
		}
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	@Override
	public String toString() {
		return "SmartPhone [mobileOperatingSystem=" + mobileOperatingSystem + ", mobileVirsion=" + mobileVirsion
				+ ", hddsize=" + hddsize + ", cameraonoff=" + cameraonoff + ", bluetooth=" + bluetooth
				+ ", manufacturer=" + manufacturer + ", price=" + price + ", mobileservice=" + mobileservice + "]";
	}
	

}
