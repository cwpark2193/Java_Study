package chapter5;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Box box = new Box();
	      System.out.println("width" + box.getwidth());
	      System.out.println("length" + box.getlength());
	      System.out.println("height" + box.getheight());
	      
	      box.setwidth(10);
	      box.setlength(20);
	      box.setheight(30);
	      
	      System.out.println("width" + box.getwidth());
	      System.out.println("length" + box.getlength());
	      System.out.println("height" + box.getheight());
	      System.out.println("valume"+box.boxValume());

	}

}
