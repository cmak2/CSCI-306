
public class Burner {
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
