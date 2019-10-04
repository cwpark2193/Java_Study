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
		//본래는 데이터베이스 활용이 더 좋다.
		map.put("자바","JAVA");
		map.put("얼음","ICE");
		map.put("자동차","CAR");
		map.put("과자","BISCET");
		map.put("돈","MONEY");
		ServerSocket ss = null;
		System.out.println("서버 가동 시작");
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
				System.out.println("서버 가동 종료");
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
			//1. 보낸다. (메세지주소번호)
			pw.println(socket.getLocalPort() + " 반갑습니다. " + (socket.getLocalAddress().getHostAddress()) + "님");
			try {
//				Socket socket = null;
//				BufferedReader br=null;
//				PrintWriter pw=null;
				while (true) {
					//2. 5. 8.보낸다(메세지)
					pw.println("단어를 입력하세요.");
					//3. 6. 9.읽는다.(단어)
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
					if(!find) {System.out.println("없는 단어입니다.");}
				} // end of while
			} catch (IOException e) {
				System.out.println("읽는데 오류입니다.");
			} finally {
				try {
					socket.close();
					br.close();
					pw.close();
				} catch (IOException e) {
					System.out.println("닫는데 오류입니다.");
				}
			}
			super.run();
		}
	}
}// end of allclass
