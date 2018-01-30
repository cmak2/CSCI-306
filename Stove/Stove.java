import java.util.ArrayList;

/**
 * Stove class. 
 *  
 * @author Mark Baldwin
 * @author Cyndi Rader
 * 
 * Purpose: Simulates a stove
 */
public class Stove {
	// Our stove will have 4 burners
	public final static int NUM_BURNERS = 4;
	private ArrayList<Burner> burners; 
	
	/** 
	 * Constructor for the stove
	 * Set up the burners
	 */
	public Stove() 
	{
		burners = new ArrayList<Burner>();	
		for (int i=0; i<NUM_BURNERS; i++)
			burners.add(new Burner());
	}
	
	/**
	 * Display the current stove status
	 *  
	 **** You must write the following method ****
	 */
	public void displayStove() {

	}
	
	/**
	 * Model various burner actions by trunign up
	 */
	public void turnBurnersUp() {
		// Press the + button 3 times, burner 0 now HIGH
		burners.get(0).plusButton();
		burners.get(0).plusButton();
		burners.get(0).plusButton();
		// Press the + button 2 times, burner 1 now MEDIUM
		burners.get(1).plusButton();
		burners.get(1).plusButton();
		// Press the + button 1 time, burner 2 now LOW
		burners.get(2).plusButton();
		// Burner 3 should remain OFF
	}
	
	/**
	 * test adjusting the burners
	 */
	public void adjustBurners() {
		// Burner 0 is already HIGH, ensure it stays at high
		burners.get(0).plusButton();
		// Increase burner 1 to HIGH
		burners.get(1).plusButton();
		// Decrease burner 2 to OFF
		burners.get(2).minusButton();	
	}
	
	/**
	 * some more burner adjustments
	 */
	public void moreBurnerAdjustments() {
		// Decrease burner 0 and burner 1 to MEDIUM
		burners.get(0).minusButton();
		burners.get(1).minusButton();
		// Increase burner 3 to LOW
		burners.get(3).plusButton();
	}	
	
	/**
	 * Simulate passage of time
	 * 
	 * @param numMinutes  Number of minutes to move forward
	 */
	public void timePassing(int numMinutes) {
		// Each loop simulates one time unit (e.g., minute)
		for (int i=0; i<numMinutes; i++)
			for (Burner burner : burners)
				burner.updateTemperature();
	}
	
	/**
	 * Main driver for simulation
	 * @param args Unused
	 */
	public static void main(String[] args) {
		Stove stove = new Stove();
		System.out.println("Beginning stove state ");
		stove.displayStove();
		stove.turnBurnersUp();
		stove.timePassing(6);
		System.out.println("\nStove after burners turned up ");
		stove.displayStove();
		stove.adjustBurners();
		stove.timePassing(2);
		System.out.println("\nStove after burners adjusted ");
		stove.displayStove();
		stove.moreBurnerAdjustments();
		stove.timePassing(1);
		// Ensure temperatures don't update til time has passed
		System.out.println("\nStove waiting for time to elapse ");
		stove.displayStove();
		stove.timePassing(1);
		System.out.println("\nStove in final state ");
		stove.displayStove();	
	}

}
