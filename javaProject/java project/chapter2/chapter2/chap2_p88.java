package chapter2;

public class chap2_p88 {
	public static void main(String[] args) {
		double a= -3.0,b=2.0;
		
		double disc = a*a-4.0*b;
		double sqr=Math.sqrt(disc);
		System.out.println(disc);
		System.out.println(sqr);
		
		double r1=(-a+sqr) / (2.0);
		double r2=(-a-sqr) / (2.0);
		
		System.out.println("근은 "+r1);
		System.out.println("근은 "+r2);
	}
}
