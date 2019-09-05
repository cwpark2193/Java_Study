package ��ü����6;

public class Plane {
	//1. �ʵ�����
	private String madecompany;
	private String name;
	private int maxcustomer;
	private static int planes;
	//2.������ �������ۼ�
	public String getMadecompany() {
		return madecompany;
	}
	public void setMadecompany(String madecompany) {
		this.madecompany = madecompany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxcustomer() {
		return maxcustomer;
	}
	public void setMaxcustomer(int maxcustomer) {
		this.maxcustomer = maxcustomer;
	}
	//3.������ �ߺ� ����
	public Plane() {
		this(null,null,0);
	}
	public Plane(String madecompany) {
		this.madecompany = madecompany;
		this.name = null;
		this.maxcustomer = 0;
	}
	public Plane(String madecompany, String name) {
		this.madecompany = madecompany;
		this.name = name;
		this.maxcustomer = 0;
	}
	public Plane(String madecompany, String name, int maxcustomer) {
		this.madecompany = madecompany;
		this.name = name;
		this.maxcustomer = maxcustomer;
		planes++;
	}
	public static int getPlanes() {
		return planes;
	}
	@Override
	public String toString() {
		return "Plane [madecompany=" + madecompany + ", name=" + name + ", maxcustomer=" + maxcustomer + "]";
	}
	
}
