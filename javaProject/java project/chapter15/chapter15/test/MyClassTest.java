package chapter15.test;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass[] mcArray = { new MyClass<MyClass>(10, "구길동"), 
				new MyClass<MyClass>(30, "고길동"),
				new MyClass<MyClass>(20, "홍길동") };
		
		int returnValue1=mcArray[0].compareTo(mcArray[1]);
		match(returnValue1);
		int returnValue2=mcArray[1].compareTo(mcArray[2]);
		match(returnValue2);
		int returnValue3=mcArray[0].compareTo(mcArray[2]);
		match(returnValue3);
		
		MyClass largeT = MyMethod.getMax(mcArray);
		System.out.println(largeT + "이 가장 큰 객체입니다.");

	}
	public static void match(int returnValue) {
		switch(returnValue) {
		case 1 : System.out.println("1번이 큽니다.");	break;
		case -1 : System.out.println("2번이 큽니다.");	break;
		case 0 : System.out.println("둘이 같습니다.");	break;
		default : System.out.println("이상합니다.");	break;
		}
	}

}
