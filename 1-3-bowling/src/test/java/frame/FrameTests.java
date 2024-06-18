package frame;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class FrameTests {
    private FrameInterface[] frames;
    @BeforeEach
    protected void setUp() {
        frames = new FrameInterface[10];
        frames[9] = new LastFrame();
        frames[8] = new Frame(frames[9]);
        for (int i = 7; i >=0; i--)
            frames[i] = new Frame(frames[i+1], frames[i+2]);
    }
    @Test
    public void testValidFrame() {
        frames[8].roll(4);
        frames[8].roll(4);
        frames[9].roll(3);
        frames[9].roll(2);
        assertThat(frames[0].score()).isEqualTo(8);
    }
    @Test
    public void testInvalidFrame() {
        LastFrame lastFrame = new LastFrame();
        Frame frame1 = new Frame(lastFrame);
        Frame frame = new Frame(frame1, lastFrame);
        frame.roll(4);
        IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    frame.roll(9);
                });
        assertThat(exception.getMessage().equals("Illegal roll, frame over 10"));
    }
    @Test
    public void testValidStrike() {
        LastFrame lastFrame = new LastFrame();
        Frame frame1 = new Frame(lastFrame);
        Frame frame = new Frame(frame1, lastFrame);
        frame.roll(10);
        frame.roll(0);
        assertThat(frame.isStrike()).isEqualTo(true);
    }
    @Test
    public void testInvalidStrike() {
        LastFrame lastFrame = new LastFrame();
        Frame frame1 = new Frame(lastFrame);
        Frame frame = new Frame(frame1, lastFrame);
        frame.roll(0);
        frame.roll(10);
        assertThat(frame.isStrike()).isEqualTo(false);
    }
    @Test
    public void testValidSpare() {
        LastFrame lastFrame = new LastFrame();
        Frame frame1 = new Frame(lastFrame);
        Frame frame = new Frame(frame1, lastFrame);
        frame.roll(1);
        frame.roll(9);
        assertThat(frame.isSpare()).isEqualTo(true);
    }
    @Test
    public void testInvalidSpare() {
        LastFrame lastFrame = new LastFrame();
        Frame frame1 = new Frame(lastFrame);
        Frame frame = new Frame(frame1, lastFrame);
        frame.roll(10);
        frame.roll(0);
        assertThat(frame.isSpare()).isEqualTo(false);
    }
}
