package chapter2;


public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �������� �����Ѵ�.double(radious,area)
		//2. �������� �Ҵ��Ѵ�.(5)
		//3. ������ ����Ѵ�. (������*������*3.141592)
		//4. ������ �������� ����Ѵ�. printf,println
		double radious=0,area=0;
		
		radious=5.0;
		area=radious*radious*3.141592;
		System.out.printf("������ %fm�� ������ %f�Դϴ�.",radious,area);
		System.out.println("������ "+radious+"m�� ������ "+area+"m2�Դϴ�.");
		
	}

}
