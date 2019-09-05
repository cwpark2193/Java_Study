package chapter6.intoutclass;

public class OuterClass {
	//1. �������(�����������,�ν��Ͻ��������)
	private int age;
	private static int sage;
	//2. �������Ŭ����(��������Ŭ����,����������Ŭ����)
	static class StaticClass{
		//�������,����Լ�,������
		public StaticClass() {
			//age=10; �ν��Ͻ� ��������� ������. ������ �ε�� 
			//�������Ŭ������ �ö���ִ� �͸� ����� �����ϴ�.
			sage=20;
			//InnerClass innerClass = new InnerClass(): �ν��Ͻ�����Ŭ���� ������
			StaticClassB staticCalssB = new StaticClassB();
			}
		public static void staticMyMethod() {
			sage=10; System.out.println("Static Class sage = "+sage);
		}
	}
	static class StaticClassB {
		
	}
	class InnerClass{
		//���������Ŭ����
		public InnerClass() {
			age=10;
			sage=20;
			StaticClass staticClass = new StaticClass();
			InnerClassB innerClassB = new InnerClassB();
		}
		
		//�������,����Լ�,������
		public void innerMyMethod() {
			age=30; sage=40; System.out.println("InnerClass age= "+age+" sage= "+sage);
		}
		class InnerClassB{
			
		}
	}
	//3. �������Լ�
	public OuterClass() {
		this(0,null,0);
	}
	public OuterClass(int age,String name,int birthday) {
		this.age=age;
		this.sage=sage;
	}
	
}
