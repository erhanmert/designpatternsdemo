package command;

import command.model.*;

public class Main {
    public static void main(String [] args){
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("mario");


        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);


        GameBoy gameBoy = new GameBoy(marioUpCommand,marioDownCommand,marioLeftCommand,marioRightCommand);

        gameBoy.arrowDown();
        gameBoy.arrowLeft();
        gameBoy.arrowRight();
        gameBoy.arrowUp();
    }
}
