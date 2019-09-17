package chapter17.copyline;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyLineTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=null;
		FileWriter fw = null;
		InputStreamReader isr=null;
		
		fi=new FileInputStream("input.txt");
		isr=new InputStreamReader(fi);
		fw=new FileWriter("output4.txt");
		
		int data;
		while((data=isr.read())!=-1) {
			fw.write(data);
		}
		System.out.println("복사되었습니다.");
		if(fi!=null) {
			fi.close();
		}
		if(fw!=null) {
			fw.close();
		}
	}

}
