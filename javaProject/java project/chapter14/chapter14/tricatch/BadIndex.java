package chapter14.tricatch;

import javax.management.RuntimeErrorException;

public class BadIndex {
	public static final int SIZE = 10;

	public static void main(String[] args) throws RuntimeException {
		int[] array = new int[SIZE];
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		testprint();
		try {
			result = array[12];
			System.out.println("1. ���α׷� ���� ���Դϴ�.");
		} catch (ArrayIndexOutOfBoundsException a) {
			result = array[9];
			System.out.println("2. �� ������(�ӾҾ��.). ����� �����߽��ϴ�.(�����߽��ϴ�.) ������� " + result);

		} finally {
			System.out.println("3. ���α׷� ������ �������ϴ�.");
		}
		System.out.println("4. ���� �� ������ ������ �ɱ��?" + result);
	}

	private static void testprint() throws RuntimeException{
		System.out.println("11. �Լ� ����");
		int number=0;
		try{
			number=10/0;			
		}catch(ArithmeticException c) {
			System.out.println("12. ���α׷� �����Դϴ�.");
			throw new RuntimeException();
		}
		System.out.println("13. ���� ����ϴ�."+number);
		System.out.println("14. ���α׷� ����");
	}

}