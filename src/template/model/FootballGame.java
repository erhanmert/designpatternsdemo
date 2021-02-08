package template.model;

import template.Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FootballGame extends Game {
    @Override
    public void initialize() {
        System.out.println("football initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("football start");
    }

    @Override
    public void endPlay() {
        System.out.println("football end");
    }

    @Override
    protected void addNewCharacterToGame() {

    }


}
