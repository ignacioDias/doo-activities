package decorator.starbuzz;

public class ChocoMilk extends Beverage{

    public ChocoMilk(Size size) {
        description = "Choco Milk";
        this.size = size;
    }

    public double cost() {
        return 1.00;
    }
}
