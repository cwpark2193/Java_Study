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
//		-리스트에 아이템 원소를 받아서 추가한다.
		list.add(item);
	}
	
	public T getObj() {
		int index=(int)(Math.random()*(list.size()));
		//랜덤을 돌려야되겠구나(리스트 영역안에 들어오는 위치)
		//-리스트에서 선택된 위치값을 돌려줘야겠구나.
		return list.get(index);
	}
	public void iteratorPrint() {
		Iterator<T> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}