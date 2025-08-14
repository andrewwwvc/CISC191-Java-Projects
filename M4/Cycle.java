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
 * Sets default traits for a cycle including frame number, make, and color
 */
/**
 * Only change sections that are marked with TODO
 */

public abstract class Cycle 
{	
	// A cycle has a unique frame number, that is *immutable*;
	// How are you going to make it immutable, so that it only gets one final number? 
	// (Hint: did you see the hint?)
	
	//Cycle HAS-A frame number
	private int frameNumber;
	//Cycle HAS-A make
	private String make;
	//Cycle class HAS-A static frame number that is unique to each cycle
	private static int newFrameNumber = 1;
	protected Color color;
	
	// A cycle has a make, that is immutable
	/**
	 * Constructor for Cycle
	 * @param make
	 */
	public Cycle(String newMake)
	{
		make = newMake;
		frameNumber = createNewFrameNumber();
		
	}

	/**
	 * @return newFrameNumber 
	 */
	public static int createNewFrameNumber()
	{
		return newFrameNumber++;
	}
	abstract int getNumberOfWheels();

	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return make;
	}
	
	/**
	 * 
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber()
	{
		// TODO
		return frameNumber;
	}
	
	/**
	 *  @return true if the frame number are the same
	 */
	@Override
	public boolean equals(Object other)
	{
		// Hint: use instanceof
		// See: https://www.sitepoint.com/implement-javas-equals-method-correctly/
		
		//Checks if object 'other' is an instance of Cycle class
		if(other instanceof Cycle)
		{
			//Turns 'other' object into a cycle object to be compared
			Cycle otherCycle = (Cycle) other;
			//Compares if frame numbers are the same
			if(otherCycle.getFrameNumber() == frameNumber)
			{
				//Returns true if the frame numbers are the same
				return true;
			}
		}
		//Returns false if frame numbers are not the same
		return false;
	}
	
	/**
	 * @return String describing the object, including color, make and frame number
	 */
	@Override
	public String toString()
	{
		return getMake() + getFrameNumber() + getColor();
	}

}
