package °´Ã¼ÁöÇâ3;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,k=0;
		for(i=2;i<=100;i++) {
			for(k=2;k<=i;k++) {
				if(i%k==0) break;
			}
			if(i==k) {
				System.out.print(i+" ");
			}
		}
	}

}
