package starbuzz;

public class Espresso extends Beverage {
  
	public Espresso(Size size) {
		this.size = size;
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

