package chapter17.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DataTest {

	public static void main(String[] args) throws Exception {
		//����ȭ
		File file = new File("Datatest.dat");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(new Data("ȫ�浿", 19990922, "����� ������"));
		list.add(new Data("��浿", 20001023, "����� ���۱�"));
		list.add(new Data("���浿", 20120504, "����� ���ı�"));
		list.add(new Data("��浿", 20150918, "����� ������"));
		list.add(new Data("�̱浿", 19900827, "����� ���Ǳ�"));
		
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		
		//������
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		//ArrayList<Data> list2 = (ArrayList<Data>)ois.readObject();
		Iterator<Data> iter = list.iterator();
		boolean find = false;
		while(iter.hasNext()) {
//			Data data=iter.next();
//			System.out.println(data);
			System.out.println(iter.next());
//			if(data.name.equals("ȫ�浿")) {
//				System.out.println(data); find=true;
//			}
		}
		System.out.println("====================");
//		for(int i=0;i<list.size();i++) {
//			Data data=list.get(i);
//			if(data.name.equals("ȫ�浿")) {
//				System.out.println(data); find=true; break;
//			}
//		}
		if(find==false) {System.out.println("�׷� �л� �����ϴ�.");}
		if(ois!=null) {ois.close();}
	}
}
