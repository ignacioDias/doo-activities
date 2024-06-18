package observers;

import characters.Fighter;
import subjects.Subject;
import weapons.Weapon;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class AttackObserverFile implements Observer {
    private Fighter attacker;
    private int damage;
    private Fighter victim;
    private File file;

    public AttackObserverFile() {
        try {
            this.file = new File("log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
    private void display() {
        if(attacker != null && victim != null) {
            String log = attacker + " hits with " + damage + " damage to: " + victim;
            writeToLogFile(log);
        }
    }
    private void writeToLogFile(String log) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(log);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
