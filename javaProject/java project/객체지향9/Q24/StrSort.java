package Q24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrSort {

	public static void main(String[] args) {
		int i=0,count=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.");
		String str = scan.nextLine();
		StringTokenizer st= new StringTokenizer(str);
		count=st.countTokens();
		String[] strArray=new String[count];
		while(st.hasMoreTokens()) {
			strArray[i++]=st.nextToken();
			System.out.println(strArray[i-1]);
		}
		Arrays.sort(strArray);
		System.out.println("모두 "+count+"개의 단어가 있습니다.");
		for(i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	}

}
