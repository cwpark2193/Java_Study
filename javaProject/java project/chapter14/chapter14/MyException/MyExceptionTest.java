package chapter14.MyException;

import java.lang.reflect.Method;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			Method1();
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}

	private static void Method1() throws MyException{
		throw new MyException("���~!");
	}

}
