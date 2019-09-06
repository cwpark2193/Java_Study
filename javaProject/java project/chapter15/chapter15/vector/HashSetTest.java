package chapter15.vector;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		hs.add("aaaa");
		hs.add("bbbb");
		hs.add("cccc");
		hs.add("dddd");
		hs2.add("cccc");
		hs2.add("dddd");

		// ��¹��
		IteratorPrint(hs);
		IteratorPrint(hs2);
		System.out.println("������");
		hs.addAll(hs2);
		IteratorPrint(hs);
		System.out.println("������");
		HashSet<String> retain = new HashSet<String>(hs);
		retain.retainAll(hs2);
		IteratorPrint(hs);
		System.out.println("������");
		hs.remove(hs2);
		IteratorPrint(hs);
		
	}// end of main

	private static void IteratorPrint(HashSet<String> hs) {
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		;
		System.out.println("=========");
	}

}// end of class