package edu.sdmesa.cisc191;


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
 * Version/date: 1.0 9/5/2023
 * 
 * Responsibilities of class:
 * array utilities
 */
/**
 */
public class M2ArrayChallenge
{
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @param array to search
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(int[] array, int value)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == value)
			{
				return true;
			}
		}
		return false;
	}
	
	// Use this template for the methods
	/**
	 * Purpose:Find a given value in the array given
	 * 
	 * @param array to search
	 * @return index
	 */
	public static int find(int[] array, int value)
	{
		//Traverse the array
		for(int i = 0; i < array.length; i++)
		{
			//Compare each element with value
			if(array[i] == value)
			{
				//Returns the index
				return i;
			}
		}
		//Not found, return -1
		return -1;
	}
	
	// Use this template for the methods
		/**
		 * Purpose: Count times letter shows up in char array
		 * 
		 * @param array to search, letter to count
		 * @return count
		 */
	public static int countValues(char[] array, char letter) 
	{
			// Init a count variable
			int count = 0;

			// Traverse the array
			for (int i = 0; i < array.length; i++) 
			{
				if (array[i] == letter) 
				{
					count++;
				}
			}
			// Returns total count
			return count;
	}
	// Use this template for the methods
		/*
		 * Purpose: Check if array is in numerical order
		 * 
		 * @param array to search
		 * @return true
		 */
	public static boolean inOrder(int[] array)
	{
		//Traverse the array
		for(int i = 0; i < array.length - 1; i++)
		{
			//Check if a consecutive pair is out of order
			if(array[i] > array[i+1])
			{
				return false;
			}
		}
		//Returns true if array is in order
		return true;
	}
	
	// Use this template for the methods
		/**
		 * Purpose: Swap given element in index with next element
		 * 
		 * @param array to search
		 * @return 
		 */
	public static int[] swap(int[] array, int index)
	{
		//swapping algorithm
		int temp 		= array[index];
		array[index] 	= array[index+1];
		array[index+1]	= temp;
		
		//Return altered array
		return array;
	}

	// Use this template for the methods
		/**
		 * Purpose: Swap out of order elements	 
		 * 
		 *  
		 * @param array to sort
		 * @return array
		 */
	public static int[] bubbleUp(int[] array)
	{
		//Traverse the array
		for(int i = 0; i < array.length - 1; i++)
		{
			//swap out of order consecutive pairs
			if(array[i] > array[i+1])
			{
				swap(array, i);
			}
		}
		
		//Returns sorted array
		return array;
	}
	
	// Use this template for the methods
		/**
		 * Purpose: Sort the entire array in order
		 * 
		 * @param array to sort
		 * @return sorted array
		 * 			 
		 * 
		 * */
	public static int[] bubbleSort(int[] array)
	{
		//bubbleUp is used when array is not in order
		while(!inOrder(array))
		{
			//Swaps out of order consecutive pairs
			bubbleUp(array);
		}
		
		//Returns sorted array
		return array;
	}
	// Use this template for the methods
		/**
		 * Purpose: 
		 * 
		 * @param array to search
		 * @return 
		 */
	public static char[] copy(char[] array)
	{
		//Initialize a new array with same length as reference
		char[] copy = new char[array.length];
		
		//Inputs array values into new array
		for(int i =0; i < array.length;i++)
		{
			copy[i] = array[i];
		}
		
		//Returns copied array
		return copy;
	}

	// Use this template for the methods
		/**
		 * Purpose: Check if arrays have matching elements
		 * 
		 * @param array to search
		 * @return true
		 */
	public static boolean equals(char[] arrayA, char[] arrayB)
	{
		char[] array1 = copy(arrayA);
		char[] array2 = copy(arrayB);
		
		for(int i = 0; i < array1.length; i++)
		{
			if(array1[i] != array2[i])
			{
				return false;
			}
		}
		
		return true;
	}

	
	// Use this template for the methods
	/**
	 * Purpose: Check if arrays have matching elements
	 * 
	 * @param array to search
	 * @return true
	 */	
	public static char[] backwards(char[] array)
	{
		//Create new array same size as given array
		char[] backwardsArray = new char[array.length];
		
		//Traverse the array
		for(int i = 0; i < backwardsArray.length; i++)
		{
			//Inputs value from last index to first into new array
			backwardsArray[i] = array[array.length - 1 - i];
		}
		
		//Returns backwards array
		return backwardsArray;
	}
	
	
	
// Use this template for the methods
		/**
		 * Purpose: Check if character array is a palindrome
		 * 
		 * @param array to search
		 * @return true
		*/
	public static boolean isPalindrome(char[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] != array[array.length - i - 1])
			{
				return false;
			}
		}
		return true;
	}

	
// Use this template for the methods
		/**
		 * Purpose: Get element from 2D array
		 * 
		 * @param array to search			
		 *  @return element
		 */
	public static int getElement(int[][] array, int row, int column)
	{
		//Returns element from given row and column
		return array[row][column];
	}
	
// Use this template for the methods
	/**
	 * Purpose: 
	 * 
	 * @param array to search
	 * @return 
	 */
	public static int addRow(int[][]array, int row)
	{
		//Initialize sum variable
		int sum = 0;
		
		//Traverse the row
		for(int column = 0; column < array[row].length; column++)
		{
			sum+=array[row][column];
		}
		
		//Returns sum of row
		return sum;
	}
	
// Use this template for the methods
		/**
		 * Purpose: 
		 * 
		 * @param array to search
		 * @return 
		 */
	public static int addColumn(int[][]array, int column)
		{
			//Initialize sum variable
			int sum = 0;
			
			//Traverse the column
			for(int row = 0; row < array.length; row++)
			{
				sum+=array[row][column];
			}
			
			//Returns sum of row
			return sum;
		}
// Use this template for the methods
			/**
			 * Purpose: 
			 * 
			 * @param array to search
			 * @return 
			 */
	public static int addLeftToRightDiagonal(int[][] array)
	{
		//Initialize sum variable
		int sum = 0;
		
		//Traverse through matrix left to right diagonal
		for(int i = 0; i < array.length; i++)
		{
			sum+= array[i][i];
		}
		
		//Returns the sum of diagonal
		return sum;
	}
// Use this template for the methods
	/**
	 * Purpose: 
	 * 
	 * @param array to search
	 * @return 
	 */
	public static int addRightToLeftDiagonal(int[][] array)
	{
		//Initialize sum variable
		int sum = 0;
		
		//Traverses through matrix from Right to left diagonal
		for(int row = 0, column = array.length - 1; row < array.length; row++, column--)
		{
			sum += array[row][column];
		}
		
		//Return sum of diagonal
		return sum;
	}
// Use this template for the methods
	/**
	 * Purpose: 
	 * 
	 * @param array to search
	 * @return 
	 */
	public static int addLastRowElement(int[][]array)
	{
		//Initialize sum variable
		int sum = 0;
		
		//Traverse through Matrix
		for(int row = 0; row < array.length; row++)
		{
			//add the last element of each row to sum
			int lastIndex = array[row].length-1;
			sum+= array[row][lastIndex];
		}
		
		//Returns sum of last row element
		return sum;
	}

}
