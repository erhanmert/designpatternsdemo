package command.model;

import command.interfaces.Command;

public class MarioDownCommand  implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioDownCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveDown();
    }
}
