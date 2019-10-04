package chapter17.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DataTest {

	public static void main(String[] args) throws Exception {
		//직렬화
		File file = new File("Datatest.dat");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(new Data("홍길동", 19990922, "서울시 마포구"));
		list.add(new Data("고길동", 20001023, "서울시 동작구"));
		list.add(new Data("구길동", 20120504, "서울시 송파구"));
		list.add(new Data("김길동", 20150918, "서울시 강남구"));
		list.add(new Data("이길동", 19900827, "서울시 관악구"));
		
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		
		//역직렬
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
//			if(data.name.equals("홍길동")) {
//				System.out.println(data); find=true;
//			}
		}
		System.out.println("====================");
//		for(int i=0;i<list.size();i++) {
//			Data data=list.get(i);
//			if(data.name.equals("홍길동")) {
//				System.out.println(data); find=true; break;
//			}
//		}
		if(find==false) {System.out.println("그런 학생 없습니다.");}
		if(ois!=null) {ois.close();}
	}
}
