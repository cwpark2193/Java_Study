package 객체지향3;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("2개의 주사위의 눈의 합이 6이 되는 경우들");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				sum=i+j;
				if(sum==6) {					
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
