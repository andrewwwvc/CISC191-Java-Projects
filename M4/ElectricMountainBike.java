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
 * Version/date: 1.0 9/20/2023
 * 
 * Responsibilities of class:
 * ElectricMountainBike is a Bicyle that is Movable, Gearable, and Electric
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements) relationships separately
//ElectricMountainBike IS-A Bicycle
//ElectricMountainBike IS Gearable
//ElectricMountainBike IS Electric
//ElectricMountainBike IS Movable
public class ElectricMountainBike extends Bicycle implements Gearable, Electric, Movable
{
	//ElectricMountainBike HAS-A gear
	private int gear = 1;
	//ElectricMountainBke HAS-A charge
	private int charge = 0;
	//ElectricMountainBike HAS-A speed
	private int speed = 0;
	
	/**
	 * Constructor for ElectricMountainBike
	 * @param make
	 */
	public ElectricMountainBike(String newMake)
	{
		super(newMake);
	}
	
	/**
	 * @return gear bike is in
	 */
	public int getGear()
	{
		return gear;
	}
	
	/**
	 * Increments gear of bike
	 * @return void
	 */
	public void gearUp()
	{
		gear++;
	}
	
	/**
	 * Decrements gear of bike
	 * @return void
	 */
	public void gearDown()
	{
		gear--;
	}
	
	/**
	 * @return charge of bike
	 */
	public int getCharge()
	{
		return charge;
	}
	
	/**
	 * @param charge amount
	 */
	public void charge(int newCharge)
	{
		charge = newCharge;
	}
	
	/**
	 * @return speed of bike
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Increments speed of bike
	 * @return void
	 */
	public void speedUp()
	{
		speed++;
	}
	
}
