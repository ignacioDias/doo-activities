package starbuzz;

public class Decaf extends Beverage {
	public Decaf(Size size) {
		this.size = size;
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

