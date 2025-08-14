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
 * 	Handles exceptions when not enough funds in bank account
 */


public class InsufficientFundsException extends Exception 
{
	//InsufficientFundsException HAS-A amount
	private double amount;
	//InsufficientFundsException HAS-A balance
	private int balance;

	//InsufficientFundsException constructor including amount and balance
	public InsufficientFundsException(double amount, int balance)
	{
		this.amount = amount;
		this.balance = balance;
	}
	
	//Returns message saying requested amount to withdraw is greater than balance
	public String getMessage()
	{
		return "Withdrawing amount: $" + amount + " that is larger than balance: $" + (int)balance + " is not allowed";
	}
}
