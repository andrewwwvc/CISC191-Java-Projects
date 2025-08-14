package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Andrew Castro
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors: Whole class during Mob Programming
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0 as of 9/2/2023
 * 
 * 
 * Responsibilities of class:
 *  array utilities
 */

 // See INSTRUCTIONS in TestM1Challenge

public class M1Challenge
{
	/**
	 * Purpose: add two numbers
	 * @param a one number
	 * @param b another number
	 * @return the sum of a and b
	 */
	public static int add(int a, int b)
	{
		//Returns sum of parameters
		return a + b;
	}
	
	/**
	 * Purpose: multiply two numbers
	 * @param a one number
	 * @param b another number
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b)
	{
		//Returns product of parameters
		return a*b;
	}
	
	/**
	 * Purpose: return the first element in the array given
	 * 
	 * @param array to search
	 * @return first element
	 */
	public static int getFirst(int[] array)
	{
		//Returns first element in given array
		return array[0];
	}
	
	/**
	 * Purpose: return the last element in the array given
	 * 
	 * @param array to search
	 * @return last element
	 */
	public static int getLast(int[] array)
	{
		//Returns last element in array
		return array[array.length-1];
	}
	
	/**
	 * Purpose: return the middle element in an array with an odd number of elements
	 * 
	 * @param array to search
	 * @return middle element
	 */
	public static int getMiddle(int[] array)
	{
		//Initialize a middle value variable 
		int middleVal = array.length/2;
		
		//Returns middle element in array
		return array[middleVal];
	}
	
	// Use this template for the other methods
	/**
	 * Purpose: return max value in array
	 * 
	 * @param array to search
	 * @return max value
	 */
	public static int max(int[] array)
	{
		//Initialize max value variable that is set as the first element in array
		int maxVal = array[0];
		
		//Traverse the array
		for(int i = 0; i < array.length; i++)
		{
			//Checks if element at i is greater than max value
			if(array[i] > maxVal)
			{
				//Sets element at i to max value
				maxVal = array[i];
			}
		}
		
		//Returns max value out of array
		return maxVal;
	}
	
	// Use this template for the other methods
		/**
		 * Purpose:return the min value in array
		 * 
		 * @param array to search
		 * @return min value
		 */
		public static int min(int[] array)
		{
			//Initialize min value as first element in array
			int minVal = array[0];
			
			//Traverse the array
			for(int i = 0; i < array.length; i++)
			{
				//Checks if element at i is less than min value
				if(array[i] < minVal)
				{
					//Sets element at i as min value
					minVal = array[i];
				}
			}
			//Returns min value in array
			return minVal;
		}
		
	// Use this template for the other methods
		/**
		 * Purpose: return the sum of elements in array
		 * 
		 * @param array to search
		 * @return sum of elements
		 */
		public static int sum(int[] array)
		{
			//Initialize sum variable
			int sum = 0;
			
			//Traverse the array
			for(int i = 0; i < array.length; i++)
			{
				//Adds elements in array
				sum += array[i];
			}
			
			//Returns sum of array
			return sum;
		}
		
	// Use this template for the other methods
		/**
		 * Purpose: return average of elements in array
		 * 
		 * @param array to search
		 * @return average of elements
		 */
		public static double average(int[] array)
		{
			//Returns the average of elements in array as a double variable
			return (double) sum(array) / array.length;
			
		}
		
	

}
