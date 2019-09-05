package chapter9.SingleTon;

public class SingleTon {
	private SingleTon() {} //1. 생성자
	
	private static SingleTon singleton = new SingleTon();//정적멤버변수이자 명시적 초기값
	
	static {singleton = new SingleTon();} // 정적블록초기값
	//정적멤버함수
	public static SingleTon getSingleTon() {
		if(singleton==null) {
			singleton=new SingleTon();
		}
		return singleton;
	}
}
