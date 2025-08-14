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
 * Version/date: 1.0 9/16/2023
 * 
 * Responsibilities of class: Creates a harbor that stores boat objects
 * 
 */

public class Harbor 
{
	//A Harbor HAS-MANY Boat objects
	private Boat[] harbor;
	
	

	/**
	 * Purpose: Create an array with given number of spots
	 * @return void
	 */
	public Harbor(int docks) 
	{
		//Constructor initializes instance variables
		//Creates an array and assign it to harbor with the size of docks from parameter
		harbor = new Boat[docks];
	}
	
	/**
	 * Purpose: Gets boat at given dock number
	 * @return Boat at dock number
	 */
	public Boat getBoatAt(int dockNumber)
	{
		//Retrieves boat from harbor at given dockNumber
		return harbor[dockNumber];
	}
	
	/**
	 * Purpose: Park boat at given dock number, if it is taken, return boat that is docked
	 * @return void
	 */

	public Boat parkBoatAt(Boat boat, int dockNumber) 
	{
		//Stores boat from dockNumber
		Boat temp = harbor[dockNumber];
		
		//Parks the boat at given dockNumber
		harbor[dockNumber] = boat;
		
		//Returns old boat if one was parked there
		return temp;
	}
	
	/**
	 * Purpose: Returns the boats in the harbor
	 * @return copied array/ boats in harbor including empty docks
	 */
	public Boat[] getInventory()
	{
		//Creates a new array the same size as the harbor array
		Boat[] inventory = new Boat[harbor.length];
		
		//Copies the objects from harbor into inventory array
		for(int i = 0 ; i < harbor.length; i++)
		{
			inventory[i] = harbor[i];
		}
		
		//Returns the copied array
		return inventory;
	}
	

}
