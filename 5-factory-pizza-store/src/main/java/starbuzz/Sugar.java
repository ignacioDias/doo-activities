package starbuzz;

public class Sugar extends CondimentDecorator {
    Beverage beverage;
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }
    public double cost() {
        double cost = beverage.cost();
        if(size == Size.Large)
            return cost + .20;
        if(size == Size.Medium)
            return cost + .10;
        return cost + .5;
    }
}
