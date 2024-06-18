package starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
  	Size size;
	public String getDescription() {
		return description;
	}
	public Size getSize() {
		return size;
	}
	public abstract double cost();
}
