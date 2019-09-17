package chapter15.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SearchTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//1. arraylist integer ����
		List<Integer> al = new ArrayList<Integer>();
		//2. ���������� 1~100 100���� �Է��ϼ���.
		for(int i=0;i<100;i++) {
			al.add((int)(Math.random()*100+1));
			System.out.print(al.get(i)+" ");
		}
		long start1=System.nanoTime();
		for(int i=0;i<100;i++) {
			if(al.get(i)==64) break;
		}
		System.out.println("");
		//3. ���Ľ�Ű��
		Collections.sort(al);
		for(Integer i:al) {
			System.out.print(i+" ");
		}
		long start = System.nanoTime();
		int index =  Collections.binarySearch(al, 64);
		long stop = System.nanoTime();		
		System.out.println("\n"+index+" "+(stop-start));
	}

}
