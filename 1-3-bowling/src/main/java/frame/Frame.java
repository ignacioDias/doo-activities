package frame;
import java.util.ArrayList;
import java.util.List;

public class Frame implements FrameInterface {
    private List<Integer> rolls;
    private FrameInterface nextFrame;
    private FrameInterface nextNextFrame;
    public Frame(FrameInterface nextFrame) {
        rolls = new ArrayList<>();
        this.nextFrame = nextFrame;
    }
    public Frame(FrameInterface nextFrame, FrameInterface nextNextFrame) {
        rolls = new ArrayList<>();
        this.nextFrame = nextFrame;
        this.nextNextFrame = nextNextFrame;
    }
    public boolean isClosed() {
        return rolls.size() == 2;
    }
    public void roll(int pins) throws IllegalArgumentException {
        if(pins < 0 || pins + score() > 10 || (rolls.size() >= 2))
            throw new IllegalArgumentException("Illegal roll");
        if(rolls.isEmpty() && pins == 10) {
            rolls.add(pins);
            roll(0);
        } else
            rolls.add(pins);
    }
    public int score() {
        int score = 0;
        for(Integer roll : rolls)
            score += roll;
        if(isStrike() && nextFrame.isStrike() && !(nextFrame instanceof LastFrame))
            score += 10 + nextNextFrame.getIthRoll(0);
        else if(isStrike() && nextFrame.isStrike() && (nextFrame instanceof LastFrame))
            score += nextFrame.getIthRoll(0) + nextFrame.getIthRoll(1);
        else if(isStrike())
            score += nextFrame.score();
        else if(isSpare())
            score += nextFrame.getIthRoll(0);
        return score;
    }
    public int getIthRoll(int roll) {
        return rolls.get(roll);
    }
    public boolean isStrike() {
        return rolls.get(0) == 10 && rolls.get(1) == 0;
    }
    public boolean isSpare() {
        return score() == 10 && !isStrike();
    }
}
