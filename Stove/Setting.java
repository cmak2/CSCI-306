package src;

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
	
	public String toString(){
		return heatSetting;
	}
	
	private String heatSetting;
}
