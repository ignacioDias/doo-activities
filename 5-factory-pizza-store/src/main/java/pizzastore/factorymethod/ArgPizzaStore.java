package pizzastore.factorymethod;

public class ArgPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new MuzzarellaPizza();
            case "tropical" -> new TropicalPizza();
            case "ham" -> new HamPizza();
            default -> null;
        };
    }
}
