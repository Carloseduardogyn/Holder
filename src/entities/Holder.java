package entities;

public class Holder {
	private int accountNumber;
	private String name;
	private double balance;

	public Holder(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public Holder(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amaount) {
		balance += amaount;
	}

	public void withdraw(double amaount) {
		balance -= amaount + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + accountNumber + "," + " HOLDER: " + name + ", " + "balance: $ "
				+ String.format("%.2f", balance);
	}
}