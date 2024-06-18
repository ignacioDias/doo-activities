package pizzastore.abstractfactory;

public class ArgPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggies() {
        return new Veggies[]{};
    }
    public Pepperoni createPepperoni() {
        return new Ham();
    }
    public Clams createClam() {
        return new FrozenClams();
    }
}
