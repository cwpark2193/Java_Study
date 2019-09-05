package chpater14.example;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public void deposit(int money) {
		balance+=money;
		System.out.println("�ݾ��� �Ա��߽��ϴ�.");		
	}
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance<money) {
			//���� �߻���Ų��.
			throw new NegativeBalanceException((balance-money)+"��ŭ �ܾ��� �ʰ��մϴ�.");
		}
		balance-=money;
		System.out.println("�ݾ��� ����߽��ϴ�.");
	}

}