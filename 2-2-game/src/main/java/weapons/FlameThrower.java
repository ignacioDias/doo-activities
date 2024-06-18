package weapons;
import fightstyles.FightStyle;

public class FlameThrower extends Weapon {
    public FlameThrower() {
        this.setFightStyle(FightStyle.SPECIAL);
        this.setMaxGems(2);
    }
    public int hit() {
        return 100;
    }

    @Override
    public String toString() {
        return "FlameThrower";
    }
}
