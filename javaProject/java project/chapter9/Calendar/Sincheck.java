package Calendar;

public class Sincheck {
	public static final double PI = 3.141592;
	public static void main(String[] args) {
		//0������ 90������ 5���� �����ϸ鼭 ���ΰ��� ����ϴ� ������ �ۼ��ϰ� �׽�Ʈ�϶�. 
		for(int i=0;i<=90;i+=5) {
			System.out.println(i+"�� ="+Math.sin(Math.toRadians(i)));
		}
	}

}