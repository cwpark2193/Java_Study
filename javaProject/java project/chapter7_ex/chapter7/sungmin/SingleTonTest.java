package chapter7.sungmin;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      SingleTon single = new SingleTon(); // ���� : private 
      SingleTon single = SingleTon.getsingleTon(); // ��ü �ޱ�.
      single.print();
      single.setString("�Ϸ� ����");
      single.print();
      SingleTon single2 = SingleTon.getsingleTon();
   }
}

