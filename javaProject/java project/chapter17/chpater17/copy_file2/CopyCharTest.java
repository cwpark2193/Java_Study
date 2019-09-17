package chpater17.copy_file2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr=new FileReader("input.txt");
			fw = new FileWriter("output2.txt");
		}catch (IOException e) {}
		int data=0;
		try {
			while((data=fr.read())!=-1) {
				fw.write(data);
			}
		} catch (IOException e) {}
		System.out.println("모두 완료되었습니다.");
		
		if(fr!= null) {
			try {
				fr.close();
			} catch (IOException e) {}
		}
		if(fw!= null) {
			try {
				fw.close();
			} catch (IOException e) {}
		}
	}//end of main

}
