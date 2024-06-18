package pizzastore.factorymethod;

public class MuzzarellaPizza extends Pizza {
    public MuzzarellaPizza() {
        name = "Muzzarella Pizza";
        dough = "Thin crust";
        sauce = "Red sauce";
        toppings.add("Muzzarella cheese");
        toppings.add("Oregano");
    }
}
