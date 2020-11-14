package cas2xb3_A2_patkunasingam_AP;

public class Restaurant {
	private final float rlongtitude; 
	private final float rlatitude;
	private final String restName;
	private final String restCity;
	
	public Restaurant(float rlongtitude, float rlatitude, String restName, String restCity) {
		this.rlongtitude = rlongtitude;
		this.rlatitude = rlatitude;
		this.restName = restName;
		this.restCity = restCity; 
	}
	
	public final float getrlongtitude() {
		return rlongtitude; 
	}
	
	public final float getrlatitude() {
		return rlatitude;
	}
	
	public final String getrestName() {
		return restName;
	}
	
	public final String getrestCity() {
		return restCity;
	}
}
