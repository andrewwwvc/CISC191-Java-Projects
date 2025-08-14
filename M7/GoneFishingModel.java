package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Tasha Frankie
 * @author Allan Schougaard
 * 
 * Responsibilities of class:
 * 
 * Model and track the non-visual game play
 */

import java.util.Random;


public class GoneFishingModel
{
	//GoneFishingModel HAS-A dimension
	public static int DIMENSION = 6;
	//GoneFishingModel HAS-A grid
	private boolean[][] grid = new boolean[DIMENSION][DIMENSION];
	//GoneFishingModel HAS-A number of tries remaining
	private int triesRemaining = 30;
	//GoneFishingModel HAS-A number of fish remaining
	private int fishRemaining = 10;

	/**
	 * Constructor for GoneFishingModel and sets fish at random place in grid
	 */
	public GoneFishingModel()
	{
		Random randomNumberGenerator = new Random();
		for (int fishCounter = 0; fishCounter < fishRemaining; fishCounter++)
		{
			int row, column;
			do
			{
				row = randomNumberGenerator.nextInt(DIMENSION);
				column = randomNumberGenerator.nextInt(DIMENSION);
			} while (grid[row][column]);
			grid[row][column] = true;
		}
	}

	/**
	 * Returns true if fish is found and updates tries and fish remaining
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean fishAt(int row, int column)
	{
		boolean foundFish = grid[row][column];
		triesRemaining--;
		if (foundFish)
		{
			fishRemaining--;
		}
		return foundFish;
	}

	/**
	 * Getter for tries remaining
	 * @return number of tries remaining
	 */
	public int getTriesRemaining()
	{
		return triesRemaining;
	}

	/**
	 * Getter for fish remaining
	 * @return number of fish remaining
	 */
	public int getFishRemaining()
	{
		return fishRemaining;
	}

	/**
	 * Returns true if user does not find all fish in given amount of tries
	 * @return true
	 */
	public boolean fishWin()
	{
		return triesRemaining == 0 && fishRemaining > 0;
	}

	/**
	 * Returns true if user finds all fish
	 * @return true
	 */
	public boolean playerWins()
	{
		return fishRemaining == 0;
	}
}
