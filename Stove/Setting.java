

/*
 * Names:
 * Calvin Mak
 * Jacob McBee
 * Date:
 * 1/30/2018
 */

public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	
	Setting(String initSetting){
		heatSetting = initSetting;
	}

	public String getHeatSetting() {
		return heatSetting;
	}

	public void setHeatSetting(String heatSetting) {
		this.heatSetting = heatSetting;
	}
	
	public void display() {
		
		System.out.print("Setting: [" + this.toString() + "] ");
	}
	
	public String toString(){
		return heatSetting;
	}
	
	private String heatSetting;
}
