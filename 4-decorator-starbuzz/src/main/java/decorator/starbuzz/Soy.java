package decorator.starbuzz;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if(size == Size.Large)
			return cost + 0.20;
		if(size == Size.Medium)
			return .15 + cost;
		return .10 + cost;
	}
}
