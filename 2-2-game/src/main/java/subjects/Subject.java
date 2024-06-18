package subjects;
import characters.Fighter;
import observers.Observer;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyAttack(Fighter from, int damage, Fighter target) {
        for (Observer observer : observers) {
            observer.updateAttack(from, damage, target);
        }
    }
    public void notifyChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon) {
        for(Observer observer : observers) {
            observer.updateChangeWeapon(user, oldWeapon, newWeapon);
        }
    }
    public void notifyWinner(Fighter winner) {
        for (Observer observer : observers) {
            observer.updateWinner(winner);
        }
    }
}
