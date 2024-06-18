package game;

import characters.*;
import subjects.Subject;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Game extends Subject {
    List<Fighter> fighters = new ArrayList<>();
    public Game() {
    }
    public void createCharacter(int type, String user) {
        Fighter fighter;
        if(alreadyExistsUser(user))
            throw new IllegalArgumentException("Illegal attempt to add an already existing user");
        if(type == 1)
            fighter = new Knight(user);
        else if(type == 2)
            fighter = new Woodcutter(user);
        else if(type == 3)
            fighter = new Archer(user);
        else
            fighter = new Assassin(user);
        fighters.add(fighter);
    }
    private boolean alreadyExistsUser(String user) {
        for(Fighter fighter : fighters) {
            if(fighter.getUser().equals(user))
                return true;
        }
        return false;
    }
    public void changeCharacter(int type, String user) {
        Fighter fighter = findUser(user);
        fighters.remove(fighter);
        createCharacter(type, user);
    }
    public void changeWeapon(String user, Weapon newWeapon) {
        Fighter fighter = findUser(user);
        Weapon oldWeapon = fighter.getWeapon();
        fighter.setWeapon(newWeapon);
        notifyChangeWeapon(fighter,oldWeapon,newWeapon);
    }
    protected Fighter findUser(String user) {
        int cant = 0;
        Fighter target = null;
        for(Fighter fighter : fighters) {
            if(fighter.getUser().equals(user)) {
                cant++;
                target = fighter;
            }
        }
        if(cant != 1)
            throw new IllegalArgumentException("Incorrect User");
        return target;
    }
    public Fighter combat(String user1, String user2) {
        Fighter fighter1 = findUser(user1);
        Fighter fighter2 = findUser(user2);
        Fighter winner = fight(fighter1, fighter2);
        notifyWinner(winner);
        return winner;
    }
    private Fighter fight(Fighter fighter1, Fighter fighter2) {
        while(fighter1.isAlive() && fighter2.isAlive()) {
            fighter2.attacks(fighter1);
            notifyAttack(fighter2, fighter2.attack(), fighter1);
            if(!fighter1.isAlive())
                break;
            fighter1.attacks(fighter2);
            notifyAttack(fighter2, fighter1.attack(), fighter2);
        }
        if(fighter1.isAlive())
            return fighter1;
        else
            return fighter2;
    }
}
