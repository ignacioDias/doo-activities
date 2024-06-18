package weapons;
import fightstyles.FightStyle;

public class Punch extends Weapon {
    public Punch() {
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setMaxGems(0);
    }
    public int hit() {
        return 1;
    }

    @Override
    public String toString() {
        return "Hands, no weapon";
    }
}
