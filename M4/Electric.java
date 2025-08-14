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
 * Set of methods for Electric cycles(get charge and charge cycle)
 * 
 * 
 */
public interface Electric 
{
	/**
	 * @return charge of cycle
	 */
	int getCharge();

	/**
	 * charges cycle and sets new charge
	 * @param charge 
	 */
	void charge(int charge);


}
