package bankAccounts;

public class Customer {
	
	private String firstName;
	private String lastName;
	private BankAccount transfer;

	public Customer() {}
	public Customer(String firstName, String LastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount() {
		return new BankAccount();
	}
	

}
