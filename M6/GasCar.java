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
 * Class that constructs GasCar, sets fuel level ,and returns fuel level
 * 
 */

//A GasCar IS-A Car and IS combustible
public class GasCar extends Car implements Combustible
{
	//A GasCar HAS-A fuel level
	private int fuelLevel;
	
	//Constructor for GasCar including manufacture, miles, price, number of seats, options, number of doors
	public GasCar(String manufactureName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors)
	{
		super(manufactureName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
	}
	
	//Adds fuel to car and max capacity is 50
	public void addFuel(int fuelLevel)
	{
		this.fuelLevel += fuelLevel;
		
		if(this.fuelLevel > 50)
		{
			this.fuelLevel = 50;
		}
	}
	
	//Returns current fuel level of gas car
	public int getFuelLevel()
	{
		return fuelLevel;
	}
	
	//Sets fuel level to 100 (Max capacity)
	public void tankUp()
	{
		fuelLevel = 100;
	}
	

}
