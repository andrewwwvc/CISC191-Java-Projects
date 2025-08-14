package cisc191.sdmesa.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;

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
 * GUI for GoneFishing game includes game grid, instructions, slider for number of tries and fish left
 */

public class GoneFishingView extends JFrame
{
	//GoneFishingView HAS-A model
	GoneFishingModel goneFishingModel;
	
	//GoneFishingView HAS-A triesSlider
	JSlider triesSlider;
	
	//GoneFishingView HAS-A fishSlider
	JSlider fishSlider;

	/**
	 * Constructor for GoneFishingView GUI
	 * @param model
	 */
	public GoneFishingView(GoneFishingModel model)
	{
		//sets goneFishingModel as given model
		goneFishingModel = model;
		
		//Sets the view with borderLayout
		this.setLayout(new BorderLayout());
		
		//Sets size of GUI
		this.setMinimumSize(new Dimension(600, 400));
		
		//Sets title of GUI
		setTitle("Gone Fishing");
		
		//############ Instructions ###############
		//Add Panel to hold instructions
		JPanel instructionPanel = new JPanel();
		//Add label to hold instructions on West side
		JLabel instructions = new JLabel("Click on the buttons to fish");
		//Add component
		instructionPanel.add(instructions);
		//Add the panel to the JFrame
		add(instructionPanel, BorderLayout.WEST);
		
		//############ Programmer Name ##############
		//Add panel to hold programmer name
		JPanel programmer = new JPanel();
		//Add label for programmer name on South side
		JLabel programmerName = new JLabel("Programmed by: Andrew Castro");
		//Add programmerName to panel that holds programmer name
		programmer.add(programmerName);
		//Add panel to the JFrame South
		add(programmer, BorderLayout.SOUTH);
		
		//############ Game Grid ####################
		//PANEL TO HOLD GRID
		//Create a JPanel to store our grid
		JPanel mainPanel = new JPanel();
		
		//Add a layout manager called GridLayout to the JPanel
		//new GridLayout(numRows, numColumns)
		// 1)Create a 6x6
		GridLayout fishingLayout = new GridLayout(GoneFishingModel.DIMENSION, GoneFishingModel.DIMENSION);
		
		// 1.5) Set the layout manager to use the grid you created
		mainPanel.setLayout(fishingLayout);
		
		//Create and add 6x6 grid of FishingButtons
		for(int row = 0; row < GoneFishingModel.DIMENSION; row++)
		{
			for(int column = 0; column < GoneFishingModel.DIMENSION; column++)
			{
				//Create a FishingButton and use the control variables
				//of the for loops for the constructor's actual params.
				FishingButton button = new FishingButton(row,column);
				
				button.addActionListener(new FishingButtonListener(model, this, button));
				
				// 2) Add to the panel
				mainPanel.add(button);
			}
		}
		
		// 3) Add to the JFrame's center location
		add(mainPanel, BorderLayout.CENTER);
		
		
		//############# Sliders Panel ##############
		//Create a JPanel to hold sliders
		JPanel sliderPanel = new JPanel();
		
		//SLIDER FOR TRIES
		//Add a slider for tries
		//J.Slider.VERTICAL sets orientation of slider
		triesSlider = new JSlider(JSlider.VERTICAL);
		//Sets increments of ticks
		triesSlider.setMajorTickSpacing(10);
		//Sets maximum number on slider
		triesSlider.setMaximum(30);
		//Sets minimum number on slider
		triesSlider.setMinimum(0);
		//Shows the ticks
		triesSlider.setPaintTicks(true);
		//Shows increment numbers
		triesSlider.setPaintLabels(true);
		//Sets title of slider
		triesSlider.setBorder(BorderFactory.createTitledBorder("Tries"));
		//Disables ability to move slider (Display only)
		triesSlider.setEnabled(false);
		
		//Adds triesSlider to panel
		sliderPanel.add(triesSlider);
		
		
		//SLIDER FOR FISH
		//Add a slider for fish with 
		//J.Slider.VERTICAL sets orientation of slider
		fishSlider = new JSlider(JSlider.VERTICAL);
		//Sets increments of ticks
		fishSlider.setMajorTickSpacing(5);
		//Sets maximum number on slider
		fishSlider.setMaximum(10);
		//Sets minimum number on slider
		fishSlider.setMinimum(0);
		//Shows ticks
		fishSlider.setPaintTicks(true);
		//Shows increment numbers
		fishSlider.setPaintLabels(true);
		//Sets title of slider
		fishSlider.setBorder(BorderFactory.createTitledBorder("Fish"));
		//Disables ability to move slider (Display only)
		fishSlider.setEnabled(false);
		
		
		//Adds fishSlider to panel
		sliderPanel.add(fishSlider);
		
		//Adds sliderPanel that holds tries and fish slider to East side
		add(sliderPanel, BorderLayout.EAST);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		new GoneFishingView(new GoneFishingModel());
	}

	/**
	 * Updates the UI with tries and fish slider and creates pop up message at end of game
	 */
	public void updateUI()
	{
		//Updates the tries slider and tells user how many tries left
		triesSlider.setValue(goneFishingModel.getTriesRemaining());
		
		//Updayes the fish slider and tells user how many fish are left
		fishSlider.setValue(goneFishingModel.getFishRemaining());
		
		//If user runs out of tries but still has fish remaining: user losers
		if(goneFishingModel.getTriesRemaining() == 0 && goneFishingModel.getFishRemaining() !=0)
		{
			JOptionPane.showMessageDialog(this,"Game Over - Fishes win!");
			System.exit(0);
		}
		//If user catches all fish: user wins
		if(goneFishingModel.getFishRemaining() == 0)
		{
			JOptionPane.showMessageDialog(this, "Game Over - You win!");
			System.exit(0);
		}
	}
}
