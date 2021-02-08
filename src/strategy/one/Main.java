package strategy.one;

import strategy.one.controller.ScoreBoard;
import strategy.one.model.Baloon;
import strategy.one.model.Clown;
import strategy.one.model.SquareBaloon;

public class Main {

    public static void main(String [] args){
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score");
        scoreBoard.algorithmBase = new Baloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown tap Score");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon tap Score");
        scoreBoard.algorithmBase = new SquareBaloon();
        scoreBoard.showScore(10, 5);
    }
}
