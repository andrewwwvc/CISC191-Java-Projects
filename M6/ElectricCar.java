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
 * Class that constructs ElectricCar, sets battery charge, and retrieves battery charge
 * 
 */

//An ElectricCar IS-A Car and IS chargeable
public class ElectricCar extends Car implements Chargeable
{
	//An ElectricCar HAS-A battery charge
	private int batteryCharge;
	
	//Constructor for ElectricCar including manufacture, miles, price, number of seats, option, and number of doors
	public ElectricCar(String manufactureName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors)
	{
		super(manufactureName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
	}

	//Getter for battery charge of electric car
	public int getBatteryCharge()
	{
		return batteryCharge;
	}
	
	//Adds charge to electric car with 100 being the max capacity
	public void chargeUp(int charge)
	{
		//Adds charge battery charge
		batteryCharge+= charge;
		
		//Checks if battery charge is more than 100 and sets to 100 if battery charge is > 100
		if(batteryCharge > 100)
		{
			batteryCharge = 100;
		}
	}
}
