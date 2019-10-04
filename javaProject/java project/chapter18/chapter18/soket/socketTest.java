package chapter18.soket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class socketTest {

	public static void main(String[] args) throws Exception {
		Socket soket = new Socket("time-c.nist.gov",13);
		InputStream is = soket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		if(br!=null)br.close();
		System.out.println("거지같네 진짜");
	}

}
