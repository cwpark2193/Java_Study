package chapter15.vector;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<String, Student>();

		hashMap.put("number 1", new Student(1, "ȫ�浿"));
		hashMap.put("number 2", new Student(2, "���浿"));
		hashMap.put("number 3", new Student(3, "���浿"));

		System.out.println(hashMap);
		//����
		hashMap.remove("number 1");
		System.out.println(hashMap);
		//��ü
		hashMap.put("3",new Student(3, "������"));
		System.out.println(hashMap);
		//���� for�� (���� set���� �ٲپ �׾��� �����͸� ������ ��.)
		//hashMap.entrySet() ->���� Set<Entry<String,Student>>���� �ٲ۴�
		for(Entry<String,Student> set :hashMap.entrySet()) {
			String str=set.getKey();
			Student str2=set.getValue();
			System.out.println(str+" = "+str2);
		}
		

	}
}