package Q9;

import java.io.*;

public class Q9Test {
	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		fr = new FileReader("D:\\Java_Study\\javaProject\\java project\\객체지향17\\Q9\\Q9Test.java");
		int c=0, count = 1;
		System.out.print(count++ +"      ");
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
			if(c == '\n') {
				System.out.print(count++ + "   ");
			}
		}
		if(c=='\n') {
			fr.close();
		}
		System.out.println("출력 완료");
	}

}