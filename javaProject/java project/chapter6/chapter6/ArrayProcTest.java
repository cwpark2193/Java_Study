package chapter6;

public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ��ü ����
		ArrayProc arrayproc = new ArrayProc(5,0,0.0);
		arrayproc.getValue();
		arrayproc.printArray();
		System.out.println("\n���հ��� ="+arrayproc.getSum() );
		System.out.println("��հ��� ="+arrayproc.getAverage());
	}

}
