package 객체지향3;

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
		System.out.println("만족되는 직각삼각형 개수는 "+count+"개 입니다.");
	}

}
