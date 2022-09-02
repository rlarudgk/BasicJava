package Excep;

public abstract class BankAccount {
	private static final boolean IllegalArgumentException = false;
	private static final boolean NullPointerException = false;
	/**
	 * 계좌의 잔액
	 */
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	/**
	 * 입금 메소드
	 * @param amount 입금할 금액
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	/**
	 * 출금 메소드
	 * @param amount 출금할 금액
	 * @return 출금 성공시 true, 실패시 false 반환
	 */
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	/**
	 * 이체 메소드
	 * @param amount 이체할 금액
	 * @param otherAccount 이체될 계좌번호
	 * @return 이체 성공시 true, 실패시 false 반환
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount <0 || amount > balance) {
			return IllegalArgumentException;
		}
		if(otherAccount.equals(null)) {
			return NullPointerException;
		}
		
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	/**
	 * 계좌의 종류를 반환하는 메소드
	 * @return 계좌의 종류(저축예금, 당좌예금)
	 */
	public abstract String getAccountType();

	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
	
}







