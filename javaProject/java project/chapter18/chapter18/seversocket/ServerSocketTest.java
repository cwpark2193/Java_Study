package chapter18.seversocket;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerSocketTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		while(true){
			//클라이언트의 접속 대기
			//접속해오면 클라이언트 소켓 생성
			System.out.println("클라이언트 접속 대기");
			Socket socket=ss.accept();
			OutputStream os = socket.getOutputStream();
			PrintStream ps = new PrintStream(os);
			ps.println(new Date().toString());
			ps.close();
			break;
		}
		ss.close();
	}

}
