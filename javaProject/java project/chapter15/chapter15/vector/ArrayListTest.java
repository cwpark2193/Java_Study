package chapter15.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String str1 = new String("ũũ");
		//����
		al.add("��");
		al.add("��");
		al.add("��");
		al.add("��");
		al.add("ȣ");
		al.add(str1);
		//����
		al.add(2, "����");
		//����
		al.remove("��");
		//���
		int j=0;
		for(Object str : al) {
			System.out.println((j++)+"="+str);
		}
		System.out.println("\n========");
		for(int i=0;i<al.size();i++) {
			System.out.println(i+"="+al.get(i));
		}
		System.out.println("iterator======");
		//1.�ݺ��� ó��
		Iterator<String> iter=al.iterator();
		//2.�ݺ��� ���� ���� Ȯ��
		while(iter.hasNext()) {
			//3.�ݺ��� ������ �����´�.
			String str = iter.next();
			System.out.println(str);
		}
	}

}