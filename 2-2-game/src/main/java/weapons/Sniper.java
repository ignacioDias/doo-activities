package weapons;
import fightstyles.FightStyle;


public class Sniper extends Weapon {
    public Sniper() {
        this.setFightStyle(FightStyle.DISTANCE);
        this.setMaxGems(3);
    }

    @Override
    public int hit() {
        return 100;
    }

    @Override
    public String toString() {
        return "Sniper";
    }
}
