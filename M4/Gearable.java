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
 * Responsibilities of interface:
 * Set of methods for Gearable cycles
 * 
 */
public interface Gearable
{
	/**
	 * @return gear cycle is in 
	 */
	int getGear();
	
	/**
	 * Increments the gear of cycle
	 * @return void
	 */
	void gearUp();
	
	/**
	 * Decrements the gear of cycle
	 * @return void
	 */
	void gearDown();
}
