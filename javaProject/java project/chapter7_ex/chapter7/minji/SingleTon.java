package chapter7.minji;

public class SingleTon {
	 private String string = "�����Ϸ�";
	   //1. �ڱⰴü�� ������ �ִ� ������������� �����.
	   private static SingleTon singleTon = new SingleTon();
	   //3.  SingleTon ��ü�� �����.
	   static {
	      singleTon = new SingleTon();
	   }
	   //2. �����ڸ� �ܺο��� �������� ���ϵ��� �����.

	   private SingleTon() {}
	   //4. singleTon ��ü�� �����Ѵ�.
	   public static SingleTon getSingleTon() {
	      if(singleTon==null) {
	         singleTon = new SingleTon();
	      }
	      return singleTon;//�� ���ϰ����� null�� ����ִ�.
	   }	   
	   //5. �츮�� ������ Ȱ���� �� �ִ� ������ �����ش�.
	   public void print() {
	      System.out.println("�� �ų��� "+string);
	   }
	   public String getString() {
	      return string;
	   }
	   public void setString(String string) {
	      this.string = string;
	   }

}