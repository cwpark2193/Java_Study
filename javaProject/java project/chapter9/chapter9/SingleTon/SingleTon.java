package chapter9.SingleTon;

public class SingleTon {
	private SingleTon() {} //1. ������
	
	private static SingleTon singleton = new SingleTon();//��������������� ����� �ʱⰪ
	
	static {singleton = new SingleTon();} // ��������ʱⰪ
	//��������Լ�
	public static SingleTon getSingleTon() {
		if(singleton==null) {
			singleton=new SingleTon();
		}
		return singleton;
	}
}
