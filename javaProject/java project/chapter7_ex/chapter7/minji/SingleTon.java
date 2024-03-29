package chapter7.minji;

public class SingleTon {
	 private String string = "과제완료";
	   //1. 자기객체를 가지고 있는 정적멤버변수를 만든다.
	   private static SingleTon singleTon = new SingleTon();
	   //3.  SingleTon 객체를 만든다.
	   static {
	      singleTon = new SingleTon();
	   }
	   //2. 생성자를 외부에서 접근하지 못하도록 만든다.

	   private SingleTon() {}
	   //4. singleTon 객체를 리턴한다.
	   public static SingleTon getSingleTon() {
	      if(singleTon==null) {
	         singleTon = new SingleTon();
	      }
	      return singleTon;//이 리턴값에는 null이 들어있다.
	   }	   
	   //5. 우리가 실제로 활용할 수 있는 내용을 적어준다.
	   public void print() {
	      System.out.println("야 신난다 "+string);
	   }
	   public String getString() {
	      return string;
	   }
	   public void setString(String string) {
	      this.string = string;
	   }

}
