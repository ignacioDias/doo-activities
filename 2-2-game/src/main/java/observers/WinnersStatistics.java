package observers;
import characters.Fighter;
import subjects.Subject;
import weapons.Weapon;

import java.util.HashMap;
import java.util.Map;
public class WinnersStatistics implements Observer {
    private Map<Fighter,Integer> winsPerFighter = new HashMap<>();
    private Map<Weapon,Integer> winsPerWeapon = new HashMap<>();

    public void updateWinner(Fighter winner) {
            winsPerFighter.put(winner, pointsFighter(winner) + 1);
            Weapon weapon = winner.getWeapon();
            winsPerWeapon.put(weapon, pointsWeapon(weapon) + 1);
        display();
    }
    private Integer pointsFighter(Fighter fighter) {
        return winsPerFighter.getOrDefault(fighter, 0);
    }

    private Integer pointsWeapon(Weapon weapon) {
        return winsPerWeapon.getOrDefault(weapon, 0);
    }
    private void display() {
        System.out.println("Win statistics per fighter:");
        for (Map.Entry<Fighter, Integer> entry : winsPerFighter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " wins");
        }

        System.out.println("Win statistics per weapon:");
        for (Map.Entry<Weapon, Integer> entry : winsPerWeapon.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " wins");
        }
    }
    public void updateChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon) {
    }
    public void updateAttack(Fighter from, int damage, Fighter target) {
    }
}
