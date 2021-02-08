package template.model;

import template.Game;

public class EndlessRunnerGame extends Game {
    @Override
    protected void initialize() {
        System.out.println("enddles initialize");
    }

    @Override
    protected void startPlay() {
        System.out.println("enddles start");
    }

    @Override
    protected void endPlay() {
        System.out.println("enddles ending");
    }

    @Override
    protected void addNewCharacterToGame() {

    }
}
