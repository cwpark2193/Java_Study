package Q12;

public class Melon extends Food{
	private String place;
	
	public Melon() {
		super(0.0, 0, 0.0);
		this.place=null;
	}
	public Melon(double calories, int price, double weight, String place) {
		super(calories, price, weight);
		this.place = place;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Melon [calories=" + getCalories() + ", price ="+getPrice()+", weight = "+getWeight()+", place = "+place+"]";
	}
	
}
