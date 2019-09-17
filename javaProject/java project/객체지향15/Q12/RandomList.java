package Q12;

import java.util.ArrayList;
import java.util.Iterator;

public class RandomList<T>{
	private ArrayList<T> list;
	
	public RandomList() {
		super();
		this.list = new ArrayList<T>();
	}

	public void add(T item){
//		-����Ʈ�� ������ ���Ҹ� �޾Ƽ� �߰��Ѵ�.
		list.add(item);
	}
	
	public T getObj() {
		int index=(int)(Math.random()*(list.size()));
		//������ �����ߵǰڱ���(����Ʈ �����ȿ� ������ ��ġ)
		//-����Ʈ���� ���õ� ��ġ���� ������߰ڱ���.
		return list.get(index);
	}
	public void iteratorPrint() {
		Iterator<T> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}