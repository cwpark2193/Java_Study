package chpater18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendTest {

	public static void main(String[] args) {
		//1. ����Ÿ�׷����� ����
		DatagramSocket dSocket = null;
		InetAddress ia=null;
		try {
			dSocket = new DatagramSocket(6000);
		} catch (SocketException e) {e.printStackTrace();}
		//2. ���� ������ �迭ȭ
		String data = new String("�츮�� ������ �츮 ����� �����̴�.");
		byte[] buf = data.getBytes();
		//3. �������� �ϴ� �ּ� ����
			try {
				ia= InetAddress.getByName("192.168.0.212");
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
		//4. ��Ŷ ����
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
