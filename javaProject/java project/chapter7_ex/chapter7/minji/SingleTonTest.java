package chapter7.minji;

public class SingleTonTest {

	public static void main(String[] args) {
		//SingleTon single = new SingleTon();
	      SingleTon single= SingleTon.getSingleTon();
	      single.print();
	      single.setString("�Ϸ����.");
	      single.print();
	      
	      SingleTon single2= SingleTon.getSingleTon();
	   }
}
