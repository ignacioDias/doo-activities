package starbuzz;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		double cost = beverage.cost();
		if(size == Size.Large)
			return cost + 0.30;
		if(size == Size.Small)
			return cost + 0.20;
		return .20 + cost;
	}
}
