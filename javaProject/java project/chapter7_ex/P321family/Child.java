package P321family;

public class Child extends Parent{
	public void print() {
		super.print();
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}
	public static void main(String[] args) {
		Child nc = new Child();
		nc.print();
	}
}
