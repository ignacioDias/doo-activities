package observers;

import characters.Fighter;
import weapons.Weapon;

public class AttackObserver implements Observer {
    private Fighter attacker;
    private int damage;
    private Fighter victim;

    public void updateWinner(Fighter winner) {
    }

    public void updateChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon) {
    }

    public void updateAttack(Fighter attacker, int damage, Fighter victim) {
        this.attacker = attacker;
        this.damage = damage;
        this.victim = victim;
        display();
    }
    public void display() {
        System.out.println(attacker + " hits with " + damage + " damage to: " + victim);
    }
}
