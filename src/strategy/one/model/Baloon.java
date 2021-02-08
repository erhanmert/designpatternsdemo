package strategy.one.model;

import strategy.one.controller.ScoreAlgorithmBase;

public class Baloon extends ScoreAlgorithmBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) -20;
    }
}
