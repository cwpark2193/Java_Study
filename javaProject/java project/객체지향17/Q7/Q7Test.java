package Q7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Q7Test {

	public static void main(String[] args) throws Exception {
		FileReader fr=null; BufferedReader br=null; File file=null;
		FileWriter fw=null; BufferedWriter bw=null; File file2=null;
		ArrayList<Double> al = new ArrayList<Double>();
		ArrayList<Double> al2 = new ArrayList<Double>();
		//입출력작업진행
		file = new File("Q7DATA.txt");
		fr=new FileReader(file);
		br = new BufferedReader(fr);
		file2 = new File("Q7DATAOUT");
		fw=new FileWriter(file2);
		bw = new BufferedWriter(fw);
		System.out.println("완료");
		//리스트에 추가 및 정렬
		String data=null;
		Double i=0.0;
		while((data=br.readLine())!=null) {
			System.out.println(data);
			i = Double.parseDouble(data); 
			al.add(i);
		}
		Collections.sort(al);
		for(Double a :  al) {
			System.out.println(al);
		}
		//정렬
		if (br != null) { br.close(); } 
		if (bw != null) { bw.close(); }
	}//end of main

}
