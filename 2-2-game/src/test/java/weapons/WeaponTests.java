package weapons;
import fightstyles.FightStyle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class WeaponTests {
    @Test
    public void testDamageSword() {
        Weapon sword = new Sword();
        assertThat(sword.hit()).isEqualTo(40);
        assertThat(sword.getFightStyle()).isEqualTo(FightStyle.CLOSE_RANGE);
    }

    @Test
    public void testDamageBow() {
        Weapon sword = new Bow();
        assertThat(sword.hit()).isEqualTo(10);
        assertThat(sword.getFightStyle()).isEqualTo(FightStyle.DISTANCE);
    }


}
