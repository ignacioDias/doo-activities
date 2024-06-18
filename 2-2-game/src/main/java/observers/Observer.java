package observers;

import characters.Fighter;
import weapons.Weapon;

public interface Observer {
    public void updateWinner(Fighter winner);
    public void updateChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon);
    public void updateAttack(Fighter from, int damage, Fighter target);
}
