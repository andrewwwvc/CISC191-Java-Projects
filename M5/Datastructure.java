package edu.sdmesa.cisc191;

import java.nio.charset.Charset;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Datastructure
{
	public static boolean isPalindrome(char[] letters)
	{
		// TODO:
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		
		//Adds letters into stack and queue
		for(int i =0; i < letters.length; i++)
		{
			//Adds to stack
			//Char turns into string utilizing empty string
			stack.add(letters[i] + "");
			queue.add(letters[i] + "");
		}
		
		for(int i = 0; i < stack.size(); i++)
		{
			//Remove from both data structures and compare
			//Do not use == when comparing string content
			//if the string from stack and queue are not equal, return false
			if(!stack.pop().equals(queue.remove()))
			{
				//Returns false if not palindrome
				return false;
			}
		}
		
		//Returns true if palindrome
		return true;
		
		
	}

}
