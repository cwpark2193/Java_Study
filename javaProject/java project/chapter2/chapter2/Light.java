package chapter2;

public class Light {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//1. ���� ���� lightSpeed, distance
		//2. lightSpeed ������� ���� 300_000
		//3. distance = lightSpeed*(1��->��)
		//4. distance ���� ����ϴµ� printf,println
		long lightSpeed=0L,distance=0L;
		
		lightSpeed = 300_000;
		distance = lightSpeed*(365l*24*60*60);
		
		System.out.printf("���� ������ �Ÿ��� %dkm�Դϴ�.\n",distance);
		System.out.println("���� ������ �Ÿ��� "+distance+"km");

	}

}
