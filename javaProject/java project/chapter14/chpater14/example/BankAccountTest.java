package chpater14.example;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(10_000);
		try {
			ba.withdraw(20_000);
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		ba.deposit(10_000);
	}

}
