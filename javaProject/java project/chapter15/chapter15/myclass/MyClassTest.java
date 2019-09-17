package chapter15.myclass;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass<MyClass> mc1 = new MyClass<MyClass>(10, "고길동");
		MyClass<MyClass> mc2 = new MyClass<MyClass>(20, "고길동");
		
		int value = mc1.compareTo(mc2);
		
		switch(value) {
		case 1 : System.out.println(mc1+"이 더 큽니다.");	break;
		case -1 : System.out.println(mc2+"이 더 큽니다.");	break;
		case 0 : System.out.println("같습니단.");			break;
		default : System.out.println("외장 하드야 버텨줘!");	break;
		}
		MyClass[] mcArray = {new MyClass<MyClass>(10,"홍길동"),
				new MyClass<MyClass>(20,"고길동"),
				new MyClass<MyClass>(30,"저길동"),
				new MyClass<MyClass>(40,"가길동"),
				new MyClass<MyClass>(50,"구길동"),
				};
		MyClass largeT = MyArrayAlg.getMax(mcArray);
		System.out.println(largeT+"이 가장 큰 객체입니다.");
		
		String[] strArray = {new String("고길동"),new String("홍길동"),new String("구길동")};
		String largeString = MyArrayAlg.getMax(strArray);
		System.out.println(largeString+"이 가장 큰 객체입니다.");
	}

}
