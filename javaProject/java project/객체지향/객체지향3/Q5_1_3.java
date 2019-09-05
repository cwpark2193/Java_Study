package °´Ã¼ÁöÇâ3;

public class Q5_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float  grade =3.0f;
		for(;;) {
			if(grade<=4.5 && grade>=4.0) {
				System.out.println("A+");
				break;
			}
			else if(grade<4.5 && grade>=4.0) {
				System.out.println("A");
				break;
			}
			else if(grade<4.0 && grade>=3.5) {
				System.out.println("B+");
				break;
			}
			else if(grade<3.5 && grade>=3.0) {
				System.out.println("B");
				break;
			}
			else if(grade<3.0 && grade>=2.5) {
				System.out.println("C+");
				break;
			}
			
			else if(grade<2.5 && grade>=2.0) {
				System.out.println("C");
				break;
			}
			else if(grade<2.0 && grade>=1.5) {
				System.out.println("D+");
				break;
			}
			else if(grade<1.5 && grade>=1.0) {
				System.out.println("D");
				break;
			}
		}
	}
}
