package observers;

import characters.Fighter;
import subjects.Subject;
import weapons.Weapon;

public class WinnerObserverFile implements Observer {
    private Fighter winner;

    public void updateChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon) {
    }
    public void updateAttack(Fighter from, int damage, Fighter target) {
    }

    public void updateWinner(Fighter winner) {
        this.winner = winner;
        display();
    }
    private void display() {
        if(winner == null)
            System.out.println("No winner found");
        else
            System.out.println("The winner is " + winner);
    }
}
