package edu.sdmesa.cisc191;

import java.util.Hashtable;
public class PhoneDirectory 
{
	//instance var - the datastructure being used
	private Hashtable<String, Integer> directory;
	
	//Constructor for directory/hashtable
	public PhoneDirectory()
	{
		directory = new Hashtable<String, Integer>();
	}
	
	//Adds key and value to hashtable aka name and number
	public void setNumberForPerson(String name, int number)
	{
		directory.put(name, number);
	}

	//Returns the value of key aka number from name
	public Integer findNumberForPerson(String name) 
	{
		
		return directory.get(name);
	}

	//Removes value from key aka number from name
	public void forget(String name) 
	{
		directory.remove(name);
	}

}
