package starbuzz;

public class HouseBlend extends Beverage {
	public HouseBlend(Size size) {
		this.size = size;
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

