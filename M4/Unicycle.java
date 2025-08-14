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
 * A Unicycle is a Cycle with only one wheel
 */

 //Unicycle IS-A Cycle 
public class Unicycle extends Cycle
{
	//Unicycle HAS-A make
	//Unicycle HAS-A number of wheels
	//Unicycle HAS-A color
	
	
	 //Constructor for Unicycle including make 
	public Unicycle(String newMake)
	{
		super(newMake);
	}
	
	/**
	 * 
	 * @return number of wheels
	 */
	public int getNumberOfWheels()
	{
		return 1;
	}
	
	/**
	 * Sets color of unicycle
	 * @param newColor of unicycle
	 */
	public void setColor(Color newColor)
	{
		color = newColor;
	}
	
	/**
	 * @return color of unicycle
	 */
	public Color getColor()
	{
		return color;
	}
	
}
