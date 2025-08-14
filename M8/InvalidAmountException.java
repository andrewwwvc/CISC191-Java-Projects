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
 * 	Handles invalid amount exceptions for BankAccount class
 */
/**
 */

public class InvalidAmountException extends RuntimeException
{
	//Stores invalid amount requested
	private double amount;

	public InvalidAmountException(double amount) 
	{
		this.amount = amount;
	}

	//Override the getMessage() method
	public String getMessage()
	{
		return "Negative amount: $" + amount + " is not allowed";
		
	}
}
