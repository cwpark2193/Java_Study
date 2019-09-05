package chapter6;

public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. °´Ã¼ »ý¼º
		ArrayProc arrayproc = new ArrayProc(5,0,0.0);
		arrayproc.getValue();
		arrayproc.printArray();
		System.out.println("\nÃÑÇÕ°ªÀº ="+arrayproc.getSum() );
		System.out.println("Æã±Õ°ªÀº ="+arrayproc.getAverage());
	}

}
