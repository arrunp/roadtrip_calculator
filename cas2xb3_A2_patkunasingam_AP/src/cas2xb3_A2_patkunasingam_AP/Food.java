package cas2xb3_A2_patkunasingam_AP;

public class Food {

	//name of the restaurant
	private final String restName; 
	private final String meal;
	private final double price;
	
	public Food(String restName, String meal, double price) {
		this.restName = restName;
		this.meal = meal;
		this.price = price; 
	}
	
	public final String getrestName() {
		return restName; 
	}
	
	public final String getmeal() {
		return meal;
	}
	
	public final double getprice() {
		return price;
	}

}
