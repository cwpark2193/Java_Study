package P321family;

public class Child extends Parent{
	public void print() {
		super.print();
		System.out.println("자식 클래스의 print() 메소드");
	}
	public static void main(String[] args) {
		Child nc = new Child();
		nc.print();
	}
}
