package chapter2;

public class Light {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//1. 변수 선언 lightSpeed, distance
		//2. lightSpeed 상수값을 저장 300_000
		//3. distance = lightSpeed*(1년->초)
		//4. distance 값을 출력하는데 printf,println
		long lightSpeed=0L,distance=0L;
		
		lightSpeed = 300_000;
		distance = lightSpeed*(365l*24*60*60);
		
		System.out.printf("빛이 지나간 거리는 %dkm입니다.\n",distance);
		System.out.println("빛이 지나간 거리는 "+distance+"km");

	}

}
