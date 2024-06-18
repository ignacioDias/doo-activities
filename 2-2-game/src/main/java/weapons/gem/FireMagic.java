package weapons.gem;

import fightstyles.FightStyle;
import weapons.Weapon;

public class FireMagic extends Gem {
    private Weapon weapon;

    public FireMagic(Weapon weapon) {
        int gemsSlots = weapon.getMaxGems();
        if(gemsSlots == 0)
            throw new IllegalArgumentException("No more gems slots");
        if(weapon.getFightStyle() != FightStyle.DISTANCE)
            throw new IllegalArgumentException("This doesn't have the same fight style");
        this.setMaxGems(gemsSlots - 1);
        this.weapon = weapon;
        this.setFightStyle(weapon.getFightStyle());
    }
    public int hit() {
        return 20 + weapon.hit();
    }
}
