package chpater18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveTest {

	public static void main(String[] args) {
		// 1. 데이타그램소켓 생성
		DatagramSocket dSocket = null;
		try {
			dSocket = new DatagramSocket(5000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		// 2. 보낼 데이터 배열화
		byte[] buf = new byte[1024];
		// 3. 보내고자 하는 주소 설정
		
		// 4. 패킷 생성
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		try {
			dSocket.receive(dp);
			System.out.println(new String(buf));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			dSocket.close();
		}

	}

}
