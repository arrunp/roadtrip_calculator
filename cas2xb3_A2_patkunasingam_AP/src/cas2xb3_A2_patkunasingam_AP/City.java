package cas2xb3_A2_patkunasingam_AP;

public class City {
	
	private float clongtitude;
	private float clatitude;
	private String cityName;

	public City(float clongtitude, float clatitude, String cityName) {
		this.clongtitude = clongtitude;
		this.clatitude = clatitude;
		this.cityName = cityName;
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

}
