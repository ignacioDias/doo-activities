package characters;
import fightstyles.FightStyle;
import weapons.Axe;
public class Woodcutter extends Fighter {
    public Woodcutter(String user) {
        this.setUser(user);
        this.setLife(100);
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setWeapon(new Axe());
    }
    public void dialogue() {
        System.out.println("I'm a woodcutter");
    }
}
