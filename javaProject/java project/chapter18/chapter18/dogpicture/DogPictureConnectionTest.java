package chapter18.dogpicture;

import java.io.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class DogPictureConnectionTest {

	public static void main(String[] args) throws IOException {
		//가져오기 로직순서
		//1. File file=new File("index.html")
		URL url=new URL("http://static.hubzum.zumst.com/hubzum/2019/06/03/11/9f9cdba43f3d4197a7f1d35d3f91443d.jpg");
		//2. FileInputStream fs = new FileInputStream(file);
		//InputStream is =url.openStream();
		URLConnection uc=url.openConnection();
		InputStream is=uc.getInputStream();
		//3. InputStreamReader isr = new InputStreamReader(fs);
		//InputStreamReader isr = new InputStreamReader(is);
		//4. BufferedReader br = new BufferedReader(isr);
		BufferedInputStream bis = new BufferedInputStream(is);
		//저장하기 로직순서
		File file = new File("dog.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] bufer = new byte[1024];
		int size=0;
		while((size=bis.read(bufer))!=-1) {
			bos.write(bufer, 0, size);
		}
		if(bis!=null) {bis.close();}
		if(bos!=null) {bos.close();}
		System.out.println("이미지가 서버에서 로컬컴퓨터로 복사되었습니다.");
	}

}
