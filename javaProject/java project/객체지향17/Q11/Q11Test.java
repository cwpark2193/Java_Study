package Q11;

import java.io.*;

public class Q11Test {
	public static void main(String[] args) throws Exception {
		// ����1 Ŭ���� �غ�
		FileReader fr1 = null; BufferedReader br1 = null;
		fr1 = new FileReader("Q10-1.txt");
		br1 = new BufferedReader(fr1);
		// ����2 Ŭ���� �غ�
		FileReader fr2 = null; BufferedReader br2 = null;
		fr2 = new FileReader("Q10-2.txt");
		br2 = new BufferedReader(fr2);
		String data=null,data2=null;
		while((data=br1.readLine())!=null) {
			data2=br2.readLine();
			if(data.equals(data2)) {
				System.out.println("�� ������ �����ϴ�.");
			}
			else {
				System.out.println("�� ������ �ٸ��ϴ�.");
			}
		}
		if(br1!=null) {br1.close();}
		if(br2!=null) {br2.close();}
	}//end of main

}
