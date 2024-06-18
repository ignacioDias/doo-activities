package observers;

import characters.Fighter;
import subjects.Subject;
import weapons.Weapon;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WinnerObserver implements Observer {
    private Fighter winner;
    private File file;
    public WinnerObserver() {
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
        this.winner = winner;
        display();
    }

    public void updateChangeWeapon(Fighter user, Weapon oldWeapon, Weapon newWeapon) {
    }

    public void updateAttack(Fighter from, int damage, Fighter target) {
    }

    private void display() {
        if(winner != null) {
            String log = ("The winner is " + winner);
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
