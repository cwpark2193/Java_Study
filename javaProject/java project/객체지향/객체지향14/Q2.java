package ��ü����14;

public class Q2{
	 public static void main(String[] args) throws Exception{
         sub();
   }
   public static void sub() throws Exception{
          int[] array = new int[10];
        
          try {
        	  int i = array[10];
        	  System.out.println("?! ���� �߻�!");
          }catch(ArrayIndexOutOfBoundsException a) {
        	  System.out.println("������ ��ƺ��ƿ�~");
          }finally {
			System.out.println("���� ĳġ �Ϸ�!");
		}
   }

}