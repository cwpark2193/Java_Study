package chapter14.FileError;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	// 1. �������,���,int[]
	private static final int SIZE;
	static {
		SIZE = 10;
	} // ���� ��� �ʱⰪ
	private int[] list; // =new int[SIZE]�� ����
	// 2.������

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
		// 1. �ڽ��� ���� ������ ��� ���ڴٴ� ���� ������
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("outfile.txt"));
			for(int i=0;i<list.length;i++) {
				//System.out.println("�迭���� "+i+ "=" +list[i]);
				pw.println("�迭���� "+i+ "=" +list[i]);
			}
		}finally {
			
		}
	}
}
