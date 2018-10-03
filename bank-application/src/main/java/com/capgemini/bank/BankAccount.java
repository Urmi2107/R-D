package com.capgemini.bank;

/**this comment is documentation based comment
 * 
 * @author uhalder
 *
 */

public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	{
		accountNo=++autoAccountNoGen;
	}
	
	public BankAccount()
	{
		
		accountHolderName="Unknown";
		accountBalance=0;
	}

	public BankAccount(String accountHolderName,double accountBalance)
	{
		super();
		
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	/*public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}*/

	public abstract void withdraw(double amount);
	
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ "]";
	}

	
}
