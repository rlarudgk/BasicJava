package bankAccounts;

public class Bank {
	
	private Customer[] customers;
	private int numberOfCustmers;
	
	public Bank() {
		this.customers = new Customer[10];
	}
	public void addCustomer(Customer[] customer) {
		this.customers = customer;
		numberOfCustmers++;
	}
}
