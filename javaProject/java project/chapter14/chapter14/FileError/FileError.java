package chapter14.FileError;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	// 1. 멤버변수,상수,int[]
	private static final int SIZE;
	static {
		SIZE = 10;
	} // 정적 블록 초기값
	private int[] list; // =new int[SIZE]도 가능
	// 2.생성자

	public FileError() {
		super();
		this.list = new int[SIZE];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		try {
			writeList();
		} catch (ArrayIndexOutOfBoundsException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeList() throws ArrayIndexOutOfBoundsException,IOException{
		// 1. 자신이 만든 파일을 열어서 쓰겠다는 참조 변수다
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("outfile.txt"));
			for(int i=0;i<list.length;i++) {
				//System.out.println("배열원소 "+i+ "=" +list[i]);
				pw.println("배열원소 "+i+ "=" +list[i]);
			}
		}finally {
			
		}
	}
}
