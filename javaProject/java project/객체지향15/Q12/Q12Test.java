package Q12;

public class Q12Test {

	public static void main(String[] args) {
		RandomList<String> random=new RandomList<String>();
		random.add("�輺��");
		random.add("������");
		random.add("������");
		System.out.println(random.getObj());
		System.out.println("=====");
		random.iteratorPrint();
	}
}
