package chapter15.Box;

public class Box<T,U>{
	private T data;
	private U data2;

	public Box(T data,U data2) {
		super();
		this.data = data;
		this.data2 = data2;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public U getData2() {
		return data2;
	}
	public void setData2(U data2) {
		this.data2 = data2;
	}
	public static <T>T getLast(T[] a) {
		
		return a[a.length-1];
	}
	public static <T> void swap(T[] obj,int i , int j) {
		T temp = null;
		temp = obj[i];
		obj[i]=obj[j];
		obj[j]=temp;		
	}
	public static <T>void printArray(T[] obj) {
		for(T ob : obj ) {
			System.out.print(ob+" ");
		}
		System.out.println();
	}
	
}