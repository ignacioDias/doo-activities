package characters;
import fightstyles.FightStyle;
import weapons.*;
public class Knight extends Fighter {
    public Knight(String user) {
        this.setLife(100);
        this.setFightStyle(FightStyle.CLOSE_RANGE);
        this.setWeapon(new Sword());
        this.setUser(user);
    }
    public void dialogue() {
        System.out.println("Hello, i'm a fighter");
    }
}
