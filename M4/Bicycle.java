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
 * Version/date: 1.0 9/20/2023
 * 
 * Responsibilities of class:
 * A a Bicycle is a Cycle with two wheels
 */

//Bicycle IS-A Cycle
public class Bicycle extends Cycle
{
	//Bicycle HAS-A make
	//Bicycle HAS-A number of wheels
	//Bicycle HAS-A color
	
	
	/**
	 * Constructor for Bicycle
	 * @param make
	 */
	public Bicycle(String newMake)
	{
		super(newMake);
	}
	
	/**
	 * 
	 * @return number of wheels
	 */
	public int getNumberOfWheels()
	{
		return 2;
	}
	
	/**
	 * 
	 * @param color of bicycle
	 */
	public void setColor(Color newColor)
	{
		color = newColor;
	}
	
	/**
	 * 
	 * @return color of bicycle
	 */
	public Color getColor()
	{
		return color;
	}

}
