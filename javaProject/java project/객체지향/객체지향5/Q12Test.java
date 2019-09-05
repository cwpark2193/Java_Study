package °´Ã¼ÁöÇâ5;

public class Q12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q12 numbers = new Q12(3,6,9);
		System.out.println(numbers.toString());
		int returnValue=numbers.sum(3, 6);
		System.out.println(numbers);
		System.out.println("returnValue= "+returnValue);
		float returnValue1=numbers.sum(3, 6,9);
		System.out.println(numbers);
		System.out.println("returnValue1= "+returnValue1);

	}

}
