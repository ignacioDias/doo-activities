package pizzastore.factorymethod;

public class TropicalPizza extends Pizza {
    public TropicalPizza() {
        name = "Tropical Pizza";
        dough = "Thin crust";
        sauce = "Red sauce";
        toppings.add("Pineapple");
        toppings.add("Ham");
    }
}
