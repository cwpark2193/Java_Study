package Q12;

public class Food {
	private double calories;
	private int price;
	private double weight;
	public Food(double calories, int price, double weight) {
		this.calories = calories;
		this.price = price;
		this.weight = weight;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
