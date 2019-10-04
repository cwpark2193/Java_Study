package chapter17.newtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import chapter17.test.Data;

public class DataTest {

	public static void main(String[] args) throws Exception {
		//직렬화
		File file = new File("student.dat");
		FileOutputStream fos= new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		ArrayList<Data> list = new ArrayList<Data>();
		//추가
//		list.add(new Data1("고길동", "1962-09-29", "서울시 관악구"));
//		list.add(new Data1("구길동", "1992-07-23", "서울시 동작구"));
//		list.add(new Data1("홍길동", "2012-03-31", "서울시 서초구"));
//		list.add(new Data1("이길동", "2008-11-25", "서울시 강남구"));
		
		oos.writeObject(list);
		if(oos!=null) {oos.close();}
		//역직렬화
		FileInputStream fis= new FileInputStream(file);
		BufferedInputStream bis= new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		//출력
		boolean find = false;
		Iterator<Data> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		for(int i=0;i<list.size();i++) {
			Data data=list.get(i);
			if(data.name.equals("홍길동")) {
				System.out.println(data); find=true; break;
			}
		}
		if(find == false) {System.out.println("안됬습니다.");}
		if(ois!=null) {ois.close();}
	}//end of main

}
