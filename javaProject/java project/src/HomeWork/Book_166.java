package HomeWork;

public class Book_166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자들의 합 = "+sum(new int [] {1,2,3,4,5,6}));
	}
	public static int sum(int[] numbers) {
		int result=0;
		for(int i=0;i< numbers.length;i++) {
			result+=numbers[i];
		}
		return result;
	}
}
