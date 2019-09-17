package chapter17.data_stream;

import java.io.*;


public class DataStreamTest {

	public static void main(String[] args) throws Exception {
		//파일을 읽어오는 클래스 정의
		FileInputStream fis=null; BufferedInputStream bis=null;
		DataInputStream dis=null; File file =null;
		//파일에 저장하는 클래스 정의
		FileOutputStream fos=null; BufferedOutputStream bos=null;
		DataOutputStream dos=null; File file2=null;
		//======파일에 저장하는 기능
		file2 = new File("data.bin");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		dos = new DataOutputStream(bos);
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
		dos.flush();
		if(dos!=null) {
			dos.close();
		}
		System.out.println("종료되었습니다.");
		//======파일을 읽어온다.
		file = new File("data.bin");
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		//주의. 꼭!!! 쓰여진 순서대로 읽어와야 한다.
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		if(dis!=null) {dis.close();}
	}

}
