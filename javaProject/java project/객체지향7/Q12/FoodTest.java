package Q12;

public class FoodTest {

	public static void main(String[] args) {
		Melon oneMelon = new Melon(649.4,9900, 1.7, "���� ��â");
		System.out.println(oneMelon);
		System.out.println("��, �� ������� �����ڸ� "+oneMelon.getPlace()+"���� �� �ӽ�ũ ����Դϴ�!");
		System.out.println("���Դ� "+oneMelon.getWeight()+"�ε� ������ ���� "+oneMelon.getPrice()+"��! �ܵ� "+oneMelon.getPrice()+"�̸� ����� ���� �� �ֽ��ϴ�!");
		System.out.println("�Դٰ� Į�θ��� �ܿ� "+oneMelon.getCalories()+"kcal�ۿ� ���ϴ� ���̾�Ʈ �������� ���Դϴ�!");
	}

}
