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
 * Version/date: 10/9/2023
 * 
 * Responsibilities of class:
 * Constructs Car objects including manufacture, miles, price, number of seats, set of options, and number of doors
 * Gets number of doors of car
 * 
 */

//A Car IS-A Vehicle
public class Car extends Vehicle
{
	//A Car HAS-A number of doors
	private int numberOfDoors;
	
	//Constructor for car including manufacture name, miles, price, number of seats, options, number of doors
	public Car(String manufactureName, int numberOfMiles, int price, int numberOfSeats, Option[] option, int numberOfDoors)
	{
		super(manufactureName, numberOfMiles, price, numberOfSeats, option);
		this.numberOfDoors = numberOfDoors;
		
	}
	
	//Returns number of doors car has
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
	
}
