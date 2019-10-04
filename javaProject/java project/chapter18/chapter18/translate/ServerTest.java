package chapter18.translate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ServerTest {
	private static Map<String, String> map=new HashMap<String, String>();
	
	public static void main(String[] args) {
		//������ �����ͺ��̽� Ȱ���� �� ����.
		map.put("�ڹ�","JAVA");
		map.put("����","ICE");
		map.put("�ڵ���","CAR");
		map.put("����","BISCET");
		map.put("��","MONEY");
		ServerSocket ss = null;
		System.out.println("���� ���� ����");
		try {
			ss = new ServerSocket(2200);
			while (true) {
				Socket socket;
				socket = ss.accept();
				Translator tl = new Translator(socket);
				tl.start();
			}
		} catch (IOException e) {
		} finally {
			try {
				System.out.println("���� ���� ����");
				ss.close();
			} catch (IOException e) {
			}
		}
	}//end of main

	public static class Translator extends Thread {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;

		public Translator(Socket socket) throws IOException {
			super();
			this.socket = socket;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);
		}

		@Override
		public void run() {
			//1. ������. (�޼����ּҹ�ȣ)
			pw.println(socket.getLocalPort() + " �ݰ����ϴ�. " + (socket.getLocalAddress().getHostAddress()) + "��");
			try {
//				Socket socket = null;
//				BufferedReader br=null;
//				PrintWriter pw=null;
				while (true) {
					//2. 5. 8.������(�޼���)
					pw.println("�ܾ �Է��ϼ���.");
					//3. 6. 9.�д´�.(�ܾ�)
					String data = br.readLine();
					if (data == null) {
						break;
					}
					Set<Entry<String,String>> set=map.entrySet();
					boolean find = false;
					for(Entry<String,String> entry:set) {
						String key=entry.getKey();
						if(key.equals(data)) {
							pw.println(data+" = "+entry.getValue()); find=true;
						}
					}//end of for
					if(!find) {System.out.println("���� �ܾ��Դϴ�.");}
				} // end of while
			} catch (IOException e) {
				System.out.println("�дµ� �����Դϴ�.");
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					System.out.println("�ݴµ� �����Դϴ�.");
				}
			}
			super.run();
		}
	}
}// end of allclass
