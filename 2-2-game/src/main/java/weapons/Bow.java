package weapons;
import fightstyles.FightStyle;

public class Bow extends Weapon {
    public Bow() {
        this.setFightStyle(FightStyle.DISTANCE);
        this.setMaxGems(1);
    }
    public int hit() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bow";
    }
}
