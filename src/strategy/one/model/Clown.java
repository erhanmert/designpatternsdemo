package strategy.one.model;

import strategy.one.controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier ) -10;
    }
}
