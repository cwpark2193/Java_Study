package chpater14.example;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public void deposit(int money) {
		balance+=money;
		System.out.println("금액을 입금했습니다.");		
	}
	public void withdraw(int money) throws NegativeBalanceException{
		if(balance<money) {
			//에러 발생시킨다.
			throw new NegativeBalanceException((balance-money)+"만큼 잔액을 초과합니다.");
		}
		balance-=money;
		System.out.println("금액을 출금했습니다.");
	}

}
