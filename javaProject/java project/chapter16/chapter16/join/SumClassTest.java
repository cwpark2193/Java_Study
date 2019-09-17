package chapter16.join;

public class SumClassTest {

	public static void main(String[] args) throws InterruptedException {
		//1. 공유 객체 생성
		Data d1 = new Data();
		System.out.println("1~100합계 = "+d1.getSum());
		//2. 스레드 SumClass 객체를 만든다.
		Thread t1 = new SumClass(d1);
		t1.start();
		System.out.println("waiting....");
		t1.join();	//SumClass 스레드가 끝나면 메인 스레드가 작동이 된다.
		//main스레드는 일시정지 상태로 빠진다.
		System.out.println("1~100합계 = "+d1.getSum());
	}

}
