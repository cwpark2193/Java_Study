package Q12;

public class Q12Test {

	public static void main(String[] args) {
		RandomList<String> random=new RandomList<String>();
		random.add("±è¼º¹Î");
		random.add("À¯¿µ»ï");
		random.add("Á¤¹ÎÁö");
		System.out.println(random.getObj());
		System.out.println("=====");
		random.iteratorPrint();
	}
}
