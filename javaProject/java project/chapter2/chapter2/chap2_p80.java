package chapter2;

public class chap2_p80 {
	public static void main(String[] args) {
		int x=0x0fff,y=0xfff0;
		System.out.printf("%x\n",~x);
		System.out.printf("%x\n",(x&y));
		System.out.printf("%x\n",(x^y));
		System.out.printf("%x\n",(x|y));
		System.out.printf("%x\n",(x<<4));
		System.out.printf("%x\n",(x>>4));
		System.out.printf("%x\n",(-1>>>4));
		
	}
}
