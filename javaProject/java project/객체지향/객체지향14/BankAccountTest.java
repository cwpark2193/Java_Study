package °´Ã¼ÁöÇâ14;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount(10_000);
		bank.deposit(10000);
		try {
			bank.withdraw(30000);
		} catch (NegativeBalanceException e) {
			e.printStackTrace();
		}
	}
}
