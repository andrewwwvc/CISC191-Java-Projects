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
 * Class that constructs HybridCar, fuels/charges car, and retrieves fuel/charge level
 * 
 */

//A HybridCar IS-A Car and IS combustible and chargeable
public class HybridCar extends Car implements Combustible, Chargeable
{
	//A HybridCar HAS-A fuel level
	private int fuelLevel;
	//A HybridCar HAS-A battery charge
	private int batteryCharge;
	
	public HybridCar(String manufactureName, int numberOfMiles, int price, int numberOfSeats, Option[] option, int numberOfDoors)
	{
		super(manufactureName, numberOfMiles, price, numberOfSeats, option, numberOfDoors);
	}
	
	public void tankUp()
	{
		fuelLevel = 100;
	}
	
	//Charges up HybridCar to max capacity
	public void chargeUp()
	{
		batteryCharge = 100;
	}
	
	//Charges up battery with given charge amount
	public void chargeUp(int charge)
	{
		batteryCharge += charge;
		
		//Checks if battery charge is greater than 100
		if(batteryCharge > 100)
		{
			//If batter is greater than 100, battery charge is set to 100
			batteryCharge = 100;
		}
	}
	
	//Adds fuel to car with given fuel level
	public void addFuel(int fuel)
	{
		fuelLevel += fuel;
		
		if(fuelLevel > 100)
		{
			fuelLevel = 100;
		}
	}
	
	//Returns the fuel level of hybrid car
	public int getFuelLevel()
	{
		return fuelLevel;
	}
	
	//Returns the battery charge of hybrid car
	public int getBatteryCharge()
	{
		return batteryCharge;
	}
}
