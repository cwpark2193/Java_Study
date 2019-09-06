package chapter15.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String str1 = new String("크크");
		//삽입
		al.add("하");
		al.add("히");
		al.add("후");
		al.add("헤");
		al.add("호");
		al.add(str1);
		//삽입
		al.add(2, "켈켈");
		//제거
		al.remove("후");
		//출력
		int j=0;
		for(Object str : al) {
			System.out.println((j++)+"="+str);
		}
		System.out.println("\n========");
		for(int i=0;i<al.size();i++) {
			System.out.println(i+"="+al.get(i));
		}
		System.out.println("iterator======");
		//1.반복자 처리
		Iterator<String> iter=al.iterator();
		//2.반복자 내용 유무 확인
		while(iter.hasNext()) {
			//3.반복자 내용을 가져온다.
			String str = iter.next();
			System.out.println(str);
		}
	}

}
