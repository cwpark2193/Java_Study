package chpater14.example;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleTest {

	public static void main(String[] args) throws NegativeArraySizeException {
		System.out.println("1try");
		aaa();
		System.out.println("2try");

	}// end of main

	public static void aaa() throws IOException {

		PrintWriter pw = null;
		pw = new PrintWriter(new FilterWriter("outfile.txt"));

		System.out.println("3try");
		int[] array = new int[-10];
		System.out.println("3try");
	}
}