package model;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	//Constructors
	public SavingsAccount(int accountId, int customerId, Bank bank, String accountType, double balance, double interestRate) 
	{
		super(accountId, customerId, bank, accountType, balance);
		this.interestRate = interestRate;
	}
	
	//Getters and Setters
	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}
}
