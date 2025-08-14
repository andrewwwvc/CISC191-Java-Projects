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
 * Responsibilities of Interface:
 * Interface used for vehicles that utilize electricity/battery
 */
/**
 */
public interface Chargeable
{
	//Gets battery charge of vehicle
	int getBatteryCharge();
	
	//Adds charge to battery of vehicle
	void chargeUp(int charge);
}
