package chapter15.Box;

public class BoxTest {

	public static void main(String[] args) {
		//1.
		Box<String,Integer> b1 = new Box<String,Integer>("���浿",30);
		String str =b1.getData();
		Integer num = b1.getData2();
		System.out.println(str+" "+num);
	
		String[] str1 = {"ȫ�浿","���浿","���浿"};
		Box.swap(str1, 0, 2);
		for(String str2 : str1 ) {
			System.out.print(str2+" ");
		}
		String strLastArray = Box.getLast(str1);
		System.out.println(strLastArray);
		
		MyData[] md = {new MyData("������"),new MyData("��������"),new MyData("�̼���")};
		Box.swap(md, 0, 1);
		for(MyData md1 : md ) {
			System.out.print(md1.str+" ");
		}
		System.out.println("");
		
		MyData mdLast = Box.getLast(md);
		System.out.println(mdLast.str);
		
		Integer[] iArray = { 10, 20, 30, 40, 50 };
		Box.printArray(iArray);
		String[] str3 = {"aaa","bbb","ccc","ddd"};
		Box.printArray(str3);
		MyData[] md2 = {new MyData("������"),new MyData("��������"),new MyData("�̼���")};
		Box.printArray(md2);
		
		
		
		//2.
//		Box<Integer> b2 = new Box<Integer>(new Integer(50));
//		int number=b2.getData();
//		System.out.println(number);
//		
//		Box<MyData> b3 = new Box<MyData>(new MyData("�δٱ��"));
//		MyData md = b3.getData();
//		System.out.println(md.str);
	}

}
