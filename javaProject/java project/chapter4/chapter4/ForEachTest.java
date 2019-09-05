package chapter4;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numbers = new int[] {10,20,30};
		ForEach fe = new ForEach(new int[] {10,20,30});
		ForEach forEach = new ForEach();
		forEach.generalFor();
		System.out.println("");
		forEach.improveFor();
	}
}
