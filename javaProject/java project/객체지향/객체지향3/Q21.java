package ��ü����3;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int a=1;a<=100;a++) {
			for(int b=1;b<=100;b++) {
				for(int c=1;c<=100;c++) {
					if(a*a+b*b==c*c) {
						count++;
						System.out.println("("+a+","+b+","+c+")");
					}
				}
			}
		}
		System.out.println("�����Ǵ� �����ﰢ�� ������ "+count+"�� �Դϴ�.");
	}

}
