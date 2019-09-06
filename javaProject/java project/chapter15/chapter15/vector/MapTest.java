package chapter15.vector;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();

		hashMap.put("number 1", new Student(1, "홍길동"));
		hashMap.put("number 2", new Student(2, "고길동"));
		hashMap.put("number 3", new Student(3, "구길동"));

		System.out.println(hashMap);
		//제거
		hashMap.remove("number 1");
		System.out.println(hashMap);
		//대체
		hashMap.put("3",new Student(3, "소이정"));
		System.out.println(hashMap);
		//향상된 for문 (맵을 set으로 바꾸어서 그안의 데이터를 가져온 것.)
		//hashMap.entrySet() ->맵을 Set<Entry<String,Student>>으로 바꾼다
		for(Entry<String,Student> set :hashMap.entrySet()) {
			String str=set.getKey();
			Student str2=set.getValue();
			System.out.println(str+" = "+str2);
		}
		

	}
}
