package weapons.gem;

import fightstyles.FightStyle;
import weapons.Weapon;

public class Emerald extends Gem {
    private Weapon weapon;

    public Emerald(Weapon weapon) {
        validWeapon(weapon);
        this.weapon = weapon;
        this.setMaxGems(weapon.getMaxGems() - 1);
        this.setFightStyle(weapon.getFightStyle());
    }
    private void validWeapon(Weapon weapon) {
        if(weapon.getMaxGems() == 0)
            throw new IllegalArgumentException("No more gems slots");
        if(weapon.getFightStyle() != FightStyle.CLOSE_RANGE)
            throw new IllegalArgumentException("This doesn't have the same fight style");
    }
    public int hit() {
        return 10 + weapon.hit();
    }
}
