package chapter6.intoutclass;

public class OuterClass {
	//1. 멤버변수(정적멤버변수,인스턴스멤버변수)
	private int age;
	private static int sage;
	//2. 멤버내부클래스(정적내장클래스,비정적내장클래스)
	static class StaticClass{
		//멤버변수,멤버함수,생성자
		public StaticClass() {
			//age=10; 인스턴스 멤버변수는 사용못함. 이유는 로드시 
			//정적멤버클래스는 올라와있는 것만 사용이 가능하다.
			sage=20;
			//InnerClass innerClass = new InnerClass(): 인스턴스내부클래스 사용못함
			StaticClassB staticCalssB = new StaticClassB();
			}
		public static void staticMyMethod() {
			sage=10; System.out.println("Static Class sage = "+sage);
		}
	}
	static class StaticClassB {
		
	}
	class InnerClass{
		//비정적멤버클래스
		public InnerClass() {
			age=10;
			sage=20;
			StaticClass staticClass = new StaticClass();
			InnerClassB innerClassB = new InnerClassB();
		}
		
		//멤버변수,멤버함수,생성자
		public void innerMyMethod() {
			age=30; sage=40; System.out.println("InnerClass age= "+age+" sage= "+sage);
		}
		class InnerClassB{
			
		}
	}
	//3. 생성자함수
	public OuterClass() {
		this(0,null,0);
	}
	public OuterClass(int age,String name,int birthday) {
		this.age=age;
		this.sage=sage;
	}
	
}
