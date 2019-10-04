package °´Ã¼ÁöÇâ18.Q10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		
		try {
			ds = new DatagramSocket(6000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UDP Echo Client start.");
		
		byte[] buf = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		try {
			ds.receive(dp);
			System.out.println(new String(buf));
		} catch (IOException e) {e.printStackTrace();}
		finally {ds.close();}
	}
}
