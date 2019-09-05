package 객체지향14;

class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String messege) {
		super(messege);
	}
}

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int deposit(int money) {
		System.out.println("입금을 시작합니다.");
		System.out.println("입금 금액 =" + money);
		System.out.println("현재 잔액 = " + (balance + money) + "원 입니다.");
		return balance + money;
	}

	public void withdraw(int money) throws NegativeBalanceException {
		System.out.println("출금을 시작합니다.");
		System.out.println("출금 금액 =" + money);
		if (balance < money) {
			throw (new NegativeBalanceException("잔액이 부족합니다."));
		}
		balance -= money;
		System.out.println("현재 잔액 = " + balance + "원 입니다.");
	}
}
