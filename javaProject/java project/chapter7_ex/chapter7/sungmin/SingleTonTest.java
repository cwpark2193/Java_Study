package chapter7.sungmin;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      SingleTon single = new SingleTon(); // 오류 : private 
      SingleTon single = SingleTon.getsingleTon(); // 객체 받기.
      single.print();
      single.setString("완료 못함");
      single.print();
      SingleTon single2 = SingleTon.getsingleTon();
   }
}

