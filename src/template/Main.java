package template;

import template.model.EndlessRunnerGame;
import template.model.FootballGame;

public class Main {
    public static void main(String [] args){
        Game football = new FootballGame();
        football.play();

        Game endless = new EndlessRunnerGame();
        endless.play();
    }
}
