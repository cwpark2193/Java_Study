package chapter18.url;

import java.io.IOException;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URILConnection {

	public static void main(String[] args) throws IOException {
		//1. File file=new File("index.html")
		URL url=new URL("http://www.google.com:80/index.html");
		//2. FileInputStream fs = new FileInputStream(file);
		InputStream is =url.openStream();
//		URLConnection uc=url.openConnection();
//		InputStream is=uc.getInputStream();
		//3. InputStreamReader isr = new InputStreamReader(fs);
		InputStreamReader isr = new InputStreamReader(is);
		//4. BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(isr);
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		if(br!=null) {br.close();}
	}

}
