package ��ü����6;

public class Television {
	 private String model;
	 //1. ������ �ڵ尡 ����. ����Ʈ�� ������
     void setModel(String b) {  // ������ 
    	 //�ۺ� ������ ����. ����Ʈȭ
           model = b;
     }
     String getModel() {		// ������
    	 //�����ڰ� ����. ���ͽ� ���ͽ� ���� public ������ �ʿ�.
    	 //2. ���ͽ� ���� ���ͽ�ó�� void�� �ƴ� �ش� �ڷ����� �ɸ´� Ÿ�� ���� �ʿ�.
    	 //.���⼭�� String,���ڿ��̹Ƿ� String �ʿ�.
           return model;
           //�ϴ� ���̵� �������μ� ���ϰ��� ���� ���Ѵ�.
     }
}
