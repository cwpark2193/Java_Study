package chapter18.seversocket;

import java.io.*;
import java.net.Socket;

public class ClientSocketTest {

	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("192.168.0.230",9100);
		InputStream is =socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		BufferedOutputStream bis=new BufferedOutputStream(os);
		PrintStream ps = new PrintStream(os);
		ps.println("");
		ps.flush();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("서버 답변 대기");
		String data = br.readLine(); //블럭상태
		System.out.println(data);
		br.close();
	}

}
