package 객체지향18.Q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	public final static int portNumber=5000;
	public static void main(String[] args) {
		BufferedReader br;
		BufferedReader br1;
		PrintWriter pw;
		Socket socket;
		
		try {
			socket = new Socket("192.168.0.212", portNumber);
			pw = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br1= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client connecting...");
			
			String data=null;
			while(true) {
				System.out.print("입력하세요. : ");
				data = br1.readLine();
				pw.println(data);
				if(data.equalsIgnoreCase("Quit")) break;
				System.out.println("Server : " + br.readLine());
			}
			System.out.println("Client TurnOff...");
			if(br!=null) {br.close();}
			if(pw!=null) {pw.close();}
			if(socket!=null) {socket.close();}
		} catch (IOException e) {e.printStackTrace();}
	}

}
