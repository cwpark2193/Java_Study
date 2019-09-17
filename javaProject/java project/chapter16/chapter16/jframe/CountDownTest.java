package chapter16.jframe;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	//�������
	private JLabel label;
	//��� ���� �ν��Ͻ� Ŭ����
	private class MyThread extends Thread{
		@Override
		public void run() {
			//�ݺ��� ���� 1~10���� �󺧰�ü���, ȭ�鰴ü���� ���
			for(int i=0;i<=10;i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				label.setText(String.valueOf(i));
			}//end of for
		}//end of run
	}//end of innerClass
	//������ �Լ�
	public CountDownTest() throws HeadlessException {
		super();
		setTitle("��浿");	//������ â �̸� ����
		setSize(300,200);	//������ â ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//������ â �ݱ��� �ο�
		this.label = new JLabel("��ŸƮ");	//�󺧰�ü�� �����.
		this.label.setFont(new Font("Serif", Font.BOLD,	50));
		add(label);	//������ â�� ��������Ʈ ��ġ
		add(label);	//������ â�� ��������Ʈ ��ġ
		Thread t1 = new MyThread();
		t1.start();
		setVisible(true);	//������â�� ���������� Ȱ��ȭ
	}
}
