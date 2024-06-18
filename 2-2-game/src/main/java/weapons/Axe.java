package weapons;
import fightstyles.FightStyle;

public class Axe extends Weapon {
    public Axe() {
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setMaxGems(1);
    }
    public int hit() {
        return 30;
    }

    @Override
    public String toString() {
        return "Axe";
    }
}
