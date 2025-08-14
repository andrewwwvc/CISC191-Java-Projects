package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Andrew Castro
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0 10/26/2023
 * 
 * Responsibilities of class:
 * 	Handles BankAccount properties such as getting balance, depositing, withdrawing, get as much as possible from account
 */
/**
 */
public class BankAccount
{
	// A bank account has a current balance starting at $0.00
	private double balance = 0;

	/**
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Deposit amount into account
	 * 
	 * @param amount to deposit
	 * @throws InvalidAmountException is thrown if amount is not positive
	 */
	public void deposit(double amount) throws InvalidAmountException
	{
		//If amount is less than 0, throws exception
		if(amount < 0)
		{
			throw (new InvalidAmountException(amount));
		}
		
		//Adds amount to balance
		this.balance += amount;
	}

	/**
	 * Withdraw amount from account
	 * 
	 * @param amount to withdraw
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 * @throws InsufficientFundsException is thrown if there is not enough funds in
	 *                                    the account to make the withdrawal
	 */
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException
	{
		//If amount to withdraw is less than 0, throw exception
		if(amount < 0)
		{
			throw (new InvalidAmountException(amount));
		}
		//If withdraw amount is greater than balance, throw exception
		if(amount > balance)
		{
			throw ( new InsufficientFundsException(amount, (int)balance));
		}
		
		//Withdraws amount from balance
		this.balance -= amount;
	}

	/**
	 * Withdraw amount requested or the biggest amount possible
	 * 
	 * @return the amount actually withdrawn
	 */
	public double getAsMuchAsPossible(double requestAmount) 
	{
		
		// Try to withdraw the requested amount
		try
		{
		withdraw(requestAmount);
		}
		//Catches invalid amount and throws runtime exception
		catch (InvalidAmountException inval)
		{
			throw inval;
		}
		//If requested amount is more than balance, returns current balance
		catch (InsufficientFundsException insf)
		{
			double currentBalance = balance;
			balance = 0;
			
			return currentBalance;
		}
		
		//Returns request amount
		return requestAmount;
	}

}
