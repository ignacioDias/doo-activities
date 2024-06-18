package characters;
import fightstyles.FightStyle;
import weapons.Bow;

public class Archer extends Fighter {
    public Archer(String user) {
        this.setLife(20);
        this.setFightStyle(FightStyle.DISTANCE);
        this.setWeapon(new Bow());
        this.setUser(user);
    }
    public void dialogue() {
        System.out.println("I'm a Archer");
    }
}
