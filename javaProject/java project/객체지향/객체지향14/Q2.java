package 객체지향14;

public class Q2{
	 public static void main(String[] args) throws Exception{
         sub();
   }
   public static void sub() throws Exception{
          int[] array = new int[10];
        
          try {
        	  int i = array[10];
        	  System.out.println("?! 오류 발생!");
          }catch(ArrayIndexOutOfBoundsException a) {
        	  System.out.println("오류를 잡아보아요~");
          }finally {
			System.out.println("오류 캐치 완료!");
		}
   }

}