package starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast(Size size) {
		this.size = size;
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

