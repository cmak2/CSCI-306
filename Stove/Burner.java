/*
 * Names:
 * Calvin Mak
 * Jacob McBee
 * Date:
 * 1/30/2018
 */

public class Burner {
	
	Burner() {							//Initialize Burner Instructions
		this.myTemperature = Temperature.COLD;
		this.mySetting	   = Setting.OFF;
	}
	
	public void plusButton() {			//Will Increase Temperature
		switch(mySetting) {				//Need to set Timer in Button methods
		case OFF:
			this.mySetting = Setting.LOW;
			break;
		case LOW:
			this.mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			this.mySetting = Setting.HIGH;
			break;
		case HIGH:
			this.mySetting = Setting.HIGH;
		}
	}
	
	public void minusButton() {
		switch(mySetting) {
		case OFF:
			this.mySetting = Setting.OFF;
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			break;
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			break;
		}
	}
	
	public void updateTemperature() {
		timer++;
		if (timer % TIME_DURATION == 0) {
			switch(mySetting) {
			
			case OFF:
				switch(myTemperature){
				case WARM:
					myTemperature = Temperature.COLD;
					break;

				case HOT:
					myTemperature = Temperature.WARM;
					break;

				case BLAZING:
					myTemperature = Temperature.HOT;
					break;
				default:
					break;
				}
				break;
				
			case LOW:
				switch(myTemperature){
				case COLD:
					myTemperature = Temperature.WARM;
					break;
					
				case HOT:
					myTemperature = Temperature.WARM;
					break;
					
				case BLAZING:
					myTemperature = Temperature.HOT;
					break;
				default:
					break;
				}
				break;
				
			case MEDIUM:
				switch(myTemperature){
				case COLD:
					myTemperature = Temperature.WARM;
					break;
					
				case WARM:
					myTemperature = Temperature.HOT;
					break;
					
				case BLAZING:
					myTemperature = Temperature.HOT;
					break;
				default:
					break;
				}
				break;
				
			case HIGH:
				switch(myTemperature){
				case COLD:
					myTemperature = Temperature.WARM;
					break;
					
				case WARM:
					myTemperature = Temperature.HOT;
					break;
					
				case HOT:
					myTemperature = Temperature.BLAZING;
					break;
				default:
					break;
				}
				break;
			}
		}
	}
	
	public void display() {
		mySetting.display();
		System.out.println("State: " + getMyTemperature());
	}
	
	// Function for setting warning message
	
	public boolean setWarningMessage() {
		if(getMyTemperature() == Temperature.BLAZING)
			return true;
		
		return false;
	}
	public enum Temperature { BLAZING, HOT, WARM, COLD };

	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public void setMyTemperature(Temperature myTemperature) {
		this.myTemperature = myTemperature;
	}
	
	public final int TIME_DURATION = 2;
	private int timer = 0;
	private Setting mySetting;
	private Temperature myTemperature;
}
