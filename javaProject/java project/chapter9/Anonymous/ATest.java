package Anonymous;

public class ATest {

	public static void main(String[] args) {
		B b = new A();
		b.turnOn();
		//b.turnOff();
		B b1 = new B() { //��ü ���� �ڿ� �߰�ȣ�� ���̴� ������ �����Ϸ��� �ٸ� Ŭ���� ���� ���⿡ �ٷ� Ŭ���� ������ �ϴ� ������ �޾Ƶ��δ�.
			@Override
			public void turnOn() {
				System.out.println("On");
			}
			/*
			 * @Override public void turnOff() { System.out.println("Off"); }
			 */
		};
		b1.turnOn();
		//b1.turnOff();
		
		//���ٽ����� ǥ��
		B b2 = ()-> { 
			System.out.println("end");
		};
		b2.turnOn();
	}

}
