package cisc191.sdmesa.edu;

import java.awt.Color;

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
 * Responsibilities of class: Creates boat objects
 * 
 */

//TODO: implement and remove all TODOs

/**
 */
public class Boat
{
	// TODO: Implement and comment all HAS-A relationships separately
	// For instance: A boat has a make
	
	//Attributes/Properties/Instance Variables
	
	//A boat HAS-A make
	private String make;
	//A boat HAS-A color
	private Color color;
	//A boat HAS-A speed
	private int speed;
	//A boat HAS-A price
	private int price;
	//A boat HAS-A serial number
	private int serialNumber;
	//A boat HAS-A owner
	private Person owner;
	//The Boat class HAS-A static serial number for tracking unique serial numbers
	private static int newSerialNumber = 1;
	
	
	public Boat()
	{
		//Initializes instance variables
		make = null;
		color = null;
		speed = 0;
		price = -1;
		serialNumber = createNewSerialNumber();
		
		
	}
	
	//2nd constructor initializing make and color
	public Boat(String make, Color color)
	{
		//Call default constructor (no parameter)
		this();
		
		//This object's make = parameter make
		this.make = make;
		
		//This object's color = parameter color
		this.color = color;
	}
	
	//3rd constructor copy of a object
	public Boat(Boat otherBoat)
	{
		//Assign this object's attribute to the boat object's properties
		//BUT creates a new serial number for new boat
		this.make = otherBoat.make;
		this.color = otherBoat.color;
		this.speed = otherBoat.speed;
		this.price = otherBoat.price;
		this.serialNumber= createNewSerialNumber();
	}
	
	
	/**
	 * Purpose: Sets price of boat
	 * @return void
	 */
	public void setPrice(int price)
	{
		//This object's price = parameter price
		this.price = price;
	}
	
	/**
	 * Purpose: Sets the color of boat
	 * @return  void
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	/**
	 * Purpose: Increase speed of boat by 1
	 * @return void
	 */
	public void speedUp()
	{
		//Increments boat's speed
		speed++;
	}
	
	/**
	 * Purpose: Decrease speed of boat by 1
	 * @return void
	 */
	public void slowDown()
	{
		//Decreases boat's speed
		speed--;
	}
	
	//Override existing toString method
	//We  know what it means to print, not the object class
	public String toString()
	{
		return "Boat: make: " + this.make + " color: " + this.color;
	}
	
	/**
	 * Purpose: Creates new serial number for boat
	 * @return void
	 * 
	 * static methods can access other static methods and static variables.
	 */
	public static int createNewSerialNumber()
	{
		//Will increment serial number and return new serial number created
		return newSerialNumber++;
	}
	
	/**
	 * Purpose: get make of boat
	 * @return make
	 */
	public String getMake()
	{
		//Return this object's make attribute
		return this.make;
	}

	/**
	 * Purpose: Get Color of boat
	 * @return boat's color
	 */
	public Color getColor()
	{
		//Return this object's color attribute
		return this.color;
	}

	/**
	 * Purpose: Get speed of boat
	 * @return boat's speed
	 */
	public int getSpeed()
	{
		//Return this object's speed attribute
		return this.speed;
	}

	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	/**
	 * Purpose: Get serial number
	 * @return serial number
	 */
	
	public int getSerialNumber()
	{
		return this.serialNumber;
	}

	/**
	 * Purpose: Sets owner to boat
	 * @return void
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
		
	}

	/**
	 * Purpose: Gets owners name
	 * @return 
	 */
	public Person getOwner() {
		return owner;
	}
	
}
