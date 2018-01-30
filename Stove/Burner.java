
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
		}
	}
	
	public void updateTemperature() {
		
	}
	
	public void display() {
		mySetting.toString();			//Will Fix later
	}
	
	public enum Temperature { BLAZING, HOT, WARM, COLD};

	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public void setMyTemperature(Temperature myTemperature) {
		this.myTemperature = myTemperature;
	}
	
	public final int TIME_DURATION = 2;
	private int timer;
	private Setting mySetting;
	private Temperature myTemperature;
}
