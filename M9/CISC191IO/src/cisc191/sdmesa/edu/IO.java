package cisc191.sdmesa.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
* 
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
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0 11/2/2023
 * 
 * Responsibilities of class:
 * Read and Write into and from files with given results/info
 */
/**
 */
public class IO
{
	//Reads Files
	// Hint: close operations must happen in a finally clause.
	public static String readTestResults(String fileName)
	{
		//Create File object from the fileName
		File file = new File(fileName);
		
		Scanner scanner = null;
		
		//Create a Scanner object from the File object
		try
		{
			scanner = new Scanner(file);

			String result = "";
			
			//Read from scanner until it reaches the end
			while(scanner.hasNext())
			{
				//Concatenates to the existing result
				result += scanner.next();
			}
			
			//Closes scanner
			scanner.close();
			
			//Returns concatenated result
			return result;
		
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot write File. File will not be written.");
		}
		finally
		{
			if(scanner != null)
			{
				scanner.close();
			}
		}
		
		return "";
	}
	
	
	//Writes Files
	public static void startTestResults(String fileName, String testResults)
	{
		
		PrintWriter pWriter = null;
		
		try 
		{
			//Create PrintWriter object
			pWriter = new PrintWriter(fileName);
			
			//Write to file using println of a PrintWriter object
			pWriter.println(testResults);
			
			//Close writer
			pWriter.close();
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void appendTestResult(String fileName, String testResults)
	{
		//Creates PrintWriter Object
		PrintWriter pWriter = null;
		try
		{
			//Creates FileWriter Object and appends file (set to true)
			FileWriter fWriter = new FileWriter(new File(fileName), true);
			
			pWriter = new PrintWriter(fWriter);
			
			//Writes testResults to file
			pWriter.println(testResults);
			
			//Closes PrintWriter Object
			pWriter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot write File. File will not be written.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//Checks and closes PrintWriter Object
			if(pWriter != null)
			{
				pWriter.close();
			}
		}
	}
	
	public static String readDateTime(String link)
	{
		Scanner scnr = null;
		
		try
		{
			//Create URL object
			URL url = new URL(link);
			
			//Create Scanner object
			scnr = new Scanner(url.openStream());
			
			//Read in all lines into a String object/variable
			String result = "";
			
			//Reads in from URL/File
			while(scnr.hasNext())
			{
				result+= scnr.next();
			}
			
			//Use indexOf to find datetime in url
			int startLoc = result.indexOf("datetime");
			
			//Starts are desired place without chars in front
			String withoutFront = (result.substring(startLoc + 11));
			
			//Returns dateTime content from URL
			return withoutFront.substring(0, withoutFront.indexOf("7:00") + 4);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//Closes scanner
			if(scnr != null)
			{
				scnr.close();
			}
		}
		
		return "";
	}
}
