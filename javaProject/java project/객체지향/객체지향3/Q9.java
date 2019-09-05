package °´Ã¼ÁöÇâ3;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%3==0) {
				sum=sum+i;
			}
			else if(i%4==0) {
				sum=sum+i;
			}
			else if(i%12==0) {
				sum=sum-i;
			}
			else {
				sum=sum;
			}
		}
		System.out.println(sum);
	}
}
