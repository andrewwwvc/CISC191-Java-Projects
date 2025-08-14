import java.awt.Color;

public class Logic 
{
	
	/**
	 * Alters the picture so that each pixel's blue channel has been zeroed out.
	 * All other channels remain the same 
	 * @param picture the image to be altered
	 */
	public static void zeroBlue(DigitalPicture picture) 
	{
		//grab the 2S array of pixel object representation of the image
		Pixel[][] pixel2D = picture.getPixels2D();
		
		//2D array traversal
		for (int r = 0; r < pixel2D.length; r++) 
		{
			for (int c = 0; c < pixel2D[r].length; c++) 
			{
				pixel2D[r][c].setBlue(0);				
			}
		}
		
		
	}
	
	
	/**
	 * Alters the picture so that it is black and white by setting each pixels color value to be the average
	 * of the pixels red, green, and blue channel. 
	 * @param picture,  the image to be altered
	 */
	public static void blackAndWhite(DigitalPicture picture) 
	{
		//grab the 2d array of pixel from picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		//nested loop to visit every element in 2d array
		for (int r = 0; r < pixel2D.length; r++)
		{
			for(int c = 0; c < pixel2D[r].length; c++)
			{
				//find the sum of red, green, blue values of each pixel
				
				int red = pixel2D[r][c].getRed();
				int green = pixel2D[r][c].getGreen();
				int blue = pixel2D[r][c].getBlue();
				
				//Average them
				int average = (red + green + blue) / 3;
				
				//set value for red, green, blue to average
				pixel2D[r][c].setRed(average);
				pixel2D[r][c].setGreen(average);
				pixel2D[r][c].setBlue(average);
			}
		}
		
	}
	
	/**
	 * Alters the picture so that it is negative by setting each pixels color subtracted from 255
	 * of the pixels red, green, and blue channel. 
	 * @param picture,  the image to be altered
	 */
	
	
	public static void negative(DigitalPicture picture)
	{
		//grab the 2d array of pixel from picture
		Pixel[][] pixel2D = picture.getPixels2D();
				
		//nested loop to visit every element in 2d array
		for (int r = 0; r < pixel2D.length; r++)
		{
			for(int c = 0; c < pixel2D[r].length; c++)
			{
				//Implement 'negative' change to pixels
				pixel2D[r][c].setRed(255 - pixel2D[r][c].getRed());
				pixel2D[r][c].setGreen(255 - pixel2D[r][c].getGreen());
				pixel2D[r][c].setBlue(255 - pixel2D[r][c].getBlue());
			}
		}
	}
	
	/**
	 * Alters the picture so that it is sunset colored by setting each pixels color multiplied by given red intensity and green and blue intensity
	 * of the pixels red, green, and blue channel. 
	 * @param picture,  the image to be altered, redIntensity, greenBlueIntensity, multipliers to color of the pixel
	 */
	
	public static void makeSunset(DigitalPicture picture, double redIntensity, double greenBlueIntensity)
	{
		//grab the 2d array of pixel from picture
		Pixel[][] pixel2D = picture.getPixels2D();
				
		//nested loop to visit every element in 2d array
		for (int r = 0; r < pixel2D.length; r++)
		{
			for(int c = 0; c < pixel2D[r].length; c++)
			{
				//Gets RGB of pixel
				int red = pixel2D[r][c].getRed();
				int green = pixel2D[r][c].getGreen();
				int blue = pixel2D[r][c].getBlue();
				
				//Multiplies pixel color by given intensity respective to each color
				int enhancedRed = (int) (red * redIntensity);
				int enhancedGreen = (int) (green * greenBlueIntensity);
				int enhancedBlue = (int) (blue * greenBlueIntensity);
				
				//If each enhanced color is greater than 255, color is set to 255 
				//otherwise set to new color
				
				if (enhancedRed > 255)
				{
					pixel2D[r][c].setRed(255);
				}
				else
				{
					pixel2D[r][c].setRed(enhancedRed);
				}
				if (enhancedGreen > 255)
				{
					pixel2D[r][c].setGreen(255);
				}
				else
				{
					pixel2D[r][c].setGreen(enhancedGreen);
				}
				if(enhancedBlue > 255)
				{
					pixel2D[r][c].setBlue(255);
				}
				else
				{
					pixel2D[r][c].setBlue(enhancedBlue);
				}
			}
		}
	}
	
	
	/**
	 * Alters the picture so that it is mirrored horizontally by setting each pixels color value to be the opposite pixels color in each row
	 *
	 * @param picture,  the image to be altered
	 */
	
	public static void mirrorHorizontal(DigitalPicture picture)
	{
		//grab the 2d array of pixel from picture
		Pixel[][] pixel2D = picture.getPixels2D();
				
		//nested loop to visit half element in 2d array
		for (int r = 0; r < pixel2D.length; r++)
		{
			for(int c = 0; c < pixel2D[r].length/2; c++)
			{
				//Holds color of pixel from picture
				Color temp = pixel2D[r][c].getColor();
				//Grabs pixel starting at end of row
				int c2 = pixel2D[r].length - 1 - c;
				
				//Sets pixel from end of row to beginning
				pixel2D[r][c].setColor(pixel2D[r][c2].getColor());
				//Sets pixel at end as the color of pixel from beginning of row
				pixel2D[r][c2].setColor(temp);
				
			}
		}
	}
	
	/**
	 * Alters the picture so that it is mirrored vertically by setting each pixels color value to be the opposite pixels color in each column
	 * 
	 * @param picture,  the image to be altered
	 */
	
	public static void mirrorVertical(DigitalPicture picture)
	{
		//Grabs the 2d array of pixel from picture
		Pixel[][] pixel2D = picture.getPixels2D();
		
		//nested loop to visit half elements in 2D array so it is mirrored
		for (int r = 0; r < pixel2D.length/2; r++)
		{
			for(int c = 0; c < pixel2D[r].length; c++)
			{
				//Swap algorithm
				Color temp = pixel2D[r][c].getColor();
				int r2 = pixel2D.length  - 1 - r;
				
				pixel2D[r][c].setColor(pixel2D[r2][c].getColor());
				
				pixel2D[r2][c].setColor(temp);
				
			}
		}
	}
	
	/**
	 * Alters the picture so that it is blurred by adding the pixels red, green and blue channel of 
	 * a 2x2 window and blurring it starting
	 * from the top most row and column
	 *
	 * @param picture,  the image to be altered
	 */
	
	public static void blur(DigitalPicture picture)
	{
		//Grabs 2D array of pixels from array
		Pixel[][] pixel2D = picture.getPixels2D();
		
		//Traverse through 2D array
		for (int r = 0; r < pixel2D.length-1; r++)
		{
			for (int c = 0; c < pixel2D[r].length-1; c++)
			{
				//Adds the sum of each color in a 2x2 window
				int red = (pixel2D[r][c].getRed()) + (pixel2D[r+1][c].getRed()) + (pixel2D[r+1][c+1].getRed()) + (pixel2D[r][c+1].getRed());
				int green = pixel2D[r][c].getGreen() + (pixel2D[r+1][c].getGreen()) + (pixel2D[r+1][c+1].getGreen()) + (pixel2D[r][c+1].getGreen());
				int blue = (pixel2D[r][c].getBlue()) + (pixel2D[r+1][c].getBlue()) + (pixel2D[r+1][c+1].getBlue()) + (pixel2D[r][c+1].getBlue());
				
				//Takes sum and divides by 4
				int redBlur = red/4;
				int greenBlur = green/4;
				int blueBlur = blue/4;
				
				//Start of blur from top most row and left most column
				pixel2D[0][0].setRed(redBlur);
				pixel2D[0][0].setGreen(greenBlur);
				pixel2D[0][0].setBlue(blueBlur);
				
				//Continues to blur rest of image 
				pixel2D[r][c].setRed(redBlur);
				pixel2D[r][c].setGreen(greenBlur);
				pixel2D[r][c].setBlue(blueBlur);
			}
		}	
	}
}
