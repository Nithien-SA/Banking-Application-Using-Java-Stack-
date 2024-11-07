package model;

public class CurrentAccount extends Account
{
	private double overdraftLimit;
	
	//Constructors
	public CurrentAccount(int accountId, int customerId, Bank bank, String accountType, double balance,  double overdraftLimit) 
	{
		super(accountId, customerId, bank, accountType, balance);
		this.overdraftLimit = overdraftLimit;
	}

	//Getters and Setters
	public double getOverdraftLimit() 
	{
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) 
	{
		this.overdraftLimit = overdraftLimit;
	}
	
	
}
