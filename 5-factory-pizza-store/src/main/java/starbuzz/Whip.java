package starbuzz;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		double cost = beverage.cost();
		if(size == Size.Large)
			return cost + .20;
		if(size == Size.Medium)
			return .10 + beverage.cost();
		return cost + .5;
	}
}
