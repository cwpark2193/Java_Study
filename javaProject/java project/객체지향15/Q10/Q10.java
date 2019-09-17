package Q10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		List list = new ArrayList<Double>();
		list.add(1.52);	list.add(2.37);	list.add(3.64);	list.add(4.95);
		System.out.println("===Index===");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"="+list.get(i));
		}
		System.out.println("===for-each===");
		int j=0;
		for(Object str : list) {
			System.out.println((j++)+"="+str);
		}
		Iterator<Double> iter = list.iterator();
		System.out.println("===Iterator===");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
