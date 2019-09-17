package chapter17.charencoding;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharEncodingTest {

	public static void main(String[] args) throws Exception {
		//�Է��ϴ� Ŭ���� ����
		FileInputStream fis=null; InputStreamReader isr=null;
		BufferedReader br=null;	File file =null;
		//����ϴ� Ŭ���� ����
		FileOutputStream fos = null;	FileWriter fw = null;	OutputStreamWriter osw=null;
		BufferedOutputStream bos = null; File file2 = null;
		//�Է��۾�����
		file = new File("input.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);
		//����۾�����
		file2 = new File("output7.txt");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
			data+="\n";
			byte[] b = data.getBytes();
			bos.write(b);
		}
		System.out.println("�����߽��ϴ�.");
		if(br!=null) {br.close();}
		if(bos!=null) {bos.close();}
	}

}
