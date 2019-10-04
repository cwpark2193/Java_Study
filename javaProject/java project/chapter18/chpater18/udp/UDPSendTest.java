package chpater18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest {

	public static void main(String[] args) {
		//1. 데이타그램소켓 생성
		DatagramSocket dSocket = null;
		InetAddress ia=null;
		try {
			dSocket = new DatagramSocket(6000);
		} catch (SocketException e) {e.printStackTrace();}
		//2. 보낼 데이터 배열화
		String data = new String("우리는 여전히 우리 운명의 주인이다.");
		byte[] buf = data.getBytes();
		//3. 보내고자 하는 주소 설정
			try {
				ia= InetAddress.getByName("192.168.0.212");
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
		//4. 패킷 생성
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 5000);
		try {
			dSocket.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {			
			dSocket.close();
		}

	}// end of main
}// end of allclass
