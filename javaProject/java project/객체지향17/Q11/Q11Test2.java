package Q11;

import java.io.*;

public class Q11Test2 {

	public static void main(String[] args) throws Exception {
		boolean compare = false;
		File file1 = new File("Q10-1.txt");
		File file2 = new File("Q10-2.txt");
		FileInputStream fis1 = new FileInputStream(file1);
		FileInputStream fis2 = new FileInputStream(file2);
		for (;;) {
			int data1 = fis1.read();
			int data2 = fis2.read();
			if (data1 == -1 && data2 == -1) {
				compare = true;
				break;
			} else if (data1 == -1 || data2 == -1) {
				compare = false;
				break;
			}
			if (data1 != data2) {
				compare = false;
				break;
			}
		}
		System.out.println(compare);
	}

}
