package frame;

public interface FrameInterface {
    public void roll(int pins) throws IllegalArgumentException;
    public int score();
    public int getIthRoll(int roll);
    public boolean isStrike();
    public boolean isClosed();
    public boolean isSpare();
}
