package chapter15.vector;

public class MyClass {
	public int num;

	public MyClass(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"MyClass [num=" + this.num + "]";
	}
	
}