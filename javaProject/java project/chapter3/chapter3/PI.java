package chapter3;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0.0,sum=0.0;
		int num1=0,num2=0;
		boolean flag = true;
		num1=4;
		for(int i=1;i<100_000;i=i+2) {
			if (flag==true) {
				sum+=(double)num1/(double)i;
			}
			else {
				sum-=(double)num1/(double)i;
			}
			flag = !flag;
		}
		System.out.println("°á°ú"+sum);
	}

}
