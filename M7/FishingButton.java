package cisc191.sdmesa.edu;

import javax.swing.JButton;

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
 * Version/date: 1.0 10/22/23
 * 
 * Responsibilities of class:
 * Holds properties for Fishing Button; sets button with row and column, gets row and column
 * 
 */

public class FishingButton extends JButton
{
	//A FishingButton HAS-A row
	private int row;
	//A FishingButton HAS-A column
	private int column;

	/**
	 * @param row
	 * @param column
	 */
	public FishingButton(int row, int column)
	{
		//Sets button at given row and column ans sets text as ?
		this.row = row;
		this.column = column;
		setText("?");
	}

	public int getRow()
	{
		return row;
	}
	
	public int getColumn()
	{
		return column;
	}
}
