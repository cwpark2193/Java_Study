package °´Ã¼ÁöÇâ18.Q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public final static int portNumber=5000;
	public static void main(String[] args) {
		ServerSocket ss;
		InetAddress ia;
		BufferedReader br;
		PrintWriter pw;
		Socket socket;
		
		System.out.println("EchoServer Loading...");
		try {
			ss = new ServerSocket(portNumber);
			socket = ss.accept();
			pw = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		String data=null;
		while(true) {
			data = br.readLine();
			if(data.equalsIgnoreCase("Quit")) break;
			System.out.println("Cliten : " + data);
			pw.println(data);
		}
		System.out.println("EchoServer TurnOff...");
		if(br!=null) {br.close();}
		if(pw!=null) {pw.close();}
		if(socket!=null) {socket.close();}
		if(ss!=null) {ss.close();}
		} catch (IOException e) {e.printStackTrace();}
	}

}
