package Calendar;

public class Sincheck {
	public static final double PI = 3.141592;
	public static void main(String[] args) {
		//0도부터 90도까지 5도씩 증가하면서 싸인값을 출력하는 루프를 작성하고 테스트하라. 
		for(int i=0;i<=90;i+=5) {
			System.out.println(i+"도 ="+Math.sin(Math.toRadians(i)));
		}
	}

}
