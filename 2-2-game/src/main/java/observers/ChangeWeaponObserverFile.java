package observers;

import characters.Fighter;
import weapons.Weapon;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeWeaponObserverFile implements Observer {
    private Fighter fighter;
    private Weapon oldWeapon;
    private Weapon newWeapon;
    File file;

    public ChangeWeaponObserverFile() {
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
    public void updateAttack(Fighter from, int damage, Fighter target) {
    }

    public void updateChangeWeapon(Fighter fighter, Weapon oldWeapon, Weapon newWeapon) {
        this.fighter = fighter;
        this.oldWeapon = oldWeapon;
        this.newWeapon = newWeapon;
        display();
    }

    public void display() {
        if(fighter != null && newWeapon != null && oldWeapon != null) {
            String log = fighter + " changed from " + oldWeapon + " to " + newWeapon;
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
