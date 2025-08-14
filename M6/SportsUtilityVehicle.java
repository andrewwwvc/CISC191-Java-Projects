package cisc191.sdmesa.edu;
/**
 * Lead Author(s):
 * @author Andrew CAstro
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
 * Version/date: 10/9/2023
 * 
 * Responsibilities of class:
 * Creating SportsUtilityVehicle objects that includes manufacture, miles, price, number of seats, set of options, and max towing weight
 * 
 */

//A SportsUtilityVehicle IS-A Vehicle
public class SportsUtilityVehicle extends Vehicle
{
	//A SportsUtilityVehicle HAS-A max towing weight
	private int maxTowingWeight;
	
	//SportsUtilityVehicle Constructor including manufacture, miles, price, number of seats, option, max towing weight
	public SportsUtilityVehicle(String manufactureName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int maxTowingWeight)
	{
		super(manufactureName, milesOnVehicle, price, numberOfSeats, option);
		this.maxTowingWeight = maxTowingWeight;
	}
	
	//Returns SUV's max towing weight
	public int getMaxTowingWeight()
	{
		return maxTowingWeight;
	}
}
