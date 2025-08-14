package cisc191.sdmesa.edu;
/**
 * Lead Author(s):
 * @author Andrew CAstro
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
 * Interface used for vehicles that utilizes gas;
 * Sets and Gets fuel level of vehicle
 */
public interface Combustible 
{
	//Returns fuel level of car
	int getFuelLevel();
	
	//Adds fuel level to car with given fuel amount
	void addFuel(int fuel);
	
	//Adds fuel to car to max capacity
	void tankUp();
}
