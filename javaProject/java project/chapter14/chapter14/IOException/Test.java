package chapter14.IOException;

import java.io.IOException;

public class Test {
	public static final int SIZE = 100;
	public static void main(String[] args) throws IOException{
			System.out.println(readSting());
	}

	public static String readSting() throws IOException{
		byte[] buf = new byte[SIZE];
		System.out.println("문자열을 입력하시오.");
		//System.in.read(buf);
		throw new IOException();
		//return new String(buf);
	}

}
