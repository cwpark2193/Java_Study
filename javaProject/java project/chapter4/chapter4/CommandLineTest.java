package chapter4;

public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String str : args) {
			if(str.equals("-h")) {
				System.out.println("help");
			}else {
				System.out.println(str);				
			}
		}
	}
}
