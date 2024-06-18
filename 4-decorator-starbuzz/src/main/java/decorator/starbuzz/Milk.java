package decorator.starbuzz;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		double cost = beverage.cost();
		if(size == Size.Large)
			return cost + 0.20;
		if(size == Size.Small)
			return cost + 0.5;
		return cost + 0.10;
	}
}
