package characters;

import fightstyles.FightStyle;
import weapons.Weapon;

public class Fighter {
    private int life;
    private Weapon weapon;
    private FightStyle fightStyle;
    private String user;
    protected Fighter() {
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getUser() {
        return user;
    }
    public void setWeapon(Weapon weapon) {
        if(!weapon.getFightStyle().equals(fightStyle))
            throw new IllegalArgumentException("Fighter can't have that weapon");
        this.weapon = weapon;
    }
    public void decreaseLife(int hit) {
        this.life -= hit;
    }
    public FightStyle getFightStyle() {
        return fightStyle;
    }
    public void setFightStyle(FightStyle fightStyle) {
        this.fightStyle = fightStyle;
    }

    public int attack() {
        return weapon.hit();
    }
    public boolean isAlive() {
        return life > 0;
    }
    public void attacks(Fighter fighter) {
        fighter.decreaseLife(attack());
    }
    @Override
    public String toString() {
        return getClass().toString().substring(17);
    }

}
