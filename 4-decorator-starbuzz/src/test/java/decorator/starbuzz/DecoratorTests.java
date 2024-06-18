package decorator.starbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class DecoratorTests {
    @Test
    public void testDecoratorPrice() {
        Beverage product = new Espresso(Size.Medium);
        product = new Soy(product);
        assertThat(product.cost()).isEqualTo(2.14);
    }
    @Test
    public void testDecoratorDescription() {
        Beverage product = new Espresso(Size.Medium);
        product = new Soy(product);
        assertThat(product.getDescription()).isEqualTo("Espresso, Soy");
    }
    @Test
    public void testDecoratorDoubleMochaSoyLatteWhip() {
        Beverage product = new HouseBlend(Size.Medium);
        product = new Soy(product);
        product = new Mocha(product);
        product = new Mocha(product);
        product = new Whip(product);
        assertThat(product.getDescription()).isEqualTo("House Blend Coffee, Soy, Mocha, Mocha, Whip");
    }
    @Test
    public void testCustomOrder() {
        Beverage product = new ChocoMilk(Size.Medium);
        product = new Sugar(product);
        assertThat(product.getDescription()).isEqualTo("Choco Milk, Sugar");
        assertThat(product.cost()).isEqualTo(1.10);
    }
    @Test
    public void testSizes() {
        Beverage productMedium = new Espresso(Size.Medium);
        productMedium = new Soy(productMedium);
        Beverage productLarge = new Espresso(Size.Large);
        productLarge = new Soy(productLarge);
        assertThat(productLarge.cost()).isGreaterThan(productMedium.cost());

        Beverage productSmall = new Espresso(Size.Small);
        productSmall = new Soy(productSmall);
        assertThat(productSmall.cost()).isLessThan(productMedium.cost());
    }
    @Test
    public void testSizesPrices() {
        Beverage product = new Espresso(Size.Large);
        product = new Soy(product);
        product = new Soy(product);
        product = new Mocha(product);
        product = new Sugar(product);
        assertThat(product.cost()).isEqualTo(2.89);
    }
}
