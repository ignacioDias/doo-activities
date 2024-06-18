package simulator;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class DuckTests {
    @Test
    public void testDuck() {
        ModelDuck modelDuck = new ModelDuck();
        ModelDuck modelDuck2 = new ModelDuck();

        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck2.performFly();
        modelDuck2.performQuack();

        FlyRocketPowered nowItFlies = new FlyRocketPowered();
        QuackByAudio quackByAudio = new QuackByAudio();
        modelDuck.setFlyBehavior(nowItFlies);
        modelDuck.setQuackBehavior(quackByAudio);

        modelDuck.performFly();
        modelDuck.performQuack();

        assertThat(modelDuck).isNotSameAs(modelDuck2);
    }
    @Test
    public void testDucksFlock() {
        ModelDuck modelDuck = new ModelDuck();
        ModelDuck modelDuck2 = new ModelDuck();
        MandarinDuck mandarinDuck = new MandarinDuck();
        MallardDuck mallardDuck = new MallardDuck();

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(mandarinDuck);
        ducks.add(mallardDuck);
        ducks.add(modelDuck);
        ducks.add(modelDuck2);

        DucksFlock flock = new DucksFlock(ducks);
        assertThat(flock.cantDucks()).isEqualTo(4);
        assertThat(flock.getDuck(0)).isEqualTo(mandarinDuck);
        assertThat(flock.getDuck(1)).isEqualTo(mallardDuck);
        assertThat(flock.getDuck(2)).isEqualTo(modelDuck);
        assertThat(flock.getDuck(3)).isEqualTo(modelDuck2);
    }

@Test
public void testDucksFlock() {
    ModelDuck modelDuck = new ModelDuck();
    ModelDuck modelDuck2 = new ModelDuck();
    MandarinDuck mandarinDuck = new MandarinDuck();
    MallardDuck mallardDuck = new MallardDuck();

    List<Duck> ducks = new ArrayList<>();
    ducks.add(mandarinDuck);
    ducks.add(mallardDuck);
    ducks.add(modelDuck);
    ducks.add(modelDuck2);

    DucksFlock flock = new DucksFlock(ducks);

    flock.performFly();
    flock.performQuack();

    }


}
