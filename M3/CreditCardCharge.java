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
 * Responsibilities of class: Creates credit card charge that includes date, boat object, company name, and credit card info
 * 
 */

public class CreditCardCharge 
{
	//A CreditCardCharge HAS-A year
	private int year;
	//A CreditCardCharge HAS-A month
	private int month;
	//A CreditCardCharge HAS-A day
	private int day;
	//A CreditCardCharge HAS-A boat
	private Boat boat;
	//A CreditCardChange HAS-A company name
	private String companyName;
	//A CreditCardChange HAS-A card
	private CreditCard card;
	
	
	/**
	 * Purpose: Creates credit card charge with given year, month, day, boat, company name, and card
	 * @return void
	 */
	public CreditCardCharge(int year, int month, int day, Boat boat, String companyName, CreditCard card)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.boat = boat;
		this.companyName = companyName;
		this.card = card;
	}
	
	/**
	 * Purpose: Print out credit card charge including date, card number, company name, make of boat and price
	 * @return Charge details
	 */
	public String toString()
	{
		return year + "/" + month + "/" + day + " " + card + " " + companyName + " " + boat.getMake() + " $" + boat.getPrice();
	}
}
