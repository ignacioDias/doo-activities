package game;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTests {
    @Test
    public void testValidGame() {
        Game game = new Game();
        game.roll(7);
        game.roll(2);

        game.roll(2);
        game.roll(2);
        assertThat(game.score()).isEqualTo(13);
    }
    @Test
    public void testInvalidGameRoll() {
        Game game = new Game();
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    game.roll(12);
                });
        assertThat(exception.getMessage().equals("Illegal roll, frame over 10"));
    }
    @Test
    public void testInvalidFrame() {
        Game game = new Game();
        game.roll(9);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
        () -> {
                    game.roll(2);
                });
        assertThat(exception.getMessage().equals("Illegal roll, frame over 10"));
    }
    @Test
    public void testStrike() {
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(3);
        assertThat(game.score()).isEqualTo(22);
    }
    @Test
    public void testInvalidGame() {
        Game game = new Game();
//        1
        game.roll(10);
//        2
        game.roll(3);
        game.roll(3);
//        3
        game.roll(3);
        game.roll(3);
//        4
        game.roll(3);
        game.roll(3);
//        5
        game.roll(3);
        game.roll(3);
//        6
        game.roll(3);
        game.roll(3);
//        7
        game.roll(3);
        game.roll(3);
//        8
        game.roll(3);
        game.roll(3);
//        9
        game.roll(3);
        game.roll(3);
//        10
        game.roll(3);
        game.roll(3);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
        () -> {
            game.roll(2);
        });
        assertThat(exception.getMessage().equals("Illegal roll, shots over 20"));
    }
    @Test
    public void testExtraShotStrike() {
        Game game = new Game();
        //        1
        game.roll(10);
//        2
        game.roll(3);
        game.roll(3);
//        3
        game.roll(3);
        game.roll(3);
//        4
        game.roll(3);
        game.roll(3);
//        5
        game.roll(3);
        game.roll(3);
//        6
        game.roll(3);
        game.roll(3);
//        7
        game.roll(3);
        game.roll(3);
//        8
        game.roll(3);
        game.roll(3);
//        9
        game.roll(3);
        game.roll(3);
//        10
        game.roll(10);

        game.roll(7);
        game.roll(2);

        assertThat(game.score()).isEqualTo(92);
    }
    @Test
    public void testExtraShotSpare() {
        Game game = new Game();
        //        1
        game.roll(10);
//        2
        game.roll(3);
        game.roll(3);
//        3
        game.roll(3);
        game.roll(3);
//        4
        game.roll(3);
        game.roll(3);
//        5
        game.roll(3);
        game.roll(3);
//        6
        game.roll(3);
        game.roll(3);
//        7
        game.roll(3);
        game.roll(3);
//        8
        game.roll(3);
        game.roll(3);
//        9
        game.roll(3);
        game.roll(3);
//        10
        game.roll(7);
        game.roll(3);

        game.roll(7);

        assertThat(game.score()).isEqualTo(88);
    }
    @Test
    public void invalidExtraShotsSpare() {
        Game game = new Game();
        //        1
        game.roll(10);
//        2
        game.roll(3);
        game.roll(3);
//        3
        game.roll(3);
        game.roll(3);
//        4
        game.roll(3);
        game.roll(3);
//        5
        game.roll(3);
        game.roll(3);
//        6
        game.roll(3);
        game.roll(3);
//        7
        game.roll(3);
        game.roll(3);
//        8
        game.roll(3);
        game.roll(3);
//        9
        game.roll(3);
        game.roll(3);
//        10
        game.roll(7);
        game.roll(3);

        game.roll(7);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    game.roll(1);
                });
        assertThat(exception.getMessage().equals("Illegal shot"));
    }
    @Test
    public void testStrikesOnARow() {
        Game game = new Game();
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(2);
        game.roll(2);
        assertThat(game.score()).isEqualTo(70);
    }

}
