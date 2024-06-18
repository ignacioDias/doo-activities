package weapons;
import fightstyles.FightStyle;

public abstract class Weapon {
    private FightStyle fightStyle;
    private int maxGems;
    public  Weapon() {
    }
    public Weapon(FightStyle fightStyle) {
        this.fightStyle = fightStyle;
    }
    public int getMaxGems() {
        return maxGems;
    }
    public FightStyle getFightStyle() {
        return fightStyle;
    }
    public void setMaxGems(int maxGems) {
        this.maxGems = maxGems;
    }
    public void setFightStyle(FightStyle fightStyle) {
        this.fightStyle = fightStyle;
    }
    public abstract int hit();
}
