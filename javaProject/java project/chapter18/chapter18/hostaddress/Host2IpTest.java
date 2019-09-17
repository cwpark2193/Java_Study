package chapter18.hostaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2IpTest {

	public static void main(String[] args) throws UnknownHostException {
		String hostName = "www.naver.com";
		InetAddress inetAddress=InetAddress.getByName(hostName);
		System.out.println(hostName+" ÁÖ¼Ò´Â = "+inetAddress.getHostAddress());
	}

}
