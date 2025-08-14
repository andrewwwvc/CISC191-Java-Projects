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
 * Class for creating PickupTruck objects that include manufacture, miles, price, number of seats, set of options, and cargo capacity
 * 
 */
//A PickupTruck IS-A Vehicle
public class PickupTruck extends Vehicle
{
	//A PickupTruck HAS-A cargo capacity
	private int cargoCapacity;
	
	//PickupTruck Constructor including manufacture, miles, price, number of seats, option and cargo capacity
	public PickupTruck(String manufactureName, int milesOnVehicle, int price, int numberOfSeats, Option[] option,int cargoCapacity)
	{
		super(manufactureName, milesOnVehicle, price, numberOfSeats, option);
		this.cargoCapacity = cargoCapacity;
	}
	
	//Returns cargo capacity of pickuptruck
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}
}
