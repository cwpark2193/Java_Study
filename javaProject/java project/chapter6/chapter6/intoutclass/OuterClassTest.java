package chapter6.intoutclass;

import chapter6.intoutclass.OuterClass.StaticClass;

public class OuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
		StaticClass.staticMyMethod();
		
		OuterClass outer = new OuterClass()
;
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMyMethod();
	}

}
