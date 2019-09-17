package chapter17.copy_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=null;
		FileOutputStream fo = null;
		
		fi=new FileInputStream("cat.jpg");
		fo=new FileOutputStream("copy_cat.jpg");
		
		int data;
		while((data=fi.read())!=-1) {
			fo.write(data);
		}
		System.out.println("����̰� ����Ǿ����ϴ�.");
		if(fi!=null) {
			fi.close();
		}
		if(fo!=null) {
			fo.close();
		}
	}//end of main

}
