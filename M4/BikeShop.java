package cisc191.sdmesa.edu;

import java.util.ArrayList;

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
 * Version/date: 
 * 
 * Responsibilities of class:
 *		Creates bike shop and stores inventory of cycles
 * 
 */
/**
 */

public class BikeShop 
{
	//BikeShop HAS-A shop name
	private String shopName;
	//BikeShop HAS-A inventory of Cycles
	private ArrayList<Cycle> inventory;

	
	/**
	 * Constructor for BikeShop
	 * @param name of bike shop
	 */
	public BikeShop(String shopName) 
	{
		this.shopName = shopName;
		inventory = new ArrayList<Cycle>();
	}
	
	/**
	 * @return name of shop and cycle inventory 
	 */
	public String toString()
	{
		return shopName + inventory;
	}
	 
	/**
	 * Adds cycle to inventory of shop
	 * @return void 
	 */
	public void addToInventory(Cycle bike)
	{
		inventory.add(bike);
	}

}
