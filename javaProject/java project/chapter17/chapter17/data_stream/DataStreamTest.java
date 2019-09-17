package chapter17.data_stream;

import java.io.*;


public class DataStreamTest {

	public static void main(String[] args) throws Exception {
		//������ �о���� Ŭ���� ����
		FileInputStream fis=null; BufferedInputStream bis=null;
		DataInputStream dis=null; File file =null;
		//���Ͽ� �����ϴ� Ŭ���� ����
		FileOutputStream fos=null; BufferedOutputStream bos=null;
		DataOutputStream dos=null; File file2=null;
		//======���Ͽ� �����ϴ� ���
		file2 = new File("data.bin");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		dos = new DataOutputStream(bos);
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("�ڽ��� ������ �ٲ��� ���ϴ� ����� ���� ������ �ٲ� �� ����.");
		dos.flush();
		if(dos!=null) {
			dos.close();
		}
		System.out.println("����Ǿ����ϴ�.");
		//======������ �о�´�.
		file = new File("data.bin");
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		//����. ��!!! ������ ������� �о�;� �Ѵ�.
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		if(dis!=null) {dis.close();}
	}

}
