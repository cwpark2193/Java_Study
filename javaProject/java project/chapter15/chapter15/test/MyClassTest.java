package chapter15.test;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass[] mcArray = { new MyClass<MyClass>(10, "���浿"), 
				new MyClass<MyClass>(30, "��浿"),
				new MyClass<MyClass>(20, "ȫ�浿") };
		
		int returnValue1=mcArray[0].compareTo(mcArray[1]);
		match(returnValue1);
		int returnValue2=mcArray[1].compareTo(mcArray[2]);
		match(returnValue2);
		int returnValue3=mcArray[0].compareTo(mcArray[2]);
		match(returnValue3);
		
		MyClass largeT = MyMethod.getMax(mcArray);
		System.out.println(largeT + "�� ���� ū ��ü�Դϴ�.");

	}
	public static void match(int returnValue) {
		switch(returnValue) {
		case 1 : System.out.println("1���� Ů�ϴ�.");	break;
		case -1 : System.out.println("2���� Ů�ϴ�.");	break;
		case 0 : System.out.println("���� �����ϴ�.");	break;
		default : System.out.println("�̻��մϴ�.");	break;
		}
	}

}
