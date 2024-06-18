package observers;

import characters.Fighter;
import weapons.Weapon;

public class ChangeWeaponObserver implements Observer {
    private Fighter fighter;
    private Weapon oldWeapon;
    private Weapon newWeapon;

    public void updateWinner(Fighter winner) {
    }
    public void updateAttack(Fighter from, int damage, Fighter target) {
    }
    public void updateChangeWeapon(Fighter fighter, Weapon oldWeapon, Weapon newWeapon) {
        this.fighter = fighter;
        this.oldWeapon = oldWeapon;
        this.newWeapon = newWeapon;
        display();
    }
    public void display() {
        if(fighter == null)
            System.out.println("No fighter found");
        else
            System.out.println(fighter + " changed from " + oldWeapon + " to " + newWeapon);
    }
}
