package characters;

import observers.ChangeWeaponObserver;
import weapons.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FighterTests {
    @Test
    public void createCharacter() {
        Fighter fighter = new Knight("Test");
        assertThat(fighter.getWeapon()).isInstanceOf(Sword.class);
        assertThat(fighter.attack()).isEqualTo(40);
    }
    @Test
    public void addInvalidDelimiterInvalidFormat() {
        Knight knight1 = new Knight("Test");
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    knight1.setWeapon(new FlameThrower());
                });
        assertThat(exception.getMessage().equals("Fighter can't have that weapon"));
    }
    public void changeValidWeapon() {
        Archer archer = new Archer("Test");
        Sniper sniper = new Sniper();
        ChangeWeaponObserver changeWeaponObserver = new ChangeWeaponObserver();
        archer.setWeapon(sniper);
        assertThat(archer.getWeapon()).isEqualTo(sniper);
    }
}
