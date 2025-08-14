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
 * Version/date: 10/26/2023
 * 
 * Responsibilities of class:
 *  Handles calculating bill total which includes bill amount and tip percent
 */
/**
 */
public class CheckoutBill
{
	// A bill has an amount
	private double amount = 0;
	// A bill has a tip percent
	private double tipPercent = -1;

	/**
	 * Set the amount from which to calculate the total bill
	 * 
	 * @param billAmount amount on the bill
	 * @throws IllegalArgumentException is thrown if amount is not positive
	 */
	public void setBillAmount(double billAmount) throws IllegalArgumentException
	{
		//If bill amount is 0 or less than 0, throws exception
		if(billAmount <= 0) 
		{
			//Throws exception object
			throw( new IllegalArgumentException() );
		}

		//Else, sets bill amount to amount
		this.amount = billAmount;
	}

	/**
	 * Set the tip percent from which to calculate the total bill
	 * 
	 * @param percent tip given
	 * @throws IllegalArgumentException is thrown if percent is negative
	 */
	public void setTipPercent(double percent) throws IllegalArgumentException
	{
		//If tip percent is less than 0, throws exception
		if(percent < 0)
		{
			throw( new IllegalArgumentException());
		}
		
		//Else, sets tip percent 
		this.tipPercent = percent;
	}

	/**
	 * Calculate the total bill from the bill amount and tip percentage
	 * @return total bill amount
	 * @throws IllegalStateException if bill amount is not positive or tip percent is negative
	 */
	public double calculateTotalBill() throws IllegalStateException
	{
		if(tipPercent < 0)
		{
			throw (new IllegalStateException() );
		}
		if(amount <= 0)
		{
			throw (new IllegalStateException() );
		}
		
		return amount * (1 + tipPercent / 100);
	}

	public static void main(String[] args)
	{
		//Tries to calculate bill
		try
		{
		CheckoutBill bill = new CheckoutBill();
		bill.setTipPercent(-1); 
		bill.calculateTotalBill();
		}
		//Catches exception
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
