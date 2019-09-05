package P325test;
class Base{
	public Base() {
		System.out.println("Base() 持失切");
	}
}
class Derived extends Base{
	public Derived() {
		System.out.println("Derived() 持失切");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived r = new Derived();
				
	}

}
