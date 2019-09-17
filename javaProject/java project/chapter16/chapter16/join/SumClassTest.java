package chapter16.join;

public class SumClassTest {

	public static void main(String[] args) throws InterruptedException {
		//1. ���� ��ü ����
		Data d1 = new Data();
		System.out.println("1~100�հ� = "+d1.getSum());
		//2. ������ SumClass ��ü�� �����.
		Thread t1 = new SumClass(d1);
		t1.start();
		System.out.println("waiting....");
		t1.join();	//SumClass �����尡 ������ ���� �����尡 �۵��� �ȴ�.
		//main������� �Ͻ����� ���·� ������.
		System.out.println("1~100�հ� = "+d1.getSum());
	}

}
