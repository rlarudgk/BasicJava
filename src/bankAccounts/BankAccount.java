package bankAccounts;

public class BankAccount {
	
	private int balance;

	public BankAccount(){}
	public BankAccount(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		
	}
	public boolean withdraw(int amount) {
		return true;
	}
}
