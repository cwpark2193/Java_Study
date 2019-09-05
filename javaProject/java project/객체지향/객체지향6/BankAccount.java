package °´Ã¼ÁöÇâ6;

public class BankAccount {
	private String name;
	private int accountnumber;
	private double balance;
	private double interestrate;
	public BankAccount() {
		this(null,0,0.0,0.0);
	}
	public BankAccount(String name) {
		this.name = name;
		this.accountnumber = 0;
		this.balance = 0.0;
		this.interestrate = 0.0;
	}
	public BankAccount(String name, int accountnumber) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = 0.0;
		this.interestrate = 0.0;
	}
	public BankAccount(String name, int accountnumber, double balance) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.interestrate = 0.0;
	}
	public BankAccount(String name, int accountnumber, double balance, double interestrate) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.interestrate = interestrate;
	}
	
	
}
