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
				if(this.myTemperature == Temperature.WARM) {
					this.myTemperature = Temperature.COLD;
				} else if(this.myTemperature == Temperature.HOT) {
					this.myTemperature = Temperature.WARM;
				} else if(this.myTemperature == Temperature.BLAZING) {
					this.myTemperature = Temperature.HOT;
				}
				break;
			case LOW:
				if(this.myTemperature == Temperature.COLD) {
					this.myTemperature = Temperature.WARM;
				} else if(this.myTemperature == Temperature.HOT) {
					this.myTemperature = Temperature.WARM;
				} else if(this.myTemperature == Temperature.BLAZING) {
					this.myTemperature = Temperature.HOT;
				}
				break;

			case MEDIUM:
				if(this.myTemperature == Temperature.COLD) {
					this.myTemperature = Temperature.WARM;
				} else if(this.myTemperature == Temperature.WARM) {
					this.myTemperature = Temperature.HOT;
				} else if(this.myTemperature == Temperature.BLAZING) {
					this.myTemperature = Temperature.HOT;
				}
				break;

			case HIGH:
				if(this.myTemperature == Temperature.COLD) {
					this.myTemperature = Temperature.WARM;
				} else if(this.myTemperature == Temperature.WARM) {
					this.myTemperature = Temperature.HOT;
				} else if(this.myTemperature == Temperature.HOT) {
					this.myTemperature = Temperature.BLAZING;
				}
				break;

			}
		}
	}
	
	public void display() {
		mySetting.display();
		System.out.println("State: " + getMyTemperature());
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
