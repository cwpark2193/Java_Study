package chapter14.tricatch;

public class NumberEx {

	public static void main(String[] args) {
		int number=0;
		System.out.println("1. ���� ����մϴ�.");
		try {
			number=10/0; //��üũ����
		}catch (ArithmeticException e) {
			number=10/1;
		}finally {
			System.out.println("���α׷� ����");
		}
		System.out.println("2. ����� ����մϴ�.="+number);
	}

}