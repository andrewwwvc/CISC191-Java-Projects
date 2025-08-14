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
 * Class for constructor and getter methods for Vehicle objects
 * 
 */


public class Vehicle
{
	//A Vehicle HAS-A manufacture name
	private String manufactureName;
	//A Vehicle HAS-A number of miles
	private int milesOnVehicle;
	//A Vehicle HAS-A price
	private int price;
	//A Vehicle HAS-A number of seats
	private int numberOfSeats;
	//A Vehicle HAS-A set of options
	private Option[] option;
	
	//Constructor for Vehicle object including manufacture, miles, price, number of seats and set of options
	public Vehicle(String manufactureName, int milesOnVehicle, int price, int numberOfSeats, Option[] option)
	{
		this.manufactureName = manufactureName;
		this.milesOnVehicle = milesOnVehicle;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.option = option;
	}

	//Returns vehicle manufacture name
	public String getManufacturerName()
	{
		return manufactureName;
	}
	
	//Returns number of miles on vehicle
	public int getMilesOnVehicle()
	{
		return milesOnVehicle;
	}
	
	//Returns price of vehicle
	public int getPrice()
	{
		return price;
	}
	
	//Returns number of seats in vehicle
	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}
	
	//Returns set of options for Vehicle
	public Option[] getOptions()
	{
		return option;
	}
}
