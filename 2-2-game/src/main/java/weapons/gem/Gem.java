package weapons.gem;

import fightstyles.FightStyle;
import weapons.Weapon;

public abstract class Gem extends Weapon {
    private Weapon weapon;
//    public Gem(Weapon weapon) {
//        int gemsSlots = weapon.getMaxGems();
//        if(gemsSlots == 0)
//            throw new IllegalArgumentException("No more gems slots");
//        this.setMaxGems(gemsSlots - 1);
//        this.weapon = weapon;
//    }
    public abstract int hit();
}
