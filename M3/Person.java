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
 * Responsibilities of class: Creates person object that includes name, phone number, and zipcode 
 * 
 */
public class Person 
{
	//A Person HAS-A name
	private String name;
	//A Person HAS-A phone number
	private String phoneNumber;
	//A Person HAS-A zipcode
	private String zipcode;
	
	/**
	 * Purpose: Constructs person and assigns name, number, and zipcode
	 * @return void
	 */
	public Person (String name, String phoneNumber, String zipcode)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.zipcode = zipcode;
	}
	
	public String toString()
	{
		return name + " " + phoneNumber + " " + zipcode;
	}
	
	/**
	 * Purpose: returns name of person
	 * @return name of person
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * Purpose: Sets name of person
	 * @return void
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Purpose: Gets phone number
	 * @return phone number
	 */
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	/**
	 * Purpose: Sets phone number 
	 * @return void
	 */
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Purpose: Get person's zipcode
	 * @return zipcode
	 */
	public String getZipcode() 
	{
		return zipcode;
	}

	/**
	 * Purpose: sets Person's zipcode
	 * @return void
	 */
	public void setZipcode(String zipcode) 
	{
		this.zipcode = zipcode;
	}
	
	
}
