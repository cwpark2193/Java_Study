package Q18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Q18_2 {
	public static void main(String[] args) {
		//2. math.random() ����ϰ� (1~45 ���ڸ� ���Ѵ�.)
		//3. hashset contains() �޼ҵ带 �̿��϶�(���õ� �������� �˻�)
		HashSet<Integer> set  =new HashSet<Integer>();
		while(true) {
			int number = (int)(Math.random()*45+1);
			if(!set.contains(new Integer(number))) {
				set.add(new Integer(number));
			}
			if(set.size()==6) break;
		}
		//����ϱ�
		for(Integer inte:set) {
			System.out.println(inte);
		}
		System.out.println("======");
		//1.treeset���� convert
		TreeSet<Integer> tset=new TreeSet<Integer>(set);
		//2.set-> arraylist
		List<Integer> list =new ArrayList<Integer>(set);
		Collections.sort(list);
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}//end of main

}
