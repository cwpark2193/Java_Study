package 객체지향18.Q10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPEchoClient {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		InetAddress ia = null;

		try {
			ds = new DatagramSocket(5000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UDP Echo Client start.");
		String data = new String("유디피형식 에코 클라이언트 시작합니다.");
		byte[] buf = data.getBytes();
		try {
			ia = InetAddress.getByName("192.168.0.212");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 6000);
		try {
			ds.send(dp);
		} catch (IOException e) {e.printStackTrace();}
		finally {ds.close();}
	}
}
