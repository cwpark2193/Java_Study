package chapter3;

public class toBinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0,i=0;
		for(i=1;i<=10;i++) {
			number=(int)(Math.random()*(150-50+1)+50);
			System.out.print(i+"�� ");
			toBinaryString(number);
		}
	}
	public static void toBinaryString(int number) {
		String strValue = Integer.toBinaryString(number);
		while(strValue.length()<=16) {
			strValue="0"+strValue;
		}
		System.out.println(number+"�� 2���� ��ȯ ���= "+strValue);
	}
}
