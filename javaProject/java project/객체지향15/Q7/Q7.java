package Q7;

public class Q7 {
	public static <T> void swap(T[] obj,int i , int j) {
		T temp = null;
		temp = obj[i];
		obj[i]=obj[j];
		obj[j]=temp;		
	}
}
