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
import java.util.Stack;

public class StackConsumer
{
	private Stack<String> stack;

	//Constructor for StackConsumer stack
	public StackConsumer(Stack<String> stack)
	{
		this.stack = stack;
	}

	//Removes string at top of stack
	public String consume()
	{
		//Returns null if stack is empty
		if(stack.isEmpty())
		{
			return null;
		}
		return stack.pop();
	}

}
