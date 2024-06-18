package game;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import observers.*;
import org.junit.jupiter.api.Test;
import characters.*;
import weapons.FlameThrower;
import weapons.Sword;
import weapons.Weapon;
import weapons.gem.Emerald;

public class GameTests {
    @Test
    public void testCreateCharacter() {
        Game game = new Game();
        String user = "Nacho";
        game.createCharacter(1, user);
        assertThat(game.findUser(user)).isInstanceOf(Knight.class);
    }
    @Test
    public void testInvalidCreateCharacter() {
        Game game = new Game();
        String user = "Nacho";
        game.createCharacter(1, user);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    game.createCharacter(2, user);
                });
        assertThat(exception.getMessage().equals("Invalid user"));
    }
    @Test
    public void testChangeCharacter() {
        Game game = new Game();
        String user = "Nacho";
        game.createCharacter(1, user);
        game.changeCharacter(2, user);
        assertThat(game.findUser(user)).isInstanceOf(Woodcutter.class);
    }
    @Test
    public void testChangeWeapon() {
        Game game = new Game();
        String user = "Nacho";
        game.createCharacter(1, user);
        ChangeWeaponObserver changeWeaponObserver = new ChangeWeaponObserver();
        ChangeWeaponObserverFile changeWeaponObserverFile = new ChangeWeaponObserverFile();
        game.addObserver(changeWeaponObserverFile);
        game.addObserver(changeWeaponObserver);
        game.changeWeapon(user, new Sword());
        assertThat(game.findUser(user).getWeapon()).isInstanceOf(Sword.class);
    }
    @Test
    public void testInvalidChangeWeapon() {
        Game game = new Game();
        String user = "Nacho";
        game.createCharacter(1, user);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    game.changeWeapon(user, new FlameThrower());
                });
        assertThat(exception.getMessage().equals("Fighter can't have that weapon"));
    }
    @Test
    public void testFight() {
        Game game = new Game();
        String user = "Nacho";
        String user2 = "Rival";
        game.createCharacter(1, user);
        game.createCharacter(1, user2);
        Weapon sword = new Sword();
        sword = new Emerald(sword);
        sword = new Emerald(sword);
        game.changeWeapon(user, sword);
        game.addObserver(new AttackObserver());
        game.addObserver(new AttackObserverFile());
        game.addObserver(new WinnerObserver());
        game.addObserver(new WinnerObserverFile());
        Fighter winner = game.combat(user,user2);
        assertThat(winner).isEqualTo(game.findUser(user));
    }
    @Test
    public void testInvalidFight() {
        Game game = new Game();
        String user = "Nacho";
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    game.changeWeapon(user, new FlameThrower());
                });
        assertThat(exception.getMessage().equals("No fighter"));
    }
}

