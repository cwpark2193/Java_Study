package Q8;


public class Test {
 public static void main(String[] args) {
	 Job t = new Job("new thread");
	 Job t1 = new Job("another");
     t.start();
     t1.start();
 }
}
