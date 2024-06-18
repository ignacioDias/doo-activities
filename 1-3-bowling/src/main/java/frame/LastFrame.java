package frame;

import java.util.List;

public class LastFrame implements FrameInterface {
    private List<Integer> rolls;
    private boolean hasThirdRoll;

    public LastFrame() {
        hasThirdRoll = false;
    }
    public void roll(int pins) throws IllegalArgumentException {
        checkRoll(pins);
        rolls.add(pins);
        if(score() + pins == 10)
            hasThirdRoll = true;
    }
    private void checkRoll(int pins) throws IllegalArgumentException {
        if(rolls.size() >= 3)
            throw new IllegalArgumentException("All rolls taken");
        int currentScore = score() + pins;
        if(rolls.size() == 2 && !hasThirdRoll || (currentScore > 10 && rolls.size() == 1))
            throw new IllegalArgumentException("Illegal roll");
    }
    public boolean isClosed() {
        return rolls.size() == 3 || (rolls.size() == 2 && !hasThirdRoll);
    }
    public int score() {
        int score = 0;
        for(Integer roll : rolls)
            score += roll;
        return score;
    }
    public int getIthRoll(int roll) {
        return rolls.get(roll);
    }
    public boolean isStrike() {
        return rolls.get(0) == 10;
    }
    public boolean isSpare() {
        return rolls.get(0) + rolls.get(1) == 10 && !isStrike();
    }
}
