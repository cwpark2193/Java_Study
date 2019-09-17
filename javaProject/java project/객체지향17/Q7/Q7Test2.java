package Q7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q7Test2 {

	public static void main(String[] args) throws IOException {
		ArrayList<Double> al= new ArrayList<Double>();
		File file = null; FileReader fr=null; BufferedReader br=null;
		file = new File("Q7DATA.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String data=null;
		while((data=br.readLine())!=null) {
			//System.out.println(data);
			al.add(Double.parseDouble(data));
			//문자열을 숫자로 
		}
		Iterator<Double> iter = al.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collections.sort(al);
		for(Double inte : al) {
			System.out.println(inte);
		}
		//파일에 저장하는 기능구현
		File file2 = null; FileWriter fw=null; BufferedWriter bw=null; PrintWriter pw=null;
		file2 = new File("Output8.txt");
		fw = new FileWriter(file2);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		for(Double inte : al) {
			pw.print(inte);
			pw.println(inte);
		}
		if(br!=null) {br.close();}
		if(pw!=null) {pw.close();}
	}
		

}
