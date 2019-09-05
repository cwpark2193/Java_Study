package 객체지향14;

public class Q15Test {
	public static final int SIZE = 10;

	public static void searchArray(int number) throws NotFoundExecption {
		int[] iArray = new int[SIZE];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);
		}
		if (number == iArray[number]) {
			System.out.println("원하는 숫자는 " + number + "인데 나왔습니다.");
		}else {
			throw (new NotFoundExecption("맞는 수가 없습니다.")); 
		}
	}
	public static void main(String[] args) {
			try {
				searchArray(5);
				searchArray(9);
			} catch (NotFoundExecption e) {
				e.printStackTrace();
			}
		
	}
}
