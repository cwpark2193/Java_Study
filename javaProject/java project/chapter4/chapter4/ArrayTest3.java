package chapter4;

import java.io.StreamCorruptedException;
import java.util.Stack;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1="abc";
		String str2 =new String("abc");
		//System.out.println("str1= "+str1);
		System.out.println("str2= "+str2);
		//if(str1.equals(new String("abc"))) {
		if(str2=="abc") {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
