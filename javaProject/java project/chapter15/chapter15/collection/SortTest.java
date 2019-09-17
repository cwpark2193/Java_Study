package chapter15.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// 1. 문자배열선언 4개
		String[] str = new String[] { "ggg", "bbb", "ccc", "ddd" };
		// 2. 배열을 ArrayList로 변경
		List<String> list = Arrays.asList(str);
		// 3. list iterator로 출력해보세요.
		iteratorFunction(list);
		// 4. List 정렬한다.
		Collections.sort(list);
		System.out.println("===정렬===");
		iteratorFunction(list);
		System.out.println("===배열정렬===");
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
