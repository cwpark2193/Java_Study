package chapter15.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vc = new Vector();
		MyClass mc = new MyClass(20);
		// 벡터에 삽입
		vc.add(new String("Hello"));
		vc.add(new Integer(50));
		vc.add(mc);
		vc.add(1, "Hellos");
		System.out.println(vc);

		// 요소 출력
		Iterator iter = vc.iterator();
		{
			while (iter.hasNext()) {
				Object obj = iter.next();
				if (obj instanceof MyClass) {
					MyClass mc1 = (MyClass) obj;
					System.out.println(mc1.num);
				} else {
					System.out.println(obj);
				}
			}
		}

		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		System.out.println("=====================");
		int j = 0;
		for (Object o : vc) {
			System.out.println((j++) + "=" + o);
		}

		// 요소 삭제
		System.out.println("요소 삭제");
		vc.remove(0);
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		// 요소 삭제2
		System.out.println("요소 삭제2");
		vc.remove(mc);
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}

	}

}
