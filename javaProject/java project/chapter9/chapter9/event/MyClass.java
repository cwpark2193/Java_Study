package chapter9.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
	private int count=0;
	//�̺�Ʈ�� �߻��ϸ� �ҷ����� �Լ���=�ݹ��Լ�
	//�Ű������� �̺�Ʈ�� �߻��� �Ǹ� �߻��� �� �� ��� ������ ��ü�� ����
	//ActionEvent event = ��ü 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//�̺�Ʈ�� �߻��� �Ǿ��� �� �ؾߵ� ���� ������ �˴ϴ�.
		System.out.println((count++)+"Event Horizen fallen down");
	}

}
