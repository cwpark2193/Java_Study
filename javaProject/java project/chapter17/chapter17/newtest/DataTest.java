package chapter17.newtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import chapter17.test.Data;

public class DataTest {

	public static void main(String[] args) throws Exception {
		//����ȭ
		File file = new File("student.dat");
		FileOutputStream fos= new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		ArrayList<Data> list = new ArrayList<Data>();
		//�߰�
//		list.add(new Data1("��浿", "1962-09-29", "����� ���Ǳ�"));
//		list.add(new Data1("���浿", "1992-07-23", "����� ���۱�"));
//		list.add(new Data1("ȫ�浿", "2012-03-31", "����� ���ʱ�"));
//		list.add(new Data1("�̱浿", "2008-11-25", "����� ������"));
		
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		//������ȭ
		FileInputStream fis= new FileInputStream(file);
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		//���
		boolean find = false;
		Iterator<Data> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		for(int i=0;i<list.size();i++) {
			Data data=list.get(i);
			if(data.name.equals("ȫ�浿")) {
				System.out.println(data); find=true; break;
			}
		}
		if(find == false) {System.out.println("�ȉ���ϴ�.");}
		if(ois!=null) {ois.close();}
	}//end of main

}
