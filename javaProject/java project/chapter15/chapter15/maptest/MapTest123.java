package chapter15.maptest;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest123 {

	public static void main(String[] args) {
		HashMap<String, Student> hash = new HashMap<String, Student>();
		hash.put("number 1", new Student(10, "10대 고길동"));
		hash.put("number 2", new Student(20, "20대 고길동"));
		hash.put("number 3", new Student(30, "30대 고길동"));
		System.out.println(hash);
		for (Entry<String, Student> sets : hash.entrySet()) {
			String str1 = sets.getKey();
			Student str2 = sets.getValue();

			System.out.println(str1 + " = " + str2);
		}
	}

}
