package edu.sdmesa.cisc191;
/**
 * Lead Author(s):
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:
 * 
 * Responsibilities of class:
 * 
 */
import java.util.LinkedList;

public class LinkedListConsumer
{
	// A LinkedListConsumer has-a list
	private LinkedList<String> list;

	public LinkedListConsumer(LinkedList<String> list)
	{
	   this.list = list;
	}

	//Removes the head of the linked list
	public String consumeHead()
	{
		//Return null if empty
		if (list.size() == 0)
		{
			return null;
		}
		
      return list.removeFirst();
	}

	//Removes the tail of the linked list
	public String consumeTail()
	{
		//Returns null if empty
		if(list.size() == 0)
		{
			return null;
		}
		
      return list.removeLast();
	}

}
