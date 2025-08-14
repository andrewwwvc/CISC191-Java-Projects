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
 * Version/date: 1.0 9/16/2023
 * 
 * Responsibilities of class: Creates credit card object incliding card number, exp date, security code, and owner of card
 * 
 */

public class CreditCard 
{
	//A CreditCard HAS-A card number
	private String cardNumber;
	//A CreditCard HAS-AN expiration date
	private String expDate;
	//A CreditCard HAS-A security code
	private String securityCode;
	//A CreditCard HAS-A owner
	private Person owner;
	
	/**
	 * Purpose: Creates credit card with card number, expiration date, security code, and owner
	 * @return void
	 */
	public CreditCard(String cardNumber, String expDate, String securityCode, Person owner)
	{
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.securityCode = securityCode;
		this.owner = owner;
		
	}
	
	/**
	 * Purpose: Prints out card number, expiration date, security code, and card holder's name
	 * @return 
	 */
	public String toString()
	{
		return cardNumber + " " + expDate + " " + securityCode + " " + owner.getName();
	}

	/**
	 * Purpose: Get card number
	 * @return card number
	 */
	public String getCardNumber() 
	{
		return cardNumber;
	}

	/**
	 * Purpose: Set card number for CreditCard
	 * @return void
	 */
	public void setCardNumber(String cardNumber) 
	{
		this.cardNumber = cardNumber;
	}

	/**
	 * Purpose: get expiration date of card
	 * @return expiration date 
	 */
	public String getExpDate() 
	{
		return expDate;
	}

	/**
	 * Purpose: Set expiration date to CreditCard
	 * @return void
	 */
	public void setExpDate(String expDate) 
	{
		this.expDate = expDate;
	}

	/**
	 * Purpose: Get security code of CreditCard
	 * @return security code
	 */
	public String getSecurityCode() 
	{
		return securityCode;
	}

	/**
	 * Purpose: Set security code of CreditCard
	 * @return void
	 */
	public void setSecurityCode(String securityCode) 
	{
		this.securityCode = securityCode;
	}

	/**
	 * Purpose: Get Name of Owner
	 * @return owner 
	 */
	public Person getOwner() 
	{
		return owner;
	}

	/**
	 * Purpose: Set owner of CreditCard
	 * @return void
	 */
	public void setOwner(Person owner) 
	{
		this.owner = owner;
	}

	
}
