package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
 * Responds to interaction with fishing button
 */

public class FishingButtonListener implements ActionListener
{
	//FishingButtonListener HAS-A model
	//Model
	GoneFishingModel goneFishingModel;
	
	//FishingButtonListener HAS-A view
	//View
	GoneFishingView goneFishingView;
	
	//FishingButtonListener HAS-A button
	//Interactive Button
	FishingButton fishingButton;
	

	/**
	 * Constructor for FishingButtonListener
	 * @param goneFishingModel
	 * @param goneFishingView
	 * @param fishingButton
	 */
	public FishingButtonListener(GoneFishingModel goneFishingModel, GoneFishingView goneFishingView,
			FishingButton fishingButton)
	{
		this.goneFishingModel = goneFishingModel;
		this.goneFishingView = goneFishingView;
		this.fishingButton = fishingButton;
		
		
	}


	//What runs when button is clicked
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		//Number of tries goes down
		//Look at Model class and look for method that deals with fishing at given row
		//and column. Model itself will update data based on given try
		if(goneFishingModel.fishAt(fishingButton.getRow(), fishingButton.getColumn()))
		{
			fishingButton.setText("Fish");
		}
		else
		{
			fishingButton.setText("X");
		}
		
		//Story #10: I cannot clicked this button again
		//Its been used
		fishingButton.setEnabled(false);
		
		//Updates UI of GUI; updates number of tries and fish left
		goneFishingView.updateUI();
	}


	

}
