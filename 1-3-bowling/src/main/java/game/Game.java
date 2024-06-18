package game;
import frame.Frame;
import frame.FrameInterface;
import frame.LastFrame;

public class Game {

    private FrameInterface[] frames;
    private int currentFrame = 0;

    public Game() {
        frames = new FrameInterface[10];
        frames[9] = new LastFrame();
        frames[8] = new Frame(frames[9]);
        for (int i = 7; i >=0; i--)
            frames[i] = new Frame(frames[i+1], frames[i+2]);
    }
    public void roll(int pins) {
        if (frames[currentFrame].isClosed())
            currentFrame++;
        if (currentFrame >= 10)
            throw new IllegalArgumentException("Illegal roll");
        frames[currentFrame].roll(pins);
    }
    public int score() {
        int score = 0;
        for(FrameInterface frame : frames)
            score += frame.score();
        return score;
    }
}
