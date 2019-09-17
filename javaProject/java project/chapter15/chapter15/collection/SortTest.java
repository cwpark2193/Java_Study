package chapter15.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// 1. ���ڹ迭���� 4��
		String[] str = new String[] { "ggg", "bbb", "ccc", "ddd" };
		// 2. �迭�� ArrayList�� ����
		List<String> list = Arrays.asList(str);
		// 3. list iterator�� ����غ�����.
		iteratorFunction(list);
		// 4. List �����Ѵ�.
		Collections.sort(list);
		System.out.println("===����===");
		iteratorFunction(list);
		System.out.println("===�迭����===");
		str=(String[])(list.toArray());
		for(String s:str) {
			System.out.println(s);
		}
	}

	private static void iteratorFunction(List<String> list) {
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
