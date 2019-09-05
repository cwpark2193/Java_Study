package °´Ã¼ÁöÇâ3;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,result=0;
		for(int i=1;i<=100;i++) {
			for (int j=1;j<=i;j++){
				sum+=j;
				
			}
			System.out.println(result);
			result+=sum;
			sum=0;
		}
		System.out.println(result);
	}

}
