package cas2xb3_A2_patkunasingam_AP;

public class NumbCity {
	
	private final String cityName; 
	private final int cityNum;
	private float clongtitude;
	private float clatitude;

	
	public NumbCity(String cityName, int cityNum, float clongtitude, float clatitude) {
		this.cityName = cityName;
		this.cityNum = cityNum;
		this.clongtitude = clongtitude;
		this.clatitude = clatitude;
	}
	
	public final float getclongtitude() {
		return clongtitude; 
	}
	
	public final float getclatitude() {
		return clatitude;
	}
	
	public final String getcityName() {
		return cityName;
	}
	
	public final int getcityNum() {
		return cityNum;
	}
	
	
}
