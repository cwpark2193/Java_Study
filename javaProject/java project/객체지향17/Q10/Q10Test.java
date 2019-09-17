package Q10;

import java.io.*;

public class Q10Test {

	public static void main(String[] args) throws IOException {
		//파일1 클래스 준비
		FileReader fr1 = null; BufferedReader br1=null;
		fr1 = new FileReader("Q10-1.txt");
		br1 = new BufferedReader(fr1);
		//파일2 클래스 준비
		FileReader fr2 = null; BufferedReader br2=null;
		fr2 = new FileReader("Q10-2.txt");
		br2 = new BufferedReader(fr2);
		//출력클래스 준비
		FileWriter fw=null; BufferedWriter bw=null;
		fw = new FileWriter("Q10OUT.txt");
		bw = new BufferedWriter(fw);
		for(;;) {
			String line = br1.readLine();
			if(line==null) {break;}
			bw.write(line);
			String line2 = br2.readLine();
			if(line2==null) {break;}
			bw.write(line2);
		}
		bw.flush();
		if(fr1!=null) {fr1.close();}
		if(fr2!=null) {fr2.close();}
		if(fw!=null) {fw.close();}
	}

}
