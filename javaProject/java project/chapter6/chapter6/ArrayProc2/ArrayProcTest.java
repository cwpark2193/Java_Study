package chapter6.ArrayProc2;

public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProc arraypro = new ArrayProc(20,0,0.0,0,0);
		System.out.println(arraypro);
		arraypro.getValue();
		System.out.println("���հ��� = "+arraypro.getSum());
		System.out.println("��հ��� = "+arraypro.getAverage());
		System.out.println("��հ��� = "+arraypro.getMax());
		System.out.println("��հ��� = "+arraypro.getMin());
		System.out.println(arraypro);
	}

}
