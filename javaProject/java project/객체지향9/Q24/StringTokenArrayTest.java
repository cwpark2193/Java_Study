package Q24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenArrayTest {

	public static void main(String[] args) {
		String[] strArray = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.");
		String str = scan.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		strArray = new String[st.countTokens()];
		System.out.println(st.countTokens());
		int i=0;
		while(st.hasMoreTokens()) {
			strArray[i++]=st.nextToken();
		}
		for(String string : strArray) {
			System.out.println(string+"  ");
		}
		Arrays.sort(strArray);
		for(String string : strArray) {
			System.out.println(string+"  ");
		}
	}

}
