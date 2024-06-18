package pizzastore.abstractfactory;

public class ArgPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ArgPizzaIngredientFactory();
        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Mozzarella Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Ham Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Margherita Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Tropical Pizza");
            }
        }
        return pizza;
    }
}
