package weapons;
import fightstyles.FightStyle;

public class Sword extends Weapon {
    public Sword() {
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setMaxGems(2);
    }
    public int hit() {
        return 40;
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
