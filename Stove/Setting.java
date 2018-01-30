package src;
import java.lang.*;

public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	
	private String heatSetting;
	
	Setting(String initSetting){
		heatSetting = initSetting;
	}

	public String getHeatSetting() {
		return heatSetting;
	}

	public void setHeatSetting(String heatSetting) {
		this.heatSetting = heatSetting;
	}
	
	
}
