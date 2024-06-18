package characters;
import fightstyles.FightStyle;
import weapons.Sword;
public class Assassin extends Fighter {
    public Assassin(String user) {
        this.setUser(user);
        this.setLife(40);
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setWeapon(new Sword());
    }
    public void dialogue() {
        System.out.println("I'm a assassin");
    }
}
