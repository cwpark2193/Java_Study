package Q11;

import java.io.*;

public class Q11Test {
	public static void main(String[] args) throws Exception {
		// 파일1 클래스 준비
		FileReader fr1 = null; BufferedReader br1 = null;
		fr1 = new FileReader("Q10-1.txt");
		br1 = new BufferedReader(fr1);
		// 파일2 클래스 준비
		FileReader fr2 = null; BufferedReader br2 = null;
		fr2 = new FileReader("Q10-2.txt");
		br2 = new BufferedReader(fr2);
		String data=null,data2=null;
		while((data=br1.readLine())!=null) {
			data2=br2.readLine();
			if(data.equals(data2)) {
				System.out.println("두 파일이 같습니다.");
			}
			else {
				System.out.println("두 파일이 다릅니다.");
			}
		}
		if(br1!=null) {br1.close();}
		if(br2!=null) {br2.close();}
	}//end of main

}
