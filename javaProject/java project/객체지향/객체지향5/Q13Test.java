package °´Ã¼ÁöÇâ5;

public class Q13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q13 numbers = new Q13(2,5,4.5,6.78);
		System.out.println(numbers.toString());
		int returnValue=numbers.sum(2, 5);
		System.out.println(numbers);
		System.out.println("returnValue= " +returnValue);
		double returnValue1=numbers.sum(4.5,6.78);
		System.out.println(numbers);
		System.out.println("returnValue= "+returnValue1);
	}

}
