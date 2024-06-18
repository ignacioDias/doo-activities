package gems;
import org.junit.jupiter.api.Test;
import weapons.Bow;
import weapons.Sword;
import weapons.Weapon;
import weapons.gem.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GemTests {
    @Test
    public void testGem() {
        Sword sword = new Sword();
        Gem esmeraldSword = new Emerald(sword);
        assertThat(esmeraldSword.hit()).isGreaterThan(sword.hit());
        assertThat(esmeraldSword.hit()).isEqualTo(sword.hit() + 10);
    }
    @Test
    public void testInvalidGem() {
        Bow bow = new Bow();
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    Emerald esmerald = new Emerald(bow);
                });
        assertThat(exception.getMessage().equals("Incorrect fightStyle"));
    }
    @Test
    public void testInvalidGemsSlots() {
        Weapon weapon = new Sword();
        weapon = new Emerald(weapon);
        weapon = new Emerald(weapon);
        Weapon finalWeapon = weapon; //Test no me deja referenciar (?
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    Emerald emerald = new Emerald(finalWeapon);
                });
        assertThat(exception.getMessage().equals("No more gems slots"));
    }
    @Test
    public void testMultipleGems() {
        Weapon weapon = new Sword();
        weapon = new Emerald(weapon);
        weapon = new Emerald(weapon);
        assertThat(weapon.hit()).isEqualTo(60);
    }
}
